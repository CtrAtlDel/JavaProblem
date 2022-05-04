package com.beerworld.ivankvasov.googlePhotozClone;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.lang.module.ResolutionException;
import java.util.*;

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
        Photo photo = db.get(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo;
    }

    @DeleteMapping("/photoz/{id}")
    public void delete(@PathVariable String id) {
        Photo photo = db.remove(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/photoz/")
    public Photo create(Photo photo) {
        //We shoul create id, because front end cannot create the id
        //We will use a long String
        photo.setId(UUID.randomUUID().toString());
        db.put(photo.getId(), photo);
        return photo;
    }
}
