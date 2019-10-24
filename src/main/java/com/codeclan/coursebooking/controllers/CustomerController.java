package com.codeclan.coursebooking.controllers;

import com.codeclan.coursebooking.models.Customer;
import com.codeclan.coursebooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRep;

    @GetMapping(value = "/")
    List<Customer> getCustomersByCourseId(@RequestParam("courseId") int courseId) {
        return customerRep.findCustomersOnGivenCourse(courseId);
    }
}
