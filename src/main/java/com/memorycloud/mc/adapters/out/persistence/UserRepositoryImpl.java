package com.memorycloud.mc.adapters.out.persistence;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.memorycloud.mc.adapters.out.entity.UserEntity;
import com.memorycloud.mc.domain.model.UserModel;
import com.memorycloud.mc.domain.port.out.UserRepositoryPort;

@Component
public class UserRepositoryImpl implements UserRepositoryPort {

  private final UserJpaRepository userJpaRepository;

  UserRepositoryImpl(UserJpaRepository userJpaRepository) {
    this.userJpaRepository = userJpaRepository;
  }

  @Override
  public List<UserModel> findAll() {
    return userJpaRepository.findAll().stream().map(this::toModel).collect(Collectors.toList());
  }

  private UserModel toModel(UserEntity entity) {
    return new UserModel(
        entity.getId(),
        entity.getName(),
        entity.getEmail(),
        entity.getPassword(),
        entity.getType(),
        entity.getCreatedAt(),
        entity.getUpdatedAt(),
        entity.getDeletedAt()
        );
  }
}
