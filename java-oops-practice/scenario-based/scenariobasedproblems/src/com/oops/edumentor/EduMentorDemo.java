package com.oops.edumentor;

import java.util.*;

public class EduMentorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Learner ravi = new Learner("Ravi", "ravi@gmail.com", 101, true);
		
		Instructor ashish = new Instructor("Ashish", "ashish@gmail.com", 202);
		
		List<String> questions = new ArrayList<>();
		List<String> answers = new ArrayList<>();
		
		List<String> userAnswer = new ArrayList<>();
		userAnswer.add("Yes");
		userAnswer.add("No");
		
		Quiz quiz = new Quiz();
		
		ashish.addQuestion(quiz, "Java is a OOPS Language");
		ashish.addQuestion(quiz, "Java do support multiple inheritance");
		
		ashish.addAnswers(quiz, "Yes");
		ashish.addAnswers(quiz, "No");
		
		ravi.attemptQuiz(quiz, userAnswer);
		ravi.showPercentage(quiz, userAnswer);
		
	}

}