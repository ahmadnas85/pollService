package com.PollService.PollService.model;

public class AnsweredQuestion {
    private Long questionId;
    private Long answerId;
    private Long userId;

    public AnsweredQuestion() {};

    public AnsweredQuestion(Long questionId, Long answerId, Long userId) {
        this.questionId = questionId;
        this.answerId = answerId;
        this.userId = userId;
    }



    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
