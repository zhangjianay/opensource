package priv.zjay.bcos;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.bcos.channel.client.Service;

public class TestAMOPServer {
	static Logger logger = LoggerFactory.getLogger(TestAMOPServer.class);
	
	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Service service = context.getBean(Service.class);
		//设置topic，支持多个topic
		List<String> topics = new ArrayList<String>();
		topics.add("zjay");
		service.setTopics(topics);
		
		//处理消息的PushCallback类，参见Callback代码
		PushCallback cb = new PushCallback();
		service.setPushCallback(cb);
		service.run();
	}
}