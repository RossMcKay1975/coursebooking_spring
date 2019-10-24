package com.codeclan.coursebooking.components;

import com.codeclan.coursebooking.models.Booking;
import com.codeclan.coursebooking.models.Course;
import com.codeclan.coursebooking.models.Customer;
import com.codeclan.coursebooking.repositories.BookingRepository;
import com.codeclan.coursebooking.repositories.CourseRepository;
import com.codeclan.coursebooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRep;

    @Autowired
    CourseRepository courseRep;

    @Autowired
    CustomerRepository customerRep;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        Customer cust1 = new Customer("Henry", "Edinburgh", 30);
        Customer cust2 = new Customer("Cavil", "Edinburgh", 99);
        Customer cust3 = new Customer("Clark", "Dundee", 45);

        Course course1 = new Course("Coding 101", "Edinburgh", 5);
        Course course2 = new Course("Coding 102", "Edinburgh", 3);
        Course course3 = new Course("Coding 103", "Dundee", 1);

        Booking booking1 = new Booking("24-10-19", cust1, course1);
        Booking booking2 = new Booking("24-10-18", cust2, course2);
        Booking booking3 = new Booking("24-10-17", cust3, course3);

        customerRep.save(cust1);
        customerRep.save(cust2);
        customerRep.save(cust3);
        courseRep.save(course1);
        courseRep.save(course2);
        courseRep.save(course3);
        bookingRep.save(booking1);
        bookingRep.save(booking2);
        bookingRep.save(booking3);
    }

}
