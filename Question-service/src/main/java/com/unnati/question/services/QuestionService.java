package com.unnati.question.services;

import java.util.List;

import com.unnati.question.entity.Question;

public interface QuestionService {
	Question add(Question question);
	
	List<Question> getAll();
	
	Question getById(Integer id);
	
	Question update(Question question, Integer id);
	
	List<Question> getQuestionsByQuizId(Integer quizId);

	

}
