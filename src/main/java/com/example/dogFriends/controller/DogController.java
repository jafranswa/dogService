package com.example.dogFriends.controller;

import com.example.dogFriends.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    @Autowired
    DogService dogService;

    //todo add url mappings
}
