package com.picpaysimplificado.user.application.service;

import com.picpaysimplificado.user.application.api.UserRequest;
import com.picpaysimplificado.user.application.api.UserResponse;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);
}
