package com.caketopia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

	@GetMapping("/")
	public String landing() {
		return "/home";
	}

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

	@GetMapping("/gallery")
	public String gallery() {
		return "/gallery";
	}

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/blog")
    public String blog() {
        return "/blog";
    }

	@GetMapping("/menu")
	public String menu() {
		return "/menu";
	}
	@GetMapping("/contact")
	public String contact() {
		return "/contact";
	}


    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

}
