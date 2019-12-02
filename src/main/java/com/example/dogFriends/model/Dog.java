package com.example.dogFriends.model;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Dog {

    @Id
    @GeneratedValue
    private int id;

    private String dogName;
    private String ownerName;

    public Dog() {
    }

    public Dog(int id, String dogName, String ownerName) {
        this.id = id;
        this.dogName = dogName;
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
