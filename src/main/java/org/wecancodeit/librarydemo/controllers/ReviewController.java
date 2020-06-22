package org.wecancodeit.librarydemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.librarydemo.models.Review;
import org.wecancodeit.librarydemo.repositories.ReviewRepository;

import javax.annotation.Resource;
import java.util.Optional;


@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String displayCampuses(Model model){
        model.addAttribute("reviews", reviewRepo.findAll());
        return "reviewsView";
    }

    @GetMapping("/reviews/{id}")
    public String displaySingleCampus(@PathVariable Long id, Model model){
        Optional<Review> retrievedReview = reviewRepo.findById(id);
        Review review = retrievedReview.get();
        model.addAttribute("review", review);
        return "reviewView";
    }
}
