package com.picpaysimplificado.user.infra;


import com.picpaysimplificado.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserSpringDataJPA extends JpaRepository<User, UUID> {

}
