package com.springdemo.laba5.services;

import com.springdemo.laba5.entities.User;
import com.springdemo.laba5.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
     User save(UserRegistrationDto registrationDto);
}
