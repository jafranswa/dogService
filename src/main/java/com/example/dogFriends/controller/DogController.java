package com.example.dogFriends.controller;

import com.example.dogFriends.model.Dog;
import com.example.dogFriends.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DogController {

    @Autowired
    DogService dogService;

    @PostMapping("/dog")
    Dog createDog(@RequestBody Dog newdog){
        return dogService.save(newdog);
    }

    @GetMapping("/dog")
    Iterable<Dog> findAllDogs(){
        return dogService.findAll();
    }

    @PutMapping("/dog")
    Dog updateDog(@RequestBody Dog aDog){
        return dogService.save(aDog);
    }

    @DeleteMapping("/dog/{id}")
    void deleteDog(@PathVariable Integer id){
        dogService.deleteById(id);
    }

    @GetMapping("/dog/{id}")
    Optional<Dog> findById(@PathVariable Integer id){
        return dogService.findById(id);
    }

    @GetMapping("/dog/search")
    Iterable<Dog> findByQuery(@RequestParam("dogName") String dogName, @RequestParam("ownerName") String ownerName){
        return dogService.findByDogNameAndOwnerName(dogName, ownerName);
    }



}
