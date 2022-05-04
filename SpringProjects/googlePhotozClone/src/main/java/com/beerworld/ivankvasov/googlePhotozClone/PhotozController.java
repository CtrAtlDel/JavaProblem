package com.beerworld.ivankvasov.googlePhotozClone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PhotozController {
    private Map<String, Photo> db = new HashMap<>(){{
       put("1", new Photo("1", "hello.jpg"));
    }};

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/photoz") // return all photo
    public Collection<Photo> get() {
        return  db.values();
    }

    @GetMapping("/photoz/{id}") // retrun photo by id
    public Photo get(@PathVariable String id) {
        return db.get(id);
    }
}
