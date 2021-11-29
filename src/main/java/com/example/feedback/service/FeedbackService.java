package com.example.feedback.service;


import com.example.feedback.entity.Feedback;

public interface FeedbackService {
    Feedback getById(int id);
    Feedback createFeedback(Feedback cartProduct);
    void delete(int id);


}

