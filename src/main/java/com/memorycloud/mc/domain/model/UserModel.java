package com.memorycloud.mc.domain.model;

import java.time.LocalDateTime;

public class UserModel {
  private Long id;
  private String name;
  private String email;
  private String password;
  private LocalDateTime created_at;
  private LocalDateTime updated_at;
  private LocalDateTime deleted_at;

  public UserModel() {
  }

  public UserModel(
    Long id, String name, String email, String password, LocalDateTime created_at, LocalDateTime updated_at,
    LocalDateTime deleted_at) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.created_at = created_at;
    this.updated_at = updated_at;
    this.deleted_at = deleted_at;
  }

  public Long getId() {
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

  public LocalDateTime getCreatedAt() {
    return created_at;
  }

  public LocalDateTime getUpdatedAt() {
    return updated_at;
  }

  public LocalDateTime getDeletedAt() {
    return deleted_at;
  }
}
