package com.answer.Service;

import java.util.List;

import com.answer.Entity.Answer;

public interface AnswerServiceImpl {
  
	Answer add(Answer answer);
	
	List<Answer> get();
	
	Answer get(int id) ;
	
	
}
