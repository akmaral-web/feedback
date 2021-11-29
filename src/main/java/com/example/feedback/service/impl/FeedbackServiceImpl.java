package com.example.feedback.service.impl;


import com.example.feedback.entity.Feedback;
import com.example.feedback.repo.FeedbackRepo;
import com.example.feedback.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    private FeedbackRepo feedbackRepo;


    @Override
    public Feedback getById(int id) {
        return feedbackRepo.getById(id);
    }

    @Override
    public Feedback createFeedback(Feedback feedback) {
        return feedbackRepo.save(feedback);
    }

    @Override
    public void delete(int id) {

        Feedback feedback = feedbackRepo.getById(id);
        feedbackRepo.delete(feedback);
    }


}


