package com.tsl.Tera_imbere.repository;

import com.tsl.Tera_imbere.model.EmailDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailDetailsRepository extends JpaRepository<EmailDetails, Long> {
    EmailDetails findEmailDetailsById(Long id);
}
