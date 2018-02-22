package com.rob.devoloperops.service;

import com.rob.devoloperops.web.domain.frontend.FeedbackPojo;

import org.springframework.mail.*;

public interface EmailService {

    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    public void sendGenericEmailMessage(SimpleMailMessage message);
}
