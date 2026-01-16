package com.examproctor;

import java.util.*;

public class Proctor {
	
	private Stack<Integer> navStack = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();

    private HashMap<Integer, String> correctAns = new HashMap<>();

    public Proctor() {
    	correctAns.put(1, "A");
    	correctAns.put(2, "B");
    	correctAns.put(3, "C");
    	correctAns.put(4, "D");
    }
    
    public void visitQuestion(int questionId) {
    	navStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }
    
    public void lastVisitedQuestion() {
        if (navStack.isEmpty()) {
            System.out.println("No questions visited.....");
            return;
        }
        System.out.println("Last visited question: " + navStack.peek());
    }
    
    public int calculateScore() {
        int score = 0;

        for (int qId : correctAns.keySet()) {
            if (answers.containsKey(qId) && answers.get(qId).equals(correctAns.get(qId))) {
                score++;
            }
        }
        return score;
    }

    public void submitExam() {
        int finalScore = calculateScore();
        System.out.println("Exam submitted.");
        System.out.println("Final Score: " + finalScore);
    }
}