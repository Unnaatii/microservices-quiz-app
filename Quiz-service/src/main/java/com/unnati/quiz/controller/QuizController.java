package com.unnati.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unnati.quiz.entity.Quiz;
import com.unnati.quiz.services.QuizService;


@RestController
@RequestMapping("/quiz")

public class QuizController {
	@Autowired
	private QuizService quizService;
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return quizService.add(quiz);
	}

	
	@GetMapping
	public List<Quiz> getAll() {
		return quizService.getAll();
	}
	
	
	
	@GetMapping("/{id}")
	public Quiz getById(@PathVariable Integer id) {
		return quizService.get(id);
	}
	
	
	
	
	
	
	
}
