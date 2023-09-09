package ru.kata.spring.boot_security.demo.services;


import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    void createUser(User user, String userRole);

    List<User> findAllUsers();

    public User findUserById(Long id);

    public void deleteUserById(Long id);

    public void updateUser(User user);


    public User findUserByUserName(String userName);
}
