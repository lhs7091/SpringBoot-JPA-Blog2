package com.company.workspace.service;

import com.company.workspace.model.RoleType;
import com.company.workspace.model.User;
import com.company.workspace.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public int signUp(User user){
        try {
            user.setRole(RoleType.USER);
            userRepository.save(user);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("UserService : signUp() : "+e.getMessage());
        }
        return -1;
    }
}
