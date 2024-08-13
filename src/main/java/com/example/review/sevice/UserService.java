package com.example.review.sevice;


import com.example.review.entity.User;
import com.example.review.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    /** 사용자 등록 */
    User registerUser(User user);



}
