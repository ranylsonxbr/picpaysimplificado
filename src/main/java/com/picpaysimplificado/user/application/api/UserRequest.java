package com.picpaysimplificado.user.application.api;

import com.picpaysimplificado.user.domain.UserType;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class UserRequest {

    String firstName;
    String lastName;
    String document;
    String email;
    String password;
    BigDecimal balance;
    UserType userType;

}
