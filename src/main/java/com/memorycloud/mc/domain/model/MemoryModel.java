package com.memorycloud.mc.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class MemoryModel {

  private UUID id;
  private UserModel user;
  private String title;
  private String description;
  private String emotion;
  private LocalDate dateOfEvent;
  private String location;
  private String mediaUrl;
  private String mediaType;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime deletedAt;

  public MemoryModel() {
  }

  public MemoryModel(UUID id, UserModel user, String title, String description, String emotion, LocalDate dateOfEvent,
      String location, String mediaUrl, String mediaType,
      LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt) {
    this.id = id;
    this.user = user;
    this.title = title;
    this.description = description;
    this.emotion = emotion;
    this.dateOfEvent = dateOfEvent;
    this.location = location;
    this.mediaUrl = mediaUrl;
    this.mediaType = mediaType;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.deletedAt = deletedAt;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserModel getUser() {
    return user;
  }

  public void setUser(UserModel user) {
    this.user = user;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getEmotion() {
    return emotion;
  }

  public void setEmotion(String emotion) {
    this.emotion = emotion;
  }

  public LocalDate getDateOfEvent() {
    return dateOfEvent;
  }

  public void setDateOfEvent(LocalDate dateOfEvent) {
    this.dateOfEvent = dateOfEvent;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public LocalDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(LocalDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }
}
