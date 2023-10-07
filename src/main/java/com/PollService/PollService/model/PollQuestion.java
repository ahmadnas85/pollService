package com.PollService.PollService.model;

public class PollQuestion {
    private Long questionId;
    private String question;
    private final Integer firstAnswerId = 1;
    private String firstAnswer;
    private final Integer secondAnswerId = 2;
    private String secondAnswer;
    private final Integer thirdAnswerId = 3;
    private String thirdAnswer;
    private final Integer fourthAnswerId = 4;
    private String fourthAnswer;
    public PollQuestion(){};

    public PollQuestion(Long questionId, String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer) {
        this.questionId = questionId;
        this.question = question;

        this.firstAnswer = firstAnswer;

        this.secondAnswer = secondAnswer;

        this.thirdAnswer = thirdAnswer;

        this.fourthAnswer = fourthAnswer;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public void setFourthAnswer(String fourthAnswer) {
        this.fourthAnswer = fourthAnswer;
    }
}
