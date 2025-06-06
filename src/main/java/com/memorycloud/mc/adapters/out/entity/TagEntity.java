package com.memorycloud.mc.adapters.out.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tags")
public class TagEntity {

  @Id
  @GeneratedValue(generator = "UUID")
  @Column(updatable = false, nullable = false)
  private UUID id;

  @Column(nullable = false, unique = true, length = 50)
  private String name;

  public TagEntity() {
  }

  public TagEntity(UUID id, String name) {
    this.id = id;
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
