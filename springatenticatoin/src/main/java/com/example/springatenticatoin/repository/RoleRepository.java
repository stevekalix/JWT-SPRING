package com.example.springatenticatoin.repository;




import java.util.Optional;

import com.example.springatenticatoin.model.ERole;
import com.example.springatenticatoin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}