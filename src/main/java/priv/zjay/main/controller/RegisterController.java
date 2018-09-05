package priv.zjay.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import priv.zjay.main.service.UserService;
import priv.zjay.utils.QString;


@Controller
public class RegisterController {

	@Autowired
	private UserService userService;
	
	/**
	 * 注册
	 * @param username
	 * @param password
	 * @param request
	 * @param resp
	 * @return
	 */
	@RequestMapping("/newRegister")
	public String login(@RequestParam(value="userName",defaultValue="") String userName,
			@RequestParam(value="password",defaultValue="") String password,
			Model model, HttpServletRequest request) {
		if(QString.IsNullOrEmpty(userName) && QString.IsNullOrEmpty(password)) {
			return "redirect:register";
		}
		//验证用户名 密码
		Long[] flag = null;
		try {
			flag = userService.insertUser(userName, password);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", "远程服务连接失败！");
			return "login/register";
		}
		if(flag[0] == 0) {
			request.getSession().setAttribute("userId", flag[1]);
			request.getSession().setAttribute("userName", userName);
			return "redirect:integral";
		}else {
			model.addAttribute("errorMsg", "用户名重复！");
			return "login/register";
		}
	}
}
