package com.proppop.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
    public String home() {
		Date date = new Date();
		return "Hello World.0.0.2! date = " + date.toString();
    }
	
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void addEmployee(@RequestParam(value = "firstName", required = false) String employeeName,
            				@RequestParam(value = "lastName", required = false) String employeeId,
            				@RequestParam(value = "email", required = false) String employeeCity) {
    	
    	System.out.println("------------------------------------------------------------------------------Submit button is wired to this restController, yippie");
    }
}
