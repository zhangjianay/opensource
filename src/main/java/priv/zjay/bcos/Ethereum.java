package priv.zjay.bcos;
import java.math.BigInteger;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.bcos.channel.client.Service;
import org.bcos.contract.tools.ToolConf;
import org.bcos.web3j.abi.datatypes.Address;
import org.bcos.web3j.abi.datatypes.generated.Uint160;
import org.bcos.web3j.abi.datatypes.generated.Uint256;
import org.bcos.web3j.crypto.Credentials;
import org.bcos.web3j.crypto.GenCredential;
import org.bcos.web3j.protocol.Web3j;
import org.bcos.web3j.protocol.channel.ChannelEthereumService;
import org.bcos.web3j.protocol.core.methods.response.TransactionReceipt;

public class Ethereum {
	static Logger logger = LoggerFactory.getLogger(Ethereum.class);
	
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Service service = context.getBean(Service.class);
		service.run();
		System.out.println("start...");
		System.out.println("===================================================================");

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
//		Test test = Test.deploy(web3,credentials,gasPrice,gasLimit,initialWeiValue).get();
//		System.out.println("Ok getContractAddress " + test.getContractAddress());
		
		String okAddress = "0x7c7c67c9721b43902d56bf9df4d393d005a29ba2";
		Test ok = Test.load(okAddress, web3, credentials, gasPrice, gasLimit);
		java.math.BigInteger value = new BigInteger("1");
		Address a = new Address(value);
		System.out.println(a.toString());
		System.out.println(UUID.randomUUID().toString());
		//调用合约接口
//		java.math.BigInteger Num = new BigInteger("333");
//		Uint256 num = new Uint256(Num);
//		System.out.println("num=================" + num.getValue());
//		TransactionReceipt receipt = ok.set(a, num).get();
//		System.out.println("receipt transactionHash::::::::::::" + receipt.getTransactionHash());

		//查询合约数据
		System.out.println("ok.get() " + ok.get(a).get().getValue());
	}
}