package com.codeclan.coursebooking.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String town;
    @Column
    private int rating;

    @JsonIgnoreProperties("course")
    @OneToMany(mappedBy = "course")
    private List<Booking> bookings = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public int getRating() {
        return rating;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public Course(String name, String town, int rating) {
        this.name = name;
        this.town = town;
        this.rating = rating;
    }

    public Course() {}

}
