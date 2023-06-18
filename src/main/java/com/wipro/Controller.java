package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Controller {

     @GetMapping("/api/uname")
     public String getName()
     {
         return "Nadeem Khan";
     }

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/api/reviews")
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @PostMapping("/api/reviews")
    public Review createReview(@RequestBody Review review) {
        return reviewRepository.save(review);
    }


}
