package com.memorycloud.mc.application.port.in.users;

import java.util.Optional;
import java.util.UUID;

import com.memorycloud.mc.domain.model.UserModel;

public interface GetOneUserUseCase {
  Optional<UserModel> getOneUser(UUID id);
}
