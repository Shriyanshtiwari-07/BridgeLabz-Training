package com.oops.fittrack;

public class FitTrack {
	public static void main(String[] args) {
		
		UserProfile user = new UserProfile("Nageshwar", 25, 79, 2500);
		
		user.displayInfo();
		
		CardioWorkout cardio = new CardioWorkout(45);
		StrengthWorkout strength = new StrengthWorkout(60);
		
		user.addWorkout(strength);
		user.addWorkout(cardio);
		
		cardio.startWorkout();
		cardio.calculateCalories();
		cardio.startWorkout();
		
		strength.startWorkout();
		strength.calculateCalories();
		strength.stopWorkout();
		
		user.viewWorkouts();
		
		System.out.println("Total calories burned: "+ user.getTotalCaloriesBurned());
	}
}
