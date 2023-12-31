package com.picpaysimplificado.user.application.service;

import com.picpaysimplificado.user.application.api.UserRequest;
import com.picpaysimplificado.user.application.api.UserResponse;
import com.picpaysimplificado.user.application.respository.UserRepository;
import com.picpaysimplificado.user.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserApplicationService implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.info("[inicia] ClienteApplicationService - criaCliente");
        User user = userRepository.salva(new User(userRequest));
        log.info("[finaliza] ClienteApplicationService - criaCliente");
        return null;
    }
}
