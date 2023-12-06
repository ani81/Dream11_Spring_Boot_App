package com.answer.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.answer.Entity.Answer;
import com.answer.Service.Service;

@RestController
@RequestMapping("/answer")
public class AnswerController {

        public static my_answer;

	private Service service;

	public AnswerController(Service service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/new")
	
	public Answer create(@RequestBody Answer answer) {
		return service.add(answer);
		}
	
	@GetMapping
	
	public List<Answer> get(){
		return service.get();
		}
	
	@GetMapping("/getansid")
	
	public  Answer getbyans (@PathVariable int getansid) {
		return service.get(getansid);
	}
         
     

         
	
}
