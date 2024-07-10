package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		HttpSession session = req.getSession(true);
		String name = req.getParameter("name");
		System.out.println("hi" + name + "welcome to my home page");
		session.setAttribute("name", name);
		return "home";
	}
}
