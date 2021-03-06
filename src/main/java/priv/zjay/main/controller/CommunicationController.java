package priv.zjay.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CommunicationController {

	@RequestMapping("/friend")
	@ResponseBody
	public String friend() {
		return "{\r\n" + 
				"    \"status\": 1,\r\n" + 
				"    \"msg\": \"ok\",\r\n" + 
				"    \"data\": [\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"销售部\",\r\n" + 
				"            \"nums\": 36,\r\n" + 
				"            \"id\": 1,\r\n" + 
				"            \"item\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100001\",\r\n" + 
				"                    \"name\": \"郭敬明\",\r\n" + 
				"                    \"face\": \"img/a5.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100002\",\r\n" + 
				"                    \"name\": \"作家崔成浩\",\r\n" + 
				"                    \"face\": \"img/a6.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"1000022\",\r\n" + 
				"                    \"name\": \"韩寒\",\r\n" + 
				"                    \"face\": \"img/a7.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"10000222\",\r\n" + 
				"                    \"name\": \"范爷\",\r\n" + 
				"                    \"face\": \"img/a8.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100002222\",\r\n" + 
				"                    \"name\": \"小马哥\",\r\n" + 
				"                    \"face\": \"img/a9.jpg\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"大学同窗\",\r\n" + 
				"            \"nums\": 16,\r\n" + 
				"            \"id\": 2,\r\n" + 
				"            \"item\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"1000033\",\r\n" + 
				"                    \"name\": \"苏醒\",\r\n" + 
				"                    \"face\": \"img/a9.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"10000333\",\r\n" + 
				"                    \"name\": \"马云\",\r\n" + 
				"                    \"face\": \"img/a8.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100003\",\r\n" + 
				"                    \"name\": \"鬼脚七\",\r\n" + 
				"                    \"face\": \"img/a7.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100004\",\r\n" + 
				"                    \"name\": \"谢楠\",\r\n" + 
				"                    \"face\": \"img/a6.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100005\",\r\n" + 
				"                    \"name\": \"徐峥\",\r\n" + 
				"                    \"face\": \"img/a5.jpg\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"H+后台主题\",\r\n" + 
				"            \"nums\": 38,\r\n" + 
				"            \"id\": 3,\r\n" + 
				"            \"item\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100006\",\r\n" + 
				"                    \"name\": \"柏雪近在它香\",\r\n" + 
				"                    \"face\": \"img/a4.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100007\",\r\n" + 
				"                    \"name\": \"罗昌平\",\r\n" + 
				"                    \"face\": \"img/a3.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100008\",\r\n" + 
				"                    \"name\": \"Crystal影子\",\r\n" + 
				"                    \"face\": \"img/a2.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100009\",\r\n" + 
				"                    \"name\": \"艺小想\",\r\n" + 
				"                    \"face\": \"img/a1.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100010\",\r\n" + 
				"                    \"name\": \"天猫\",\r\n" + 
				"                    \"face\": \"img/a8.jpg\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"100011\",\r\n" + 
				"                    \"name\": \"张泉灵\",\r\n" + 
				"                    \"face\": \"img/a7.jpg\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}\r\n" + 
				"";  
	}
	
	@RequestMapping("/group")
	@ResponseBody
	public String group() {
		return "{\r\n" + 
				"    \"status\": 1,\r\n" + 
				"    \"msg\": \"ok\",\r\n" + 
				"    \"data\": [\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"H+交流群\",\r\n" + 
				"            \"nums\": 36,\r\n" + 
				"            \"id\": 1,\r\n" + 
				"            \"item\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"101\",\r\n" + 
				"                    \"name\": \"H+ Bug反馈\",\r\n" + 
				"                    \"face\": \"http://tp2.sinaimg.cn/2211874245/180/40050524279/0\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"102\",\r\n" + 
				"                    \"name\": \"H+ 技术交流\",\r\n" + 
				"                    \"face\": \"http://tp3.sinaimg.cn/1820711170/180/1286855219/1\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Bootstrap\",\r\n" + 
				"            \"nums\": 16,\r\n" + 
				"            \"id\": 2,\r\n" + 
				"            \"item\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"103\",\r\n" + 
				"                    \"name\": \"Bootstrap中文\",\r\n" + 
				"                    \"face\": \"http://tp2.sinaimg.cn/2211874245/180/40050524279/0\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"104\",\r\n" + 
				"                    \"name\": \"Bootstrap资源\",\r\n" + 
				"                    \"face\": \"http://tp3.sinaimg.cn/1820711170/180/1286855219/1\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"WebApp\",\r\n" + 
				"            \"nums\": 106,\r\n" + 
				"            \"id\": 3,\r\n" + 
				"            \"item\": [\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"105\",\r\n" + 
				"                    \"name\": \"移动开发\",\r\n" + 
				"                    \"face\": \"http://tp2.sinaimg.cn/2211874245/180/40050524279/0\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"id\": \"106\",\r\n" + 
				"                    \"name\": \"H5前言\",\r\n" + 
				"                    \"face\": \"http://tp3.sinaimg.cn/1820711170/180/1286855219/1\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}\r\n" + 
				"";  
	}
	
	@RequestMapping("/chatlog")
	@ResponseBody
	public String chatlog() {
		return "{\r\n" + 
				"    \"status\": 1,\r\n" + 
				"    \"msg\": \"ok\",\r\n" + 
				"    \"data\": [\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100001\",\r\n" + 
				"            \"name\": \"Beaut-zihan\",\r\n" + 
				"            \"time\": \"10:23\",\r\n" + 
				"            \"face\": \"img/a1.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100002\",\r\n" + 
				"            \"name\": \"慕容晓晓\",\r\n" + 
				"            \"time\": \"昨天\",\r\n" + 
				"            \"face\": \"img/a2.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"1000033\",\r\n" + 
				"            \"name\": \"乔峰\",\r\n" + 
				"            \"time\": \"2014-4.22\",\r\n" + 
				"            \"face\": \"img/a3.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"10000333\",\r\n" + 
				"            \"name\": \"高圆圆\",\r\n" + 
				"            \"time\": \"2014-4.21\",\r\n" + 
				"            \"face\": \"img/a4.jpg\"\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}\r\n" + 
				"";  
	}
	
	@RequestMapping("/groups")
	@ResponseBody
	public String login() {
		return "{\r\n" + 
				"    \"status\": 1,\r\n" + 
				"    \"msg\": \"ok\",\r\n" + 
				"    \"data\": [\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100001\",\r\n" + 
				"            \"name\": \"無言的蒁説\",\r\n" + 
				"            \"face\": \"img/a1.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100002\",\r\n" + 
				"            \"name\": \"婷宝奢侈品\",\r\n" + 
				"            \"face\": \"img/a2.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100003\",\r\n" + 
				"            \"name\": \"忆恨思爱\",\r\n" + 
				"            \"face\": \"img/a3.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100004\",\r\n" + 
				"            \"name\": \"天涯奥拓慢\",\r\n" + 
				"            \"face\": \"img/a4.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100005\",\r\n" + 
				"            \"name\": \"雨落无声的天空\",\r\n" + 
				"            \"face\": \"img/a5.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100006\",\r\n" + 
				"            \"name\": \"李越LycorisRadiate\",\r\n" + 
				"            \"face\": \"img/a6.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100007\",\r\n" + 
				"            \"name\": \"冯胖妞张直丑\",\r\n" + 
				"            \"face\": \"img/a7.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100008\",\r\n" + 
				"            \"name\": \"陈龙hmmm\",\r\n" + 
				"            \"face\": \"img/a8.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100009\",\r\n" + 
				"            \"name\": \"别闹哥胆儿小\",\r\n" + 
				"            \"face\": \"img/a9.jpg\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": \"100010\",\r\n" + 
				"            \"name\": \"锅锅锅锅萌哒哒 \",\r\n" + 
				"            \"face\": \"img/a10.jpg\"\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}\r\n" + 
				"";  
	}
}
