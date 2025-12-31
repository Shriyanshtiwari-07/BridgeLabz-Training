import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. What is the size of int in Java?\nA. 2 bytes\nB. 4 bytes\nC. 8 bytes\nD. Depends on system",
                "2. Which keyword is used to create object?\nA. class\nB. object\nC. new\nD. this",
                "3. Java is:\nA. Platform dependent\nB. Platform independent\nC. Hardware dependent\nD. None",
                "4. Which loop runs at least once?\nA. for\nB. while\nC. do-while\nD. none",
                "5. JVM stands for:\nA. Java Visual Machine\nB. Java Virtual Machine\nC. Java Variable Method\nD. None"
        };

        char[] correctAnswers = {'B', 'C', 'B', 'C', 'B'};
        int score = 0;

        System.out.println("🧠 Welcome to Online Quiz");
        System.out.println("-------------------------");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);
            System.out.print("Your Answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            // Checking answer using switch
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == correctAnswers[i]) {
                        System.out.println("Correct ✔️");
                        score++;
                    } else {
                        System.out.println("Wrong ❌ Correct Answer: " + correctAnswers[i]);
                    }
                    break;

                default:
                    System.out.println("Invalid Option ❗");
            }
        }

        System.out.println("\nQuiz Completed 🎯");
        System.out.println("Your Score: " + score + " / " + questions.length);

        sc.close();
    }
}
