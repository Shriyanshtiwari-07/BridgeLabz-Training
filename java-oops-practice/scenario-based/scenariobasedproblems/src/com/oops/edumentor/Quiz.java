package com.oops.edumentor;


import java.util.*;

public class Quiz {
	private List<String> questions;
	private final List<String> answers;
	double score;
	
	public Quiz() {
		questions = new ArrayList<>();
		answers = new ArrayList<>();
		score = 0.0;
	}
	
	public void setQuestion(String question) {
		questions.add(question);
	}
	
	public void setAnswer(String answer) {
		answers.add(answer);
	}
	
	public double calculateScore(List<String> userAnswer) {
		double scoree = 0.0;
		if(userAnswer.isEmpty()) {
			score = 0.0;
		}
		else {
			int idx = 0;
			for(String s: userAnswer) {
				if(s.equals(answers.get(idx))) {
					scoree++;
				}
				idx++;
			}
			this.score = scoree;
		}
		return scoree;
	}
	
	public double getPercentage(double score) {
		return (score * 100.0) / answers.size(); 
	}
}
