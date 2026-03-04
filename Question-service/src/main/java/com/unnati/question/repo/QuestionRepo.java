package com.unnati.question.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnati.question.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer>{
	
	List<Question> findByQuizId(Integer quizId);

}
