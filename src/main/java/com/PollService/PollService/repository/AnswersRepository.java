package com.PollService.PollService.repository;

import com.PollService.PollService.model.AnsweredQuestion;

import java.util.List;

public interface AnswersRepository {
    void createAnsweredQuestion(AnsweredQuestion answeredQuestion);
    void deleteAnsweredQuestionByUserId(Long id);
    List<AnsweredQuestion> getAllAnsweredQuestions();
}
