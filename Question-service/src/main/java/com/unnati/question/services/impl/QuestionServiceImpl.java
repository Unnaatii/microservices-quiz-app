package com.unnati.question.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unnati.question.entity.Question;
import com.unnati.question.repo.QuestionRepo;
import com.unnati.question.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question add(Question question) {
		
		return questionRepo.save(question);
	}

	
	@Override
	public List<Question> getAll() {
		
		return questionRepo.findAll();
	}

	@Override
	public Question getById(Integer id) {
		
		return questionRepo.findById(id).orElseThrow(()-> new RuntimeException("Question not Found!!"));
	}

 //que-requestedque and question-existingque
	@Override
	public Question update(Question que, Integer id) {
		Question question=questionRepo.findById(id).orElseThrow(()->new RuntimeException("id not Found!!"));
		question.setQuestion(que.getQuestion());
		question.setQuizId(que.getQuizId());
		
		
		return questionRepo.save(question);
	}


	@Override
	public List<Question> getQuestionsByQuizId(Integer quizId) {
		
		 return questionRepo.findByQuizId(quizId);
	}

}
