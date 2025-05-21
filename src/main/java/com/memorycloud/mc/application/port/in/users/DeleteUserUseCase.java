package com.memorycloud.mc.application.port.in.users;

import java.util.UUID;

public interface DeleteUserUseCase {
  void deleteUser(UUID id);
}
