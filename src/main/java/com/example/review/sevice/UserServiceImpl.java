package com.example.review.sevice;

import com.example.review.entity.User;
import com.example.review.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }
}
