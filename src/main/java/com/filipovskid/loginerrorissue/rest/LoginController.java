package com.filipovskid.loginerrorissue.rest;

import ch.qos.logback.core.model.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String showLoginForm(Model model) {
    return "login";
  }

  @GetMapping("/test")
  public String test(Principal principal) {
    // Principal is set (not null).
    throw new RuntimeException("error");
  }
}
