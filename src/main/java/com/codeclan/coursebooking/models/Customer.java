package com.codeclan.coursebooking.models;

public class Customer {

    private String name;
    private String town;
    private int starRating;

    public Customer(String name, String town, int starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
    }
}
