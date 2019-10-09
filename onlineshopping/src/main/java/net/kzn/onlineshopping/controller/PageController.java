package net.kzn.onlineshopping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;



@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(@RequestParam(name="logout",required=false)String logout) {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Home");		
		
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;				
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Login");
		mv.addObject("userClickLogin",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/register")
	public ModelAndView register() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Register");
		mv.addObject("userClickRegister",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;				
	}	
	
	
	
	
	
}
