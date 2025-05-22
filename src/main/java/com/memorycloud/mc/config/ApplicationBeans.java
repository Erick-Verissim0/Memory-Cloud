package com.memorycloud.mc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.memorycloud.mc.application.port.in.users.DeleteUserUseCase;
import com.memorycloud.mc.application.port.in.users.GetAllUsersUseCase;
import com.memorycloud.mc.application.port.in.users.GetOneUserUseCase;
import com.memorycloud.mc.application.service.users.DeleteUserService;
import com.memorycloud.mc.application.service.users.GetAllUsersService;
import com.memorycloud.mc.application.service.users.GetOneUserService;
import com.memorycloud.mc.application.port.out.UserRepositoryPort;

@Configuration
public class ApplicationBeans {
  @Bean
  GetOneUserUseCase getOneUserUseCase(UserRepositoryPort userRepositoryPort) {
    return new GetOneUserService(userRepositoryPort);
  }

  @Bean
  GetAllUsersUseCase getAllUsersUseCase(UserRepositoryPort userRepositoryPort) {
    return new GetAllUsersService(userRepositoryPort);
  }

  @Bean
  DeleteUserUseCase deleteUserUseCase(UserRepositoryPort userRepositoryPort) {
    return new DeleteUserService(userRepositoryPort);
  }
}
