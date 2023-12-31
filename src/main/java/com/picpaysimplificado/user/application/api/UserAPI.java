package com.picpaysimplificado.user.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public interface UserAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UserResponse saveUser(@RequestBody UserRequest userRequest);

}
