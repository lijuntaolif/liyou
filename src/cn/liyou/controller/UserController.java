package cn.liyou.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.liyou.pojo.User;

import cn.liyou.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userServic;
	@RequestMapping("/ulist")
	public String selectUserAll(Model model){
		List<User> list=new ArrayList<User>();
		list=userServic.getAllUser();
		model.addAttribute("ulist", list);
		System.out.println(".........................");
		return "ulist";
	}
	
}
