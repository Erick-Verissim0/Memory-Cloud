package com.memorycloud.mc.adapters.in.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserController {
  @GetMapping()
  public String getAllUsers() {
    return "Olá mundo!";
  }
}
