package com.picpaysimplificado.user.application.api;

import com.picpaysimplificado.user.application.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UserController implements UserAPI {

    private final UserService userService;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.info("[inicia] UserController - createUser");
        UserResponse createdUser = userService.createUser(userRequest);
        log.info("[finaliza] UserController - createUser");
        return null;
    }

}
