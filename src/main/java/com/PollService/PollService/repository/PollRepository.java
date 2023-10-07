package com.PollService.PollService.repository;

import com.PollService.PollService.model.PollQuestion;

import java.util.List;

public interface PollRepository {
    void createPollQuestion(PollQuestion pollQuestion);
    void updatePollQuestion(PollQuestion pollQuestion);
    void deletePollQuestionById(Long id);
    PollQuestion getPollQuestionById(Long id);
    List<PollQuestion> getAllPollQuestions();
}
