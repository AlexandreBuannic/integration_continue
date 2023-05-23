package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class LoginPageController {

@GetMapping("/login")

public String login(){

return "account/login";

}

@GetMapping("/account/home")

public String home(){

return "account/home";

}

}