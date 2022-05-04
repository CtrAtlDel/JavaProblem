package com.beerworld.ivankvasov.googlePhotozClone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotozController {

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }
}
