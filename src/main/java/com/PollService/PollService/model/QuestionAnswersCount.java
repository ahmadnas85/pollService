package com.PollService.PollService.model;

public class QuestionAnswersCount {
    private Long questionId;
    private String question;
    private Integer firstAnswerCount;
    private Integer secondAnswerCount;
    private Integer thirdAnswerCount;
    private Integer fourthAnswerCount;

    public QuestionAnswersCount() {};

    public QuestionAnswersCount(Long questionId, String question, Integer firstAnswerCount, Integer secondAnswerCount, Integer thirdAnswerCount, Integer fourthAnswerCount) {
        this.questionId = questionId;
        this.question = question;
        this.firstAnswerCount = firstAnswerCount;
        this.secondAnswerCount = secondAnswerCount;
        this.thirdAnswerCount = thirdAnswerCount;
        this.fourthAnswerCount = fourthAnswerCount;
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

    public Integer getFirstAnswerCount() {
        return firstAnswerCount;
    }

    public void setFirstAnswerCount(Integer firstAnswerCount) {
        this.firstAnswerCount = firstAnswerCount;
    }

    public Integer getSecondAnswerCount() {
        return secondAnswerCount;
    }

    public void setSecondAnswerCount(Integer secondAnswerCount) {
        this.secondAnswerCount = secondAnswerCount;
    }

    public Integer getThirdAnswerCount() {
        return thirdAnswerCount;
    }

    public void setThirdAnswerCount(Integer thirdAnswerCount) {
        this.thirdAnswerCount = thirdAnswerCount;
    }

    public Integer getFourthAnswerCount() {
        return fourthAnswerCount;
    }

    public void setFourthAnswerCount(Integer fourthAnswerCount) {
        this.fourthAnswerCount = fourthAnswerCount;
    }
}
