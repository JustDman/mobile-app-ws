package com.appsdeveloperblog.app.ws.mobileappws.ui.controller;

import com.appsdeveloperblog.app.ws.mobileappws.ui.model.response.UserRest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public String getUser(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "50") int limit, @RequestParam(value = "sort", required = false, defaultValue = "desc") String sort) {

        return "get user was called with page = " + page + " and limit = " + limit + " and sort = " + sort;
    }

    @GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public UserRest getUser(@PathVariable String userId) {

        UserRest returnValue = new UserRest();
        returnValue.setEmail("test@test.com");
        returnValue.setFirstName("Dominic");
        returnValue.setLastName("Hofer");
        returnValue.setUserId(userId);
        return returnValue;
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
