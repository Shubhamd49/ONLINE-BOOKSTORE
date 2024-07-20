package com.bookstore.controller;

import com.bookstore.model.Review;
import com.bookstore.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/book/{bookId}")
    public List<Review> getReviewsByBookId(@PathVariable String bookId) {
        return reviewService.getReviewsByBookId(bookId);
    }

    @PostMapping
    public Review addReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }
}
