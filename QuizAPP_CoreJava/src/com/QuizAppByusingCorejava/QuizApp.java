package com.QuizAppByusingCorejava;

import java.util.Scanner;

class Question {
    String question;
    String[] options;
    String correctAnswer;

    public Question(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Current Affairs and General Knowledge Questions
        Question[] questions = {
            new Question("What is Java?", new String[]{"A. Language", "B. Coffee", "C. OS", "D. IDE"}, "A"),
            new Question("Which company owns Java?", new String[]{"A. Microsoft", "B. Apple", "C. Oracle", "D. Google"}, "C"),
            new Question("Who is the current Prime Minister of India?", 
                          new String[]{"A. Narendra Modi", "B. Manmohan Singh", "C. Rahul Gandhi", "D. Arvind Kejriwal"}, "A"),
            new Question("Which country hosted the 2024 Summer Olympics?", 
                          new String[]{"A. Japan", "B. France", "C. USA", "D. Australia"}, "B"),
            new Question("What is the capital of the G20 presidency for 2024?", 
                          new String[]{"A. Indonesia", "B. India", "C. Brazil", "D. South Africa"}, "C"),
            new Question("Which Indian state recently introduced the ‘Green Hydrogen Policy’?",
                          new String[]{"A. Tamil Nadu", "B. Maharashtra", "C. Gujarat", "D. Kerala"}, "C"),
            new Question("Who is the current President of the USA?", 
                          new String[]{"A. Donald Trump", "B. Joe Biden", "C. Barack Obama", "D. Kamala Harris"}, "B"),
            new Question("Which country won the FIFA World Cup 2022?", 
                          new String[]{"A. Argentina", "B. France", "C. Brazil", "D. Germany"}, "A"),
            new Question("What is the theme of World Environment Day 2024?", 
                          new String[]{"A. Beat Plastic Pollution", "B. Ecosystem Restoration", "C. Climate Action", "D. Clean Air for All"}, "A"),
            new Question("Who is the CEO of Tesla?", 
                          new String[]{"A. Jeff Bezos", "B. Bill Gates", "C. Elon Musk", "D. Sundar Pichai"}, "C"),
        };

        int score = 0;

        System.out.println("Welcome to the Quiz Application!");
        System.out.println("Answer the following questions:");
        System.out.println("---------------------------------\n");

        for (Question q : questions) {
            System.out.println(q.question);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(q.correctAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer was: " + q.correctAnswer + "\n");
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Quiz Completed!");
        System.out.println("Your total score is: " + score + "/" + questions.length);

        sc.close();
    }
}

