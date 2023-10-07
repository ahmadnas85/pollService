package com.PollService.PollService.service;

import com.PollService.PollService.model.AnsweredQuestion;
import com.PollService.PollService.model.QuestionAnswersCount;

import java.util.List;

public interface AnswersService {
    void createAnsweredQuestion(AnsweredQuestion answeredQuestion);
    void deleteAnsweredQuestionByUserId(Long id);
    QuestionAnswersCount getAnsweredCountByQuestionId(Long id);
    Integer getTotalAnswersByQuestionId(Long id);
    List<AnsweredQuestion> getAllAnsweredQuestionsByUserId(Long id);
    Integer getTotalAnswersByUserId(Long id);
    List<QuestionAnswersCount> getAllAnsweredQuestionsCount();
}
