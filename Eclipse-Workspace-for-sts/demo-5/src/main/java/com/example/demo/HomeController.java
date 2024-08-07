package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String guestName) {
		ModelAndView mymodelandview = new ModelAndView();
		System.out.print("Controller called");
		mymodelandview.addObject("name", guestName);
		mymodelandview.setViewName("home.jsp");
		return mymodelandview;
	}
}
