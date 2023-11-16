package com.example.JavaPreProjectActivity3_1_2.controller;

import com.example.JavaPreProjectActivity3_1_2.model.User;
import com.example.JavaPreProjectActivity3_1_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersConroller {
    private final UserService userService;

    @Autowired
    public UsersConroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String printUsers(
            Model model, @RequestParam(name = "id",
            required = false) Integer userId) {
        model.addAttribute("users", userService.printUsers());
        return "users";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        return "new";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(name = "id") int id) {
        model.addAttribute("user", userService.showUserById(id));
        return "edit";
    }

    @PostMapping
    public String update(@ModelAttribute("user") User user, @RequestParam(name = "id") int id) {
        userService.save(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    public String delete(@RequestParam(name = "id") int id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
