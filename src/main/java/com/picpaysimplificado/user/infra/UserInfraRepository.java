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

    @Override
    public User salva(User user) {
        return null;
    }
}
