package com.company.Feedback;

public class ExcellentFeedback implements Feedback{
    public String excellentFeedback;

    @Override
    public void giveFeedback(String feedback) {
        excellentFeedback = "The service is excellent. Because of " + feedback;
    }

    @Override
    public String chooseFeedback() {
        return excellentFeedback;
    }
}
