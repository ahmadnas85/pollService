package com.PollService.PollService.repository.mapper;

import com.PollService.PollService.model.AnsweredQuestion;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class AnswerMapper implements RowMapper<AnsweredQuestion> {

    @Override
    public AnsweredQuestion mapRow(ResultSet rs, int rowNum) throws SQLException {
        AnsweredQuestion answeredQuestion = new AnsweredQuestion(
                rs.getLong("question_id"),
                rs.getLong("answer_id"),
                rs.getLong("user_id")
        );

        return answeredQuestion;
    }
}
