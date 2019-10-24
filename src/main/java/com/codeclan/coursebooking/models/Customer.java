package com.codeclan.coursebooking.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    private String town;

    private int starRating;

    @JsonIgnoreProperties("customer")
    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    public Customer(String name, String town, int starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
    }
}
