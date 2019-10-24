package com.codeclan.coursebooking.controllers;

import com.codeclan.coursebooking.models.Course;
import com.codeclan.coursebooking.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRep;

    @GetMapping(value = "/")
    public List<Course> getCoursesByRating(@RequestParam("rating") int rating) {
        return courseRep.findByRating(rating);
    }
}
