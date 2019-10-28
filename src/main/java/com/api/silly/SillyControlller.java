package com.api.silly;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SillyControlller {

    @GetMapping("/hello")
    public String shout() {
        return "Yooooooo!";
    }

}
