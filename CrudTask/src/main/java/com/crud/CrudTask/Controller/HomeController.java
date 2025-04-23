package com.crud.CrudTask.Controller;

import com.crud.CrudTask.Entity.User;
import com.crud.CrudTask.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

    @Autowired
    UserService userService;

        @PostMapping("/user")
        public User addUser(@RequestBody User user){
            System.out.println("Received User: " + user); // Debug print
        return userService.saveEntry(user);
        }

}
