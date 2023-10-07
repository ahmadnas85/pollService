package com.PollService.PollService.service;


import com.PollService.PollService.conroller.UserController;
import com.PollService.PollService.model.AnsweredQuestion;
import com.PollService.PollService.model.PollQuestion;
import com.PollService.PollService.model.QuestionAnswersCount;
import com.PollService.PollService.repository.AnswersRepository;
import com.PollService.PollService.userFeignClient.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswersServiceImpl implements AnswersService {
    @Autowired
    private UserController userController;
    @Autowired
    UserFeignService userFeignService;
    @Autowired
    private AnswersRepository answersRepository;
    @Autowired
    private PollService pollService;

    @Override
    public void createAnsweredQuestion(AnsweredQuestion answeredQuestion) {
        if(userFeignService.getUserById(answeredQuestion.getUserId()) != null) {
            if(userFeignService.getUserById(answeredQuestion.getUserId()).getRegStatus()) {
                if (pollService.getPoll(answeredQuestion.getQuestionId()) != null) {
                    answersRepository.createAnsweredQuestion(answeredQuestion);
                } else {
                    System.out.println("Poll not found");
                }
            } else {
                System.out.println("User not active");
            }
        } else {
            System.out.println("User not found");
        }
    }
    @Override
    public void deleteAnsweredQuestionByUserId(Long id) {
        answersRepository.deleteAnsweredQuestionByUserId(id);
    }
    @Override
    public QuestionAnswersCount getAnsweredCountByQuestionId(Long id) {
        Integer firstAnswerCount = 0;
        Integer secondAnswerCount = 0;
        Integer thirdAnswerCount = 0;
        Integer fourthAnswerCount = 0;
        List<AnsweredQuestion> answeredQuestions = answersRepository.getAllAnsweredQuestions();
        for (int i = 0; i < answeredQuestions.size(); i++) {
            if (answeredQuestions.get(i).getQuestionId() == id) {
                if (answeredQuestions.get(i).getAnswerId() == 1) {
                    firstAnswerCount++;
                } else if (answeredQuestions.get(i).getAnswerId() == 2) {
                    secondAnswerCount++;
                } else if (answeredQuestions.get(i).getAnswerId() == 3) {
                    thirdAnswerCount++;
                } else if (answeredQuestions.get(i).getAnswerId() == 4) {
                    fourthAnswerCount++;
                }
            }
        }
        String question = pollService.getPoll(id).getQuestion();
        return new QuestionAnswersCount(id, question, firstAnswerCount, secondAnswerCount, thirdAnswerCount, fourthAnswerCount);
    }
    @Override
    public Integer getTotalAnswersByQuestionId(Long id) {
        Integer totalAnswers = 0;
        List<AnsweredQuestion> answeredQuestions = answersRepository.getAllAnsweredQuestions();
        for (int i = 0; i < answeredQuestions.size(); i++) {
            if (answeredQuestions.get(i).getQuestionId() == id) {
                if (answeredQuestions.get(i).getAnswerId() != null) {
                    totalAnswers++;
                }
            }
        }
        return totalAnswers;
    }
    @Override
    public List<AnsweredQuestion> getAllAnsweredQuestionsByUserId(Long id) {
        List<AnsweredQuestion> answeredQuestionsByUserId = new ArrayList<>();
        List<AnsweredQuestion> answeredQuestions = answersRepository.getAllAnsweredQuestions();
        for (int i = 0; i < answeredQuestions.size(); i++) {
            if (answeredQuestions.get(i).getUserId() == id) {
                answeredQuestionsByUserId.add(answeredQuestions.get(i));
            }
        }
        return answeredQuestionsByUserId;
    }
    @Override
    public Integer getTotalAnswersByUserId(Long id) {
        Integer totalAnswers = 0;
        List<AnsweredQuestion> answeredQuestions = answersRepository.getAllAnsweredQuestions();
        for (int i = 0; i < answeredQuestions.size(); i++) {
            if (answeredQuestions.get(i).getUserId() == id) {
                if (answeredQuestions.get(i).getAnswerId() != null) {
                    totalAnswers++;
                }
            }
        }
        return totalAnswers;
    }
    @Override
    public List<QuestionAnswersCount> getAllAnsweredQuestionsCount() {
        List<PollQuestion> allPollQuestions = pollService.getAllPollQuestions();
        List<QuestionAnswersCount> answeredQuestionsCount = new ArrayList<>();
        for (int i = 0; i < allPollQuestions.size(); i++) {
            answeredQuestionsCount.add(getAnsweredCountByQuestionId(allPollQuestions.get(i).getQuestionId()));
        }
        return answeredQuestionsCount;
    }
}
