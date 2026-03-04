package com.unnati.quiz.services;

import java.util.List;

import com.unnati.quiz.entity.Quiz;

public interface QuizService {
	
	 Quiz add(Quiz  quiz);
	 
	 List<Quiz> getAll();
	 
	 Quiz get(Integer id);

}
