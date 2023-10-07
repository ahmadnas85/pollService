package com.PollService.PollService.conroller;

import com.PollService.PollService.model.PollQuestion;
import com.PollService.PollService.service.PollService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/poll")
public class PollController {
    @Autowired
    private PollService pollService;
    @PostMapping("/create")
    public void createPoll(@RequestBody PollQuestion pollQuestion) throws JsonProcessingException {
        pollService.createPoll(pollQuestion);
    }
    @PostMapping("/update")
    public void updatePoll(@RequestBody PollQuestion pollQuestion){
        pollService.updatePoll(pollQuestion);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePoll(@PathVariable Long id){
        pollService.deletePoll(id);
    }
    @GetMapping("/{id}")
    public PollQuestion getPoll(@PathVariable Long id){
        return pollService.getPoll(id);
    }
}
