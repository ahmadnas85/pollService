package com.PollService.PollService.repository;

import com.PollService.PollService.model.AnsweredQuestion;
import com.PollService.PollService.repository.mapper.AnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AnswersRepositoryImpl implements AnswersRepository {
    private static final String ANSWERS_TABLE = "answered_questions";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private AnswerMapper answerMapper;
    @Override
    public void createAnsweredQuestion(AnsweredQuestion answeredQuestion) {
        String sql = "INSERT INTO " + ANSWERS_TABLE + " (question_id, answer_id, user_id) VALUES (?, ?, ?)";
        jdbcTemplate.update(
                sql,
                answeredQuestion.getQuestionId(),
                answeredQuestion.getAnswerId(),
                answeredQuestion.getUserId()
        );
    }
    @Override
    public void deleteAnsweredQuestionByUserId(Long id) {
        String sql = "DELETE FROM " + ANSWERS_TABLE + " WHERE user_id = ?";
        jdbcTemplate.update(sql, id);
    }
    @Override
    public List<AnsweredQuestion> getAllAnsweredQuestions() {
        String sql = "SELECT * FROM " + ANSWERS_TABLE;
        return jdbcTemplate.query(sql, answerMapper);
    }
}
