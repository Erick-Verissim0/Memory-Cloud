package com.memorycloud.mc.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserModel {
  private UUID id;
  private String name;
  private String email;
  private String password;
  private String type;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime deletedAt;

  public UserModel() {
  }

  public UserModel(
      UUID id, String name, String email, String password, String type,
      LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.type = type;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.deletedAt = deletedAt;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getType() {
    return type;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public LocalDateTime getDeletedAt() {
    return deletedAt;
  }
}
