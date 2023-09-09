package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.services.UserServiceImpl;

import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminController {

    private final UserServiceImpl userServiceImpl;

    @Autowired
    public AdminController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping
    public String getUsers(Model model) {

        List<User> users = userServiceImpl.findAllUsers();
        model.addAttribute("users", users);
        return "admin/users";
    }

    @PostMapping("/new")
    public String createUser(User user, @RequestParam String userRole) {
        System.out.println(userRole);
        userServiceImpl.createUser(user, userRole);
        return "redirect:/admin";
    }

    @GetMapping("{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        userServiceImpl.deleteUserById(id);
        return "redirect:/admin";
    }

    @GetMapping("/{id}")
    public String updateUserForm(@PathVariable Long id,
                                 Model model) {
        User user = userServiceImpl.findUserById(id);
        model.addAttribute("user", user);
        return "admin/usersEdit";
    }

    @PostMapping("/{id}")
    public String updateUser(User user) {
        userServiceImpl.updateUser(user);
        return "redirect:/admin";
    }

}

