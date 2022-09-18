package com.example.spring2datasource.controller;

import com.example.spring2datasource.dao.user.UserRepository;
import com.example.spring2datasource.dto.user.UserDto;
import com.example.spring2datasource.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostMapping
    public ResponseEntity<UserDto> add(@RequestBody UserDto userDto){
        User user = new User();
        user.setAge(userDto.getAge());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setStatus(userDto.isStatus());
        user.setPossessionList(null);
        var result = userRepository.save(user);
        userDto.setId(result.getId());
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<User>> list(){
        List<User> result = userRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
