package com.memorycloud.mc.application.service.users;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.memorycloud.mc.application.port.in.users.GetAllUsersUseCase;
import com.memorycloud.mc.application.port.out.UserRepositoryPort;
import com.memorycloud.mc.domain.model.UserModel;

@Service
public class GetAllUsersService implements GetAllUsersUseCase {
  private final UserRepositoryPort userRepositoryPort;

  public GetAllUsersService(UserRepositoryPort userRepositoryPort) {
    this.userRepositoryPort = userRepositoryPort;
  }

  @Override
  public List<UserModel> getAllUsers() {
    List<UserModel> users = userRepositoryPort.findAll();

    List<UserModel> activeUsers = users.stream().filter(date -> date.getDeletedAt() == null).collect(Collectors.toList());

    return activeUsers;
  }
}
