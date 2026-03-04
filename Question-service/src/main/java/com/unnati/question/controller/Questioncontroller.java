package com.unnati.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unnati.question.entity.Question;
import com.unnati.question.services.QuestionService;


@RestController
@RequestMapping("/question")
public class Questioncontroller {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		
		return questionService.add(question);	
	}
	
	
	@GetMapping
	public List<Question> getAll() {
		
		return questionService.getAll();
		
	}
	
	
	@GetMapping("/{id}")
	public Question getById(@PathVariable Integer id) {
		
		return questionService.getById(id);
		
	}
	
	
	@PutMapping("/{id}")
	public Question update(@RequestBody Question question, @PathVariable Integer id) {
		return questionService.update(question, id);
	}
	
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionOfQuiz(@PathVariable Integer quizId) {
	    return questionService.getQuestionsByQuizId(quizId);
	}

	
	
	
	
	
	
	
	

}


