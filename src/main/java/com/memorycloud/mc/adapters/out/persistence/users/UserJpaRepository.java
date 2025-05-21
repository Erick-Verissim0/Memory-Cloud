package com.memorycloud.mc.adapters.out.persistence.users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memorycloud.mc.adapters.out.entity.UserEntity;

public interface UserJpaRepository extends JpaRepository<UserEntity, UUID> {

}
