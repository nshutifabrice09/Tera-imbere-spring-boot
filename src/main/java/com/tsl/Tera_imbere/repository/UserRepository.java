package com.tsl.Tera_imbere.repository;

import com.tsl.Tera_imbere.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByEmail(String email);

}
