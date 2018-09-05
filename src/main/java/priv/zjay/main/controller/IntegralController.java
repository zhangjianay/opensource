package priv.zjay.main.controller;

import java.math.BigInteger;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.bcos.channel.client.Service;
import org.bcos.contract.tools.ToolConf;
import org.bcos.web3j.abi.datatypes.Address;
import org.bcos.web3j.abi.datatypes.generated.Uint256;
import org.bcos.web3j.crypto.Credentials;
import org.bcos.web3j.crypto.GenCredential;
import org.bcos.web3j.protocol.Web3j;
import org.bcos.web3j.protocol.channel.ChannelEthereumService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import priv.zjay.bcos.Test;


@Controller
public class IntegralController {

	@Resource(name="contractAddress")
	private String address;
	
	@Resource(name="context")
	private ApplicationContext context;
	
	//积分页面
	@RequestMapping("/integral")
	public String integral(Model model, HttpServletRequest request) {
		try {
			Service service = context.getBean(Service.class);
			ChannelEthereumService channelEthereumService = new ChannelEthereumService();
			channelEthereumService.setChannelService(service);
			Web3j web3 = Web3j.build(channelEthereumService);
			ToolConf toolConf=context.getBean(ToolConf.class);
			//初始化交易签名私钥
			Credentials credentials = GenCredential.create(toolConf.getPrivKey());
			//初始化交易参数
			java.math.BigInteger gasPrice = new BigInteger("30000000");
			java.math.BigInteger gasLimit = new BigInteger("30000000");
			Test ok = Test.load(address, web3, credentials, gasPrice, gasLimit);
			Object userId = request.getSession().getAttribute("userId");
			java.math.BigInteger key = new BigInteger(userId.toString());
			Address a = new Address(key);
			BigInteger value = ok.get(a).get().getValue();
			model.addAttribute("value", value);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "integral/integral";  
	}
	
	//签到
	@RequestMapping("/sign")
	@ResponseBody
	public String sign(Model model, HttpServletRequest request) {
		BigInteger value = new BigInteger("0");
		try {
			Service service = context.getBean(Service.class);
			ChannelEthereumService channelEthereumService = new ChannelEthereumService();
			channelEthereumService.setChannelService(service);
			Web3j web3 = Web3j.build(channelEthereumService);
			ToolConf toolConf=context.getBean(ToolConf.class);
			//初始化交易签名私钥
			Credentials credentials = GenCredential.create(toolConf.getPrivKey());
			//初始化交易参数
			java.math.BigInteger gasPrice = new BigInteger("30000000");
			java.math.BigInteger gasLimit = new BigInteger("30000000");
			Test ok = Test.load(address, web3, credentials, gasPrice, gasLimit);
			Object userId = request.getSession().getAttribute("userId");
			java.math.BigInteger key = new BigInteger(userId.toString());
			Address a = new Address(key);
			value = ok.get(a).get().getValue();
			Double d = Math.random()*10;
			BigInteger signScore = new BigInteger(d.intValue()+"");
			Uint256 num = new Uint256(value.add(signScore));
			ok.set(a, num);
			value = ok.get(a).get().getValue();
		}catch(Exception e) {
			e.printStackTrace();
			value = new BigInteger("0");
		}
		return value.toString();  
	}
}
