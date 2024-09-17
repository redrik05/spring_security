package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getRoleByName(String name);
}
