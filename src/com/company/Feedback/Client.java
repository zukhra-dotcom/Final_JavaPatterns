package com.company.Feedback;

public class Client {
    public static String feedback(FeedbackType feedbackType){
        ArgumentsOfFeedback argumentsOfFeedback = new ArgumentsOfFeedback();

        switch (feedbackType){
            case BAD:
                Feedback badFeedback = new BadFeedback();
                String bad = argumentsOfFeedback.getBadFeedback();
                badFeedback.giveFeedback(bad);
                return (badFeedback.chooseFeedback());

            case GOOD:
                Feedback goodFeedback = new GoodFeedback();
                String good = argumentsOfFeedback.getGoodFeedback();
                goodFeedback.giveFeedback(good);
                return (goodFeedback.chooseFeedback());

            case EXCELLENT:
                Feedback excellentFeedback = new ExcellentFeedback();
                String excellent = argumentsOfFeedback.getExcellentFeedback();
                excellentFeedback.giveFeedback(excellent);
                return (excellentFeedback.chooseFeedback());
        }
        return null;
    }
}
