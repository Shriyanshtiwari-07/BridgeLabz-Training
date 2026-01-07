package com.oops.edumentor;

public class Instructor extends User{
	
	public Instructor(String name, String email, int userId) {
		super(name, email, userId);
	}
	
	public void addQuestion(Quiz quiz, String question) {
		quiz.setQuestion(question);
	}
	
	public void addAnswers(Quiz quiz, String answer) {
		quiz.setAnswer(answer);
	}
}
