package com.masroufi.api.controller;

import com.masroufi.api.dto.UserDetailsDto;
import com.masroufi.api.dto.UserPasswordDto;
import com.masroufi.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    @Qualifier("UserServiceImp")
    private UserService userService;

    @GetMapping("/details")
    UserDetailsDto getMyProfileDetails() {
        return this.userService.getMyProfileDetails();
    }

    @PutMapping("/details")
    UserDetailsDto updateMyProfileDetails(@RequestBody UserDetailsDto userDetailsDto) {
        return this.userService.updateMyProfileDetails(userDetailsDto);
    }

    @PutMapping("/password")
    UserDetailsDto updateMyProfilePassword(@RequestBody @Valid UserPasswordDto userPasswordDto) {
        return this.userService.updateMyPassword(userPasswordDto);
    }
}
