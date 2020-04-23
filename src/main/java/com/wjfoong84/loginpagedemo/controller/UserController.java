package com.wjfoong84.loginpagedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Invalid userid or password.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
	
	 @GetMapping({"/", "/welcome"})
	 public String welcome(Model model) {
		 return "welcome";
	 }
	
}
