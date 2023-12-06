package com.answer.Service;

import java.util.List;

import com.answer.Entity.Answer;

@org.springframework.stereotype.Service
public class Service implements AnswerServiceImpl {

	
	private AnswerServiceImpl answerservice;
	
	
	public Service(AnswerServiceImpl answerservice) {
		super();
		this.answerservice = answerservice;
	}

	@Override
	public Answer add(Answer answer) {
		// TODO Auto-generated method stub
		return answerservice.add(answer);
	}

	@Override
	public List<Answer> get() {
		// TODO Auto-generated method stub
		return answerservice.get();
	}

	@Override
	public Answer get(int id) {
		// TODO Auto-generated method stub
		return answerservice.get(id);
	}

}
