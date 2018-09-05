package priv.zjay.main.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ArticleController {

	@Resource(name="contractAddress")
	private String address;
	
	//登陆页面
	@RequestMapping("/articledetail")
	public String login() {
		return "article/articledetail";  
	}
}
