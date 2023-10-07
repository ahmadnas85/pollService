package com.PollService.PollService.service;

import com.PollService.PollService.model.PollQuestion;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface PollService {
    void createPoll(PollQuestion pollQuestion) throws JsonProcessingException;

    void updatePoll(PollQuestion pollQuestion);

    void deletePoll(Long id);

    PollQuestion getPoll(Long id);
    List<PollQuestion> getAllPollQuestions();
}
