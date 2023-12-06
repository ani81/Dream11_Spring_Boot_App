package com.answer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class Answer {

	@Id
	private int Answer_id;
	private String Answer;
	private int Question_id;
	
	
	
	
	
	
	
	
}
