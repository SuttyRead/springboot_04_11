package com.ua.sutty.springboot.service;

import com.ua.sutty.springboot.repository.UserRepository;
import com.ua.sutty.springboot.security.details.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> userCandidate = usersRepository.findOneByLogin(login);
//        if (userCandidate.isPresent()){
//            return new UserDetailsImpl(userCandidate.get());
//        }else {
//            throw new IllegalArgumentException("User not found");
//        }
        return new
                UserDetailsImpl(usersRepository.findOneByUsername(username).
                orElseThrow(IllegalArgumentException::new));
    }
}
