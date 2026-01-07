package com.oops.edumentor;

import java.util.*;

public class Learner extends User implements ICertifiable{
	boolean isFullTime;
	int learnerId;
	List<Quiz> quizzes;
	
	public Learner(String name, String email, int userId, boolean isFullTime) {
		super(name, email, userId);
		this.isFullTime = isFullTime;
		quizzes = new ArrayList<>();
	}
	
	public void attemptQuiz(Quiz quiz, List<String> userAnswer) {
		quiz.calculateScore(userAnswer);
		quizzes.add(quiz);
	}
	
	public void showPercentage(Quiz quiz, List<String> userAnswer) {
		double score = quiz.calculateScore(userAnswer);
		double percentage = quiz.getPercentage(score);
		System.out.println("Percentage: " + percentage);
	}
	
	@Override
	public void generateCertificate() {
		if(isFullTime) {
			System.out.println("-------------EduMentor------------------");
			System.out.println("Congratulations " + name);
			System.out.println("On completing Full time Course...");
		}
	}
}