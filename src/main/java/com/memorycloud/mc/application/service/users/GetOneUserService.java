package com.memorycloud.mc.application.service.users;

import java.util.Optional;
import java.util.UUID;

import com.memorycloud.mc.application.port.in.users.GetOneUserUseCase;
import com.memorycloud.mc.application.port.out.UserRepositoryPort;
import com.memorycloud.mc.domain.model.UserModel;

public class GetOneUserService implements GetOneUserUseCase {

  private final UserRepositoryPort userRepositoryPort;

  public GetOneUserService(UserRepositoryPort userRepositoryPort) {
    this.userRepositoryPort = userRepositoryPort;
  }

  @Override
  public Optional<UserModel> getOneUser(UUID id) {
    return userRepositoryPort.findOne(id)
        .filter(user -> user.getDeletedAt() == null);
  }
}
