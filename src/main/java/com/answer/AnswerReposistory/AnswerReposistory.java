package com.answer.AnswerReposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.answer.Entity.Answer;

public interface AnswerReposistory  extends JpaRepository<Answer,Integer>{

}
