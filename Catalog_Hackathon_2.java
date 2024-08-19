package catalog_hackathon_2;

import java.util.Scanner;

public class Catalog_Hackathon_2 {

    // Array of Java questions and their expected outputs
    private static String[][] quizData = {
        {"What is the output of this code?\nint x = 5;\nSystem.out.println(++x);", "6"},
        {"What is the keyword used to inherit a class in Java?", "extends"},
        {"What does the following code print?\nString str = \"Hello\";\nSystem.out.println(str.length());", "5"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("Answer the following Java questions:\n");

        // Loop through each question and ask for the user's answer
        for (int i = 0; i < quizData.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + quizData[i][0]);
            String userAnswer = scanner.nextLine().trim();

            // Check if the answer is correct
            if (userAnswer.equalsIgnoreCase(quizData[i][1])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + quizData[i][1] + "\n");
            }
        }

        // Display the final score
        System.out.println("Quiz over! Your final score is: " + score + " out of " + quizData.length);

        scanner.close();
    }
}
