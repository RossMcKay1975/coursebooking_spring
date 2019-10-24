package com.codeclan.coursebooking.controllers;

import com.codeclan.coursebooking.models.Booking;
import com.codeclan.coursebooking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRep;

    @GetMapping(value = "/")
    public List<Booking> getBookingsByDate(@RequestParam("date") String date) {
        return bookingRep.findByDate(date);
    }

}
