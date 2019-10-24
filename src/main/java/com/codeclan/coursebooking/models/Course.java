package com.codeclan.coursebooking.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String town;
    private int age;

    @JsonIgnoreProperties("course")
    @OneToMany(mappedBy = "course")
    private List<Booking> bookings;

    public Course(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

}
