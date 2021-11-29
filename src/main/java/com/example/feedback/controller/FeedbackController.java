package com.example.feedback.controller;


import com.example.feedback.entity.Feedback;
import com.example.feedback.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feedback")

public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/create")
    public Feedback createFeedback(@RequestBody Feedback feedback) {
        return feedbackService.createFeedback(feedback);
    }


    @GetMapping("/all/{id}")
    public Feedback getById(@PathVariable int id ){
        return  feedbackService.getById(id);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam int id ){
        feedbackService.delete(id);
    }

}


