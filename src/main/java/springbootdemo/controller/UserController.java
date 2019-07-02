package springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootdemo.entity.domain.User;
import springbootdemo.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService UserService;

    @RequestMapping("/login")
    public Optional<User> login(Long id){
        return UserService.findById(id);
    }
}
