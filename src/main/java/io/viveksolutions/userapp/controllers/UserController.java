package io.viveksolutions.userapp.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "Get Method is Called";
    }

    @PostMapping
    public String createUsers() {
        return "Create Method is Called";
    }

    @PutMapping
    public String updateUsers() {
        return "Update Method is Called";
    }

    @DeleteMapping
    public String deleteUsers() {
        return "Delete Method is Called";
    }

}
