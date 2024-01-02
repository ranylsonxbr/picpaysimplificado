package com.picpaysimplificado.user.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class UserResponse {
    private UUID idUser;
}
