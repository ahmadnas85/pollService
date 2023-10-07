package com.PollService.PollService.repository;

import com.PollService.PollService.model.PollQuestion;
import com.PollService.PollService.repository.mapper.PollMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PollRepositoryImpl implements PollRepository{
    private static final String QUESTION_TABLE = "questions";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private PollMapper pollMapper;
    @Override
    public void createPollQuestion(PollQuestion pollQuestion){
        String sql = "INSERT INTO " + QUESTION_TABLE + " (question, first_answer, second_answer, third_answer, fourth_answer) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(
                sql,
                pollQuestion.getQuestion(),
                pollQuestion.getFirstAnswer(),
                pollQuestion.getSecondAnswer(),
                pollQuestion.getThirdAnswer(),
                pollQuestion.getFourthAnswer()
        );
    }
    @Override
    public void updatePollQuestion(PollQuestion pollQuestion){
        String sql = "UPDATE " + QUESTION_TABLE + " SET question = ?, first_answer = ?, second_answer = ?, third_answer = ?, fourth_answer = ? WHERE question_id = ?";
        jdbcTemplate.update(
                sql,
                pollQuestion.getQuestion(),
                pollQuestion.getFirstAnswer(),
                pollQuestion.getSecondAnswer(),
                pollQuestion.getThirdAnswer(),
                pollQuestion.getFourthAnswer(),
                pollQuestion.getQuestionId()
        );
    }
    @Override
    public void deletePollQuestionById(Long id){
        String sql = "DELETE FROM " + QUESTION_TABLE + " WHERE question_id = ?";
        jdbcTemplate.update(sql, id);
    }
    @Override
    public PollQuestion getPollQuestionById(Long id) {
        try {
            String sql = "SELECT * FROM " + QUESTION_TABLE + " WHERE question_id = ?";
            return jdbcTemplate.queryForObject(
                    sql,
                    pollMapper,
                    id
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
    @Override
    public List<PollQuestion> getAllPollQuestions(){
        String sql = "SELECT * FROM " + QUESTION_TABLE;
        return jdbcTemplate.query(sql, pollMapper);
    }
}
