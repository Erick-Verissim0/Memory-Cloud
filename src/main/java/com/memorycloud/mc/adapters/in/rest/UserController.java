package com.memorycloud.mc.adapters.in.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.memorycloud.mc.application.port.in.GetAllUsersUseCase;
import com.memorycloud.mc.domain.model.UserModel;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserController {

  private final GetAllUsersUseCase getAllUsersUseCase;

  public UserController(GetAllUsersUseCase getAllUsersUseCase) {
    this.getAllUsersUseCase = getAllUsersUseCase;
  }

  @GetMapping()
  public List<UserModel> getAllUsers() {
    return getAllUsersUseCase.getAllUsers();
  }
}
