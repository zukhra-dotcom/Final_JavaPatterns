package com.company.Feedback;

public class GoodFeedback implements Feedback{
    public String goodFeedback;

    @Override
    public void giveFeedback(String feedback) {
        goodFeedback = "The service is good. Because of " + feedback;
    }

    @Override
    public String chooseFeedback() {
        return goodFeedback;
    }
}
