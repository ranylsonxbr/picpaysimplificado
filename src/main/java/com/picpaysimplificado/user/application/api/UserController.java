package com.picpaysimplificado.user.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class UserController implements UserAPI {
    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.info("[inicia] UserController - createUser");
        log.info("[finaliza] UserController - createUser");

        return null;
    }

}
