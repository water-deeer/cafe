package com.cafe.waterdeer.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestUserController {
    private User user;
    private final UserRepository userRepository;

    public TestUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/create")
    public String create(){
        user= new User();
        user.setId(2);
        user.setUserId("qwert");
        user.setUserPw("aa123");
        user.setEmail("asd@gmail.com");
        userRepository.save(user);
        return user.toString();
    }
    @GetMapping("/delete")
    public void delete(){
        userRepository.deleteById(1);
    }
}
