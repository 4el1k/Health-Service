package ru.itis.healthserviceimpl.controller;

import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.healthserviceapi.dto.request.UserSave;
import ru.itis.healthserviceapi.dto.request.UserUpdate;
import ru.itis.healthserviceapi.dto.response.UserResponse;
import ru.itis.healthserviceimpl.service.UserService;

import java.util.UUID;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserViewController {
    private final UserService userService;

    @GetMapping("/create")
    public String createUserForm() {
        return "create_user";
    }

    @PostMapping("/create")
    public String createUser(UserSave userSave, Model model) {
        userService.create(userSave);
        return "redirect:/user/details/" + userSave.username();
    }

    @GetMapping("/details/{username}")
    public String userDetails(@PathVariable String username, Model model) {
        UserResponse user = userService.findByUsername(username);
        model.addAttribute("user", user);
        return "user_details";
    }

    @GetMapping("/update/{username}")
    public String updateUserForm(@PathVariable String username, Model model) {
        UserResponse user = userService.findByUsername(username);
        model.addAttribute("user", user);
        return "update_user";
    }

    @PostMapping("/update")
    public String updateUser(UserUpdate userUpdate) {
        userService.update(userUpdate, UUID.randomUUID());
        return "redirect:/user/details/" + userUpdate.firstname();
    }

    @PostMapping("/delete/{username}")
    public String deleteUser(@PathVariable String username) {
        userService.deleteById(UUID.randomUUID());
        return "redirect:/";
    }
}
