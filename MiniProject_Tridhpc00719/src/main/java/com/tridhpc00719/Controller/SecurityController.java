package com.tridhpc00719.Controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
@RequestMapping("/security/login/form")
public String loginform(Model model) {
	model.addAttribute("message", "vui lòng đăng nhập");
	return "security/login";
	
}
@RequestMapping("/security/login/success")
public String loginsuccess(Model model) {
	model.addAttribute("message", " đăng nhập thành công");
	return "redirect:/product/list";
	
}
@RequestMapping("/security/login/error")
public String loginerror(Model model) {
	model.addAttribute("message", " sai thông tin đăng nhập");
	return "security/login";
	
}
@RequestMapping("/security/logoff")
public String loginlogoff(Model model) {
	model.addAttribute("message", " đăng xuất thành công");
	return  "Redirect:/product/list";
	
}

}
