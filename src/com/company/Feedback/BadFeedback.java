package com.company.Feedback;

public class BadFeedback implements Feedback {
    public String badFeedback;

    @Override
    public void giveFeedback(String feedback) {
        badFeedback = "The service is bad. Because of " + feedback;
    }

    @Override
    public String chooseFeedback() {
        return badFeedback;
    }
}
