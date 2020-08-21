package com.company.workspace.controller.api;

import com.company.workspace.dto.ResponseDto;
import com.company.workspace.model.User;
import com.company.workspace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/auth/signupProc")
    public ResponseDto<Integer> save(@RequestBody User user){
        System.out.println("UserApiController : call save method");
        userService.signUp(user);
        return new ResponseDto<Integer>(HttpStatus.OK, 1);
    }

}
