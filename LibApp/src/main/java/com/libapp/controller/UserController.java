package com.libapp.controller;

import com.libapp.entity.User;
import com.libapp.entity.request.AddUserRequest;
import com.libapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by akshayshivanne on 4/22/2017.
 */

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    @CrossOrigin(origins = "http://localhost:4200")
    List<User> home() {
        List<User> users = findAllUsers();

        return users;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void adduser(@RequestBody AddUserRequest addUserRequest){
        User user = new User();
        user.setUsername(addUserRequest.getUserName());
        user.setPassword(addUserRequest.getPassword());
        userRepository.save(user);
    }

}
