package com.gqt.corejava.strings;

import java.util.*;

public class QuizApplication {

    static class Question {
        String question;
        String[] options;
        int correctIndex;

        Question(String question, String[] options, int correctIndex) {
            this.question = question;
            this.options = options;
            this.correctIndex = correctIndex;
        }
    }

    static Scanner sc = new Scanner(System.in);
    static boolean audienceUsed = false;
    static boolean fiftyFiftyUsed = false;
    static int[] prizeMoney = {10000, 20000, 30000, 40000, 50000, 100000, 200000, 300000, 400000, 500000};

    public static void main(String[] args) {
        Question[] questions = loadQuestions();
        int win_amount = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of the Player");
        String name=sc.nextLine();
        System.out.println("Enter email of the Player");
        String email=sc.nextLine();
        System.out.println("Enter mobileno of the Player");
        long mobileNo=sc.nextLong();
        System.out.println("Hello"+" "+name+" "+"Welcome to the quiz application");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i].question);
            for (int j = 0; j < 4; j++) {
                System.out.println((char) ('A' + j) + ". " + questions[i].options[j]);
            }

            System.out.println(name+" "+"Choose your answer (A/B/C/D) or type:\nL - Lifeline\nQ - Quit");

            String input = sc.next().toUpperCase();

            if (input.equals("Q")) {
                printColored(name+", "+"You chose to quit. You won ₹" + win_amount, "\u001B[35m");
                System.out.println("Name: "+name);
                System.out.println("Email: "+email);
                System.out.println("MobileNo: "+mobileNo);
                return;
            }

            if (input.equals("L")) {
                useLifeline(i, questions[i]);
                i--; 
                continue;
            }

            int chosenIndex = input.charAt(0) - 'A';
            if (chosenIndex == questions[i].correctIndex) {
            	 win_amount = prizeMoney[i];
                printColored(name+" "+"your answer is correct! you won ₹" +  win_amount, "\u001B[32m");
            } else {
                printColored(name+" "+"your answer is wrong", "\u001B[31m");
                System.out.println("Name: "+name);
                System.out.println("Email: "+email);
                System.out.println("MobileNo: "+mobileNo);
                if (i < 4) {
                    win_amount = 0;
                } else if (i >= 4 && i < 7) {
                	 win_amount = prizeMoney[4];
                }else if(i>=7) {
                	 win_amount=prizeMoney[6];
                }
                System.out.println(name+" "+"Your final amount: ₹" +  win_amount);
                return;
            }
        }
        
        printColored(name+" "+"🎉 Congratulations! You completed the quiz. You won ₹" + win_amount, "\u001B[36m");
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("MobileNo: "+mobileNo);
    }

    private static void useLifeline(int qIndex, Question q) {
        System.out.println("Choose a lifeline:\n1. Audience Poll" + (audienceUsed ? " (USED)" : "") +
                "\n2. 50-50" + (fiftyFiftyUsed ? " (USED)" : ""));

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (audienceUsed) {
                    System.out.println("Audience Poll already used.");
                } else {
                    audienceUsed = true;
                    Random r = new Random();
                    int correct = q.correctIndex;
                    System.out.println("Audience Poll Result:");
                    for (int i = 0; i < 4; i++) {
                        int percent = i == correct ? r.nextInt(50) + 40 : r.nextInt(20);
                        System.out.println((char) ('A' + i) + ": " + percent + "%");
                    }
                }
                break;
            case 2:
                if (fiftyFiftyUsed) {
                    System.out.println("50-50 already used.");
                } else {
                    fiftyFiftyUsed = true;
                    System.out.println("Options left:");
                    System.out.println((char) ('A' + q.correctIndex) + ". " + q.options[q.correctIndex]);
                    for (int i = 0; i < 4; i++) {
                        if (i != q.correctIndex) {
                            System.out.println((char) ('A' + i) + ". " + q.options[i]);
                            break;
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid lifeline.");
        }
    }

    private static void printColored(String message, String colorCode) {
        String RESET = "\u001B[0m";
        System.out.println(colorCode + message + RESET);
    }

    private static Question[] loadQuestions() {
        return new Question[]{
                new Question("What is the capital of India?", new String[]{"Delhi", "Mumbai", "Chennai", "Kolkata"}, 0),
                new Question("Who is known as the father of computers?", new String[]{"Charles Babbage", "Alan Turing", "Bill Gates", "Steve Jobs"}, 0),
                new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Venus", "Jupiter"}, 1),
                new Question("Which is the largest mammal?", new String[]{"Elephant", "Giraffe", "Blue Whale", "Hippopotamus"}, 2),
                new Question("Which festival is known as the festival of lights?", new String[]{"Holi", "Diwali", "Eid", "Christmas"}, 1),
                new Question("Who wrote the national anthem of India?", new String[]{"Tagore", "Nehru", "Gandhi", "Subhas"}, 0),
                new Question("Which gas is most abundant in the Earth's atmosphere?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, 2),
                new Question("Which country invented tea?", new String[]{"India", "China", "England", "Japan"}, 1),
                new Question("How many continents are there?", new String[]{"5", "6", "7", "8"}, 2),
                new Question("Which is the smallest prime number?", new String[]{"1", "2", "3", "5"}, 1)
        };
    }
}
