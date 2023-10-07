CREATE TABLE questions (
    question_id INT AUTO_INCREMENT PRIMARY KEY,
    question varchar(300) NOT NULL DEFAULT '',
    first_answer_key INT DEFAULT 1,
    first_answer varchar(300) DEFAULT '',
    second_answer_key INT DEFAULT 2,
    second_answer varchar(300) DEFAULT '',
    third_answer_key INT DEFAULT 3,
    third_answer varchar(300) DEFAULT '',
    fourth_answer_key INT DEFAULT 4,
    fourth_answer varchar(300) DEFAULT ''
);

CREATE TABLE answered_questions (
    question_id INT,
    answer_id INT,
    user_id INT,
    CONSTRAINT PK_answered_questions PRIMARY KEY (question_id, user_id)
);