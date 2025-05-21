package com.memorycloud.mc.application.port.out;

import java.util.List;

import com.memorycloud.mc.domain.model.UserModel;

public interface UserRepositoryPort {
  List<UserModel> findAll();
}
