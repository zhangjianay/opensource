package priv.zjay.bcos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.bcos.channel.client.Service;
import org.bcos.channel.dto.ChannelRequest;
import org.bcos.channel.dto.ChannelResponse;

public class Channel2Client {
	static Logger logger = LoggerFactory.getLogger(Channel2Client.class);
	
	public static void main(String[] args) throws Exception {
		if(args.length < 2) {
			System.out.println("param: target topic         total number of request");
			return;
		}
		String topic = args[0];
		Integer count = Integer.parseInt(args[1]);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		logger.debug("init client");

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		Service service = context.getBean(Service.class);
		service.run();
		
		System.out.println("3s ...");
		Thread.sleep(1000);
		System.out.println("2s ...");
		Thread.sleep(1000);
		System.out.println("1s ...");
		Thread.sleep(1000);

		System.out.println("start test");
		System.out.println("===================================================================");
		
		for(Integer i = 0; i < count; ++i) {
			Thread.sleep(2000);
			ChannelRequest request = new ChannelRequest();
			request.setToTopic(topic);
			request.setMessageID(service.newSeq());
			request.setTimeout(5000);
			
			request.setContent("request seq:" + request.getMessageID());
			
			System.out.println(df.format(LocalDateTime.now()) + " request seq:" + String.valueOf(request.getMessageID()) + ", Content:" + request.getContent());
			
			ChannelResponse response = service.sendChannelMessage2(request);
			
			System.out.println(df.format(LocalDateTime.now()) + "response seq:" + String.valueOf(response.getMessageID()) + ", ErrorCode:" + response.getErrorCode() + ", Content:" + response.getContent());
		}
	}
}
