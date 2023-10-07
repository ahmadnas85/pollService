package com.PollService.PollService.service;

import com.PollService.PollService.model.PollQuestion;
import com.PollService.PollService.repository.PollRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollServiceImpl implements PollService{
    @Autowired
    private PollRepository pollRepository;
    @Override
    public void createPoll(PollQuestion pollQuestion) throws JsonProcessingException {
        pollRepository.createPollQuestion(pollQuestion);
    }

    @Override
    public void updatePoll(PollQuestion pollQuestion) {
        pollRepository.updatePollQuestion(pollQuestion);
    }

    @Override
    public void deletePoll(Long id) {
        pollRepository.deletePollQuestionById(id);
    }

    @Override
    public PollQuestion getPoll(Long id) {
        return pollRepository.getPollQuestionById(id);
    }

    public List<PollQuestion> getAllPollQuestions() {
        return pollRepository.getAllPollQuestions();
    }
}
