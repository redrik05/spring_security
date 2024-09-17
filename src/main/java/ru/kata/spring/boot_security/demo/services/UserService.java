package ru.kata.spring.boot_security.demo.services;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

@Service
public interface UserService {

    void create(User user);

    void update(User user);

    void delete(Long id);

    User getById(Long id);

    User getByUsername(String username);

    List<User> findAllUsers();

    boolean isUserExist(User user);
}
