package com.picpaysimplificado.user.infra;

import com.picpaysimplificado.user.application.respository.UserRepository;
import com.picpaysimplificado.user.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UserInfraRepository implements UserRepository {


    private final UserSpringDataJPA userSpringDataJPA;

    @Override
    public User salva(User user) {
        log.info("[inicia] UserInfraRepository - salva");
        userSpringDataJPA.save(user);
        log.info("[finaliza] UserInfraRepository - salva");
        return user;
    }
}
