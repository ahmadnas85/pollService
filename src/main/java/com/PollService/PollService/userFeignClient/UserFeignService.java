package com.PollService.PollService.userFeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service",
    url = "http://localhost:8080")
public interface UserFeignService {
    @GetMapping("/user/get")
    UserResponce getUserById(@RequestParam Long userId);
}
