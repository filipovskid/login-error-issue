package com.filipovskid.loginerrorissue.rest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class TestErrorController implements ErrorController {

  @GetMapping("/error")
  public void error(Principal principal) {
    // Principal is set (not null).
    System.out.println("Test");
  }
}
