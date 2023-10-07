package com.PollService.PollService.repository.mapper;

import com.PollService.PollService.model.PollQuestion;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PollMapper implements RowMapper<PollQuestion> {


    @Override
    public PollQuestion mapRow(ResultSet rs, int rowNum) throws SQLException {
        PollQuestion pollQuestion = new PollQuestion(
                rs.getLong("question_id"),
                rs.getString("question"),
                rs.getString("first_answer"),
                rs.getString("second_answer"),
                rs.getString("third_answer"),
                rs.getString("fourth_answer")
        );
        return pollQuestion;
    }
}
