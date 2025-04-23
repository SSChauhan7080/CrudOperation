package com.crud.CrudTask.Service;

import com.crud.CrudTask.Entity.User;
import com.crud.CrudTask.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User saveEntry(User user){
        return userRepository.save(user);

    }
}
