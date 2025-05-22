package com.memorycloud.mc.application.service.users;

import java.util.List;
import java.util.stream.Collectors;

import com.memorycloud.mc.application.port.in.users.GetAllUsersUseCase;
import com.memorycloud.mc.application.port.out.UserRepositoryPort;
import com.memorycloud.mc.domain.model.UserModel;

public class GetAllUsersService implements GetAllUsersUseCase {
  private final UserRepositoryPort userRepositoryPort;

  public GetAllUsersService(UserRepositoryPort userRepositoryPort) {
    this.userRepositoryPort = userRepositoryPort;
  }

  @Override
  public List<UserModel> getAllUsers() {
    return userRepositoryPort.findAll()
      .stream()
      .filter(user -> user.getDeletedAt() == null)
      .collect(Collectors.toList());
  }
}
