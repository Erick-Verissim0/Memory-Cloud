package com.memorycloud.mc.application.port.in.users;

import java.util.List;

import com.memorycloud.mc.domain.model.UserModel;

public interface GetAllUsersUseCase {
  List<UserModel> getAllUsers();
}


