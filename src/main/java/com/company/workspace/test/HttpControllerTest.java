package com.company.workspace.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {

    private static final String TAG = "HttpControllerTest";

    @GetMapping("/test/lombok")
    public String lombokTest(){
        Member m = Member.builder().id(3000).password("1234").build();
        System.out.println(TAG+"getter : "+m.getId());
        m.setId(5000);
        System.out.println(TAG+"getter : "+m.getId());

        return "get Request: "+m.getId()+","+m.getPassword();
    }

}
