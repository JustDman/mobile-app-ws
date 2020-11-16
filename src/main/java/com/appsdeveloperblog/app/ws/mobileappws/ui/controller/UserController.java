package com.appsdeveloperblog.app.ws.mobileappws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public String getUser(@RequestParam(value="page", defaultValue="1") int page, @RequestParam(value="limit", defaultValue="50") int limit) {

        return "get user was called with page = " + page + " and limit = " + limit;
    }

    @GetMapping(path="/{userId}")
    public String getUser(@PathVariable String userId) {
        return "get user was called with userId = " + userId;
    }

    @PostMapping
    public String createUser() {
        return "create user was called";
    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}
