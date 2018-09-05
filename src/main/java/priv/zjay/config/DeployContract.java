package priv.zjay.config;

import java.math.BigInteger;

import javax.annotation.Resource;

import org.bcos.channel.client.Service;
import org.bcos.contract.tools.ToolConf;
import org.bcos.web3j.crypto.Credentials;
import org.bcos.web3j.crypto.GenCredential;
import org.bcos.web3j.protocol.Web3j;
import org.bcos.web3j.protocol.channel.ChannelEthereumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import priv.zjay.bcos.Test;

@Configuration
@Order(2)
public class DeployContract {

	@Resource(name="context")
	private ApplicationContext context;
	
	@Bean("contractAddress")
	public String getContractAddress() {
		try {
			Service service = context.getBean(Service.class);
			service.run();
			Thread.sleep(2000);
			System.out.println("start deploy contract...");
			ChannelEthereumService channelEthereumService = new ChannelEthereumService();
			channelEthereumService.setChannelService(service);
	
			Web3j web3 = Web3j.build(channelEthereumService);
	//		EthBlockNumber ethBlockNumber = web3.ethBlockNumber().sendAsync().get();
	
			ToolConf toolConf=context.getBean(ToolConf.class);
			//初始化交易签名私钥
			Credentials credentials = GenCredential.create(toolConf.getPrivKey());
	
			//初始化交易参数
			java.math.BigInteger gasPrice = new BigInteger("30000000");
			java.math.BigInteger gasLimit = new BigInteger("30000000");
			java.math.BigInteger initialWeiValue = new BigInteger("0");
	
			//部署合约
			Test test = Test.deploy(web3,credentials,gasPrice,gasLimit,initialWeiValue).get();
			System.out.println("contract depolyed succeed..address:" + test.getContractAddress());
			return test.getContractAddress();
		}catch(Exception e) {
			e.printStackTrace();
			return "";
		}
	}
}
