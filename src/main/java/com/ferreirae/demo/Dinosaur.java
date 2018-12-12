package com.ferreirae.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dinosaur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String species;
    public int numberOfSpikes;
    public String diet;

    public Dinosaur() {}

    public Dinosaur(String species,int numberOfSpikes, String diet) {
        this.species = species;
        this.numberOfSpikes = numberOfSpikes;
        this.diet = diet;
    }

    public String toString() {
        return species + " dinosaur with " + numberOfSpikes + " spikes";
    }
}
