package com.PollService.PollService.conroller;

import com.PollService.PollService.model.AnsweredQuestion;
import com.PollService.PollService.model.QuestionAnswersCount;
import com.PollService.PollService.service.AnswersService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswersController {

    @Autowired
    private AnswersService answersService;
    @PostMapping("/createAnswer")
    public void createAnsweredQuestion(@RequestBody AnsweredQuestion answeredQuestion) throws JsonProcessingException {
        answersService.createAnsweredQuestion(answeredQuestion);
    }
    @DeleteMapping("/deleteAnswer")
    public void deleteAnsweredQuestionByUserId(@RequestParam Long id){
        answersService.deleteAnsweredQuestionByUserId(id);
    }
    @GetMapping("/getAnswerCountByQuestionId/{id}")
    public QuestionAnswersCount getAnswerByQuestionId(@PathVariable Long id){
        return answersService.getAnsweredCountByQuestionId(id);
    }
    @GetMapping("/getTotalAnswersByQuestionId/{id}")
    public Integer getTotalAnswersByQuestionId(@PathVariable Long id){
        return answersService.getTotalAnswersByQuestionId(id);
    }
    @GetMapping("/getAllAnsweredQuestionsCount")
    public List<QuestionAnswersCount> getAllAnsweredQuestionsCount(){
        return answersService.getAllAnsweredQuestionsCount();
    }
    @GetMapping("/getAllAnsweredQuestionsByUserId/{id}")
    public List<AnsweredQuestion> getAllAnsweredQuestionsByUserId(@PathVariable Long id){
        return answersService.getAllAnsweredQuestionsByUserId(id);
    }
    @GetMapping("/getTotalAnswersByUserId/{id}")
    public Integer getTotalAnswersByUserId(@PathVariable Long id){
        return answersService.getTotalAnswersByUserId(id);
    }
}
