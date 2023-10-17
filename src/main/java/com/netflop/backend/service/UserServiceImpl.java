package com.netflop.backend.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String getUser() {

        return "hello BRO";
    }
}
