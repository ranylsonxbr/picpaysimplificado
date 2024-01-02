package com.picpaysimplificado.user.application.service;

import com.picpaysimplificado.user.application.api.UserRequest;
import com.picpaysimplificado.user.application.api.UserResponse;
import com.picpaysimplificado.user.application.respository.UserRepository;
import com.picpaysimplificado.user.domain.User;
import com.picpaysimplificado.user.infra.UserInfraRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserApplicationService implements UserService {

    private final UserInfraRepository userInfraRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        log.info("[inicia] ClienteApplicationService - criaCliente");
        User user = userInfraRepository.salva(new User(userRequest));
        log.info("[finaliza] ClienteApplicationService - criaCliente");
        return UserResponse.builder()
                .idUser(user.getId())
                .build();
    }
}
