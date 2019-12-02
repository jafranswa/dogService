package com.example.dogFriends.service;

import com.example.dogFriends.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogService
        extends CrudRepository<Dog, Integer>{

    Iterable<Dog> findByDogNameAndOwnerName(
            String dogName,
            String ownerName
    );

}
