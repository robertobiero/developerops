package com.rob.devoloperops.service;

import com.rob.devoloperops.web.domain.frontend.FeedbackPojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbstractEmailService implements EmailService{

       @Value("${default.to.address}")
       private String defaultToAddress;

        protected SimpleMailMessage prepareSimpleMessageFromFeedbackPojo(FeedbackPojo feedback){

            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(defaultToAddress);
            message.setFrom(feedback.getEmail());
            message.setSubject("feedback recieved" + feedback.getFirstName());
            message.setText(feedback.getFeedback());
            return message;
        }


        public void sendFeedbackEmail(FeedbackPojo feedbackPojo){


            sendGenericEmailMessage(prepareSimpleMessageFromFeedbackPojo(feedbackPojo));
        }

}
