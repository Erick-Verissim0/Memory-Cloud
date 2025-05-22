package com.memorycloud.mc.adapters.out.persistence.users;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.memorycloud.mc.adapters.out.entity.UserEntity;
import com.memorycloud.mc.application.port.out.UserRepositoryPort;
import com.memorycloud.mc.domain.model.UserModel;

@Component
public class UserRepositoryImpl implements UserRepositoryPort {

  private final UserJpaRepository userJpaRepository;

  public UserRepositoryImpl(UserJpaRepository userJpaRepository) {
    this.userJpaRepository = userJpaRepository;
  }

  @Override
  public List<UserModel> findAll() {
    return userJpaRepository.findAll().stream().map(this::toModel).collect(Collectors.toList());
  }

  @Override
  public void deleteUser(UUID id) {
    userJpaRepository.findById(id).ifPresent(user -> {
      user.setDeletedAt(LocalDateTime.now());
      userJpaRepository.save(user);
    });
  }

  @Override
  public Optional<UserModel> findOne(UUID id) {
    return userJpaRepository.findById(id).map(this::toModel);
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
