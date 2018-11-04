package com.ua.sutty.springboot.service;

import com.ua.sutty.springboot.form.UserForm;
import com.ua.sutty.springboot.model.Role;
import com.ua.sutty.springboot.model.State;
import com.ua.sutty.springboot.model.User;
import com.ua.sutty.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void signUp(UserForm userForm) {
        String hashPassword = passwordEncoder.encode(userForm.getPassword());
        User user = User.builder()
                .username(userForm.getUsername())
                .password(hashPassword)
                .email(userForm.getEmail())
                .role(Role.USER)
                .state(State.ACTIVE)
                .build();

        userRepository.save(user);
    }
}