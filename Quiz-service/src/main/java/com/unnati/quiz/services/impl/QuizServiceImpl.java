package com.unnati.quiz.services.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unnati.quiz.entity.Quiz;
import com.unnati.quiz.repo.QuizRepo;
import com.unnati.quiz.services.QuestionClient;
import com.unnati.quiz.services.QuizService;


@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepo quizRepo;
	
	@Autowired
	private QuestionClient questionClient;

	@Override
	public Quiz add(Quiz quiz) {
		
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> getAll() {
		List<Quiz> quizz=quizRepo.findAll();
		List<Quiz>newQuizList= quizz.stream().map(quiz->{quiz.setQuestion(questionClient.getQuestionofQuiz(quiz.getId()));
		return quiz;}).collect(Collectors.toList());
		
		return  newQuizList;
	}

	@Override
	public Quiz get(Integer id) {
		
	Quiz quiz= quizRepo.findById(id).orElseThrow(()->new RuntimeException("Quiz not Found !!"));
	quiz.setQuestion(questionClient.getQuestionofQuiz(quiz.getId()));
		return quiz;
	}

}
