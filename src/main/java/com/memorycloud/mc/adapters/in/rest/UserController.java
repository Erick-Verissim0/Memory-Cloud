package com.memorycloud.mc.adapters.in.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.memorycloud.mc.application.port.in.users.DeleteUserUseCase;
import com.memorycloud.mc.application.port.in.users.GetAllUsersUseCase;
import com.memorycloud.mc.application.port.in.users.GetOneUserUseCase;
import com.memorycloud.mc.domain.model.UserModel;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/users")
public class UserController {

  private final GetAllUsersUseCase getAllUsersUseCase;
  private final GetOneUserUseCase getOneUserUseCase;
  private final DeleteUserUseCase deleteUserUseCase;

  public UserController(GetAllUsersUseCase getAllUsersUseCase, GetOneUserUseCase getOneUserUseCase, DeleteUserUseCase deleteUserUseCase) {
    this.getAllUsersUseCase = getAllUsersUseCase;
    this.getOneUserUseCase = getOneUserUseCase;
    this.deleteUserUseCase = deleteUserUseCase;
  }

  @GetMapping()
  public List<UserModel> getAllUsers() {
    return getAllUsersUseCase.getAllUsers();
  }

  @GetMapping("/{id}")
  public ResponseEntity<UserModel> getUserById(@PathVariable UUID id) {
    return getOneUserUseCase.getOneUser(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

   @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        deleteUserUseCase.deleteUser(id);
    }
}
