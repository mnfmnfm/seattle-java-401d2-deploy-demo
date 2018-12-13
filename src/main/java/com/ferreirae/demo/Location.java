package com.ferreirae.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String environment;
    public String name;

    @OneToMany
    public List<Dinosaur> dinosaurs;
    public Location() {}

    public Location(String environment, String name) {
        this.environment = environment;
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
