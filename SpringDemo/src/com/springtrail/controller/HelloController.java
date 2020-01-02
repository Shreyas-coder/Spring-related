package com.springtrail.controller;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class HelloController {
	@Resource(name="Userservice")
	private UserService Userservice;

//	@RequestMapping(method=RequestMethod.GET)
//	public ModelAndView welcome(){
//		return new ModelAndView("welcomePage", "welcomeMessage", "Welcome to Spring MVC World!!!");
//	}
	
	@RequestMapping(value = {"/welcomePage"}, method = RequestMethod.GET)
	public String getPersons(Model model) {
		
		User calculatedBMI= 	Userservice.BMICalculator();	
		model.addAttribute("name", calculatedBMI.getName());
		model.addAttribute("BMI", calculatedBMI.BMI);
		return "welcomePage";
	}
	@RequestMapping(value = {"/employee"} , method =RequestMethod.GET)
	public ModelAndView listEmployee()
	{
		System.out.println("Controller Employee");
		LinkedList<String> list = getList();
		ModelAndView map = new ModelAndView("Employee");
		return map.addObject("lists", list);
	}
	
	public LinkedList<String> getList()
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("Kohli");
		list.add("Rohit");
		list.add("KL Rahul");
		return list;
		
	}
	
	
	
	
	
	
}