package com.jobiak.mvcjsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.jobiak.mvcjsp.model.Register;
import com.jobiak.mvcjsp.repository.RegisterRepository;


@Controller
public class RegistrationController
{
	@Autowired
	  RegisterRepository repo;
	public RegistrationController()
	{
		
	}
	public RegistrationController(RegisterRepository repo) 
	{
		this.repo = repo;
	}
	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String redirect()
	{
		return "registration";
	}
	@RequestMapping(path="/registration",method=RequestMethod.POST)
	public String doRegister(@ModelAttribute("register")Register register)
	{
		System.out.println(register.getId()+register.getFname()+register.getLname()+register.getDob()+register.getMail()+register.getPassword());
		return "success";
	}
}
