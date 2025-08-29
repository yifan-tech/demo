package com.example.demo.controller;


import com.example.demo.entity.user.UserInfo;
import com.example.demo.service.user.UserService;
import com.example.demo.service.user.dto.UserInfoDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserInfo> addUser(@RequestBody @Valid UserInfoDto userInfoDto) {
        System.out.println(userInfoDto);
        return ResponseEntity.ok(userService.addUser(userInfoDto));
    }

}
