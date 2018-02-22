package com.rob.devoloperops.web.controllers;


import com.rob.devoloperops.web.domain.frontend.FeedbackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {


    public static final String FEEDBACK_MODEL_KEY = "feedback";

    private static final String CONTACT_US_VIEW_NAME = "contact/contact";


    private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);

     @RequestMapping(value="/contact" , method = RequestMethod.GET)
    public String contactGet(ModelMap model){

        FeedbackPojo feedbackPojo = new FeedbackPojo();

        model.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPojo);

        return ContactController.CONTACT_US_VIEW_NAME;


    }

    @RequestMapping(value="/contact" , method = RequestMethod.POST)
    public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedback){


         LOG.debug("feedback pojo", feedback);
         //emailService.senFeedbackEmail(feedback);

         return ContactController.CONTACT_US_VIEW_NAME;
    }
}
