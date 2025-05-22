package com.memorycloud.mc.application.port.out;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.memorycloud.mc.domain.model.UserModel;

public interface UserRepositoryPort {
  List<UserModel> findAll();

  void deleteUser(UUID id);

  Optional<UserModel> findOne(UUID id);
}
