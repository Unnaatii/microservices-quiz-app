package com.unnati.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnati.quiz.entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz,Integer >{

}
