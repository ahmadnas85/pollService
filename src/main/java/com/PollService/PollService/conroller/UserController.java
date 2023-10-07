package com.PollService.PollService.conroller;

import com.PollService.PollService.userFeignClient.UserFeignService;
import com.PollService.PollService.userFeignClient.UserResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserFeignService userFeignService;
    @GetMapping("/get")
    public UserResponce getUserById(@RequestParam Long userId){
        return userFeignService.getUserById(userId);
    }
}
