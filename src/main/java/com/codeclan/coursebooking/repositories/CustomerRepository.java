package com.codeclan.coursebooking.repositories;

import com.codeclan.coursebooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

    @Query("select customer from Customer customer inner join customer.id Booking boo where .course_id = 1?")
    List<Customer> findCustomersOnGivenCourse(int courseId);
}
