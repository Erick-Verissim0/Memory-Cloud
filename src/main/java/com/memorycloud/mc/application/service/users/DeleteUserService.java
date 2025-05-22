package com.memorycloud.mc.application.service.users;

import java.util.UUID;

import com.memorycloud.mc.application.port.in.users.DeleteUserUseCase;
import com.memorycloud.mc.application.port.out.UserRepositoryPort;

public class DeleteUserService implements DeleteUserUseCase {
  private final UserRepositoryPort userRepositoryPort;

  public DeleteUserService(UserRepositoryPort userRepositoryPort) {
    this.userRepositoryPort = userRepositoryPort;
  }

  @Override
  public void deleteUser(UUID id) {
    userRepositoryPort.deleteUser(id);
  }
}
