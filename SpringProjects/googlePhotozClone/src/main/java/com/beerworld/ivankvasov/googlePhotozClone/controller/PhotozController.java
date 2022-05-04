package com.beerworld.ivankvasov.googlePhotozClone.controller;

import com.beerworld.ivankvasov.googlePhotozClone.model.Photo;
import com.beerworld.ivankvasov.googlePhotozClone.service.PhotozService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Collection;

@RestController
public class PhotozController {

    private final PhotozService photozService;

    public PhotozController(PhotozService photozService) {
        this.photozService = photozService;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/photoz") // return all photo
    public Collection<Photo> get() {
        return photozService.get();
    }

    @GetMapping("/photoz/{id}") // retrun photo by id
    public Photo get(@PathVariable String id) {
        Photo photo = photozService.get(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo;
    }

    @DeleteMapping("/photoz/{id}")
    public void delete(@PathVariable String id) {
        Photo photo = photozService.remove(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/photoz/")
    public Photo create(@RequestPart("data") MultipartFile file) throws IOException {
        return photozService.save(file.getOriginalFilename(), file.getContentType(), file.getBytes());
    }

    //    @PostMapping("/photoz/")
    //    public Photo create(@RequestBody @Valid Photo photo) { //we need requst body annotation^ because JSON need to convert JSIN
    //        //We shoul create id, because front end cannot create the id
    //        //We will use a long String
    //        photo.setId(UUID.randomUUID().toString());
    //        db.put(photo.getId(), photo);
    //        return photo;
    //    }

}
