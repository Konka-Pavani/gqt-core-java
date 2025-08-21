package com.gqt.corejava.projects;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuizAppSwings extends JFrame implements ActionListener {

    String[] questions = {
            "What is the capital of India?",
            "What is the national bird?",
            "Who is known as the father of computers?",
            "Which planet is known as the Red Planet?",
            "Which is the largest mammal?",
            "Which festival is known as the festival of lights?",
            "Who wrote the national anthem of India?",
            "Which gas is most abundant in the Earth's atmosphere?",
            "Which country invented tea?",
            "How many continents are there?"
    };

    String[][] options = {
            {"A. Delhi", "B. Goa", "C. Pune", "D. Paris"},
            {"A. Peacock", "B. Parrot", "C. Eagle", "D. Sparrow"},
            {"A. Charles Babbage", "B. Alan Turing", "C. Bill Gates", "D. Steve Jobs"},
            {"A. Earth", "B. Mars", "C. Venus", "D. Jupiter"},
            {"A. Elephant", "B. Giraffe", "C. Blue Whale", "D. Hippopotamus"},
            {"A. Holi", "B. Diwali", "C. Eid", "D. Christmas"},
            {"A. Tagore", "B. Nehru", "C. Gandhi", "D. Subhas"},
            {"A. Oxygen", "B. Carbon Dioxide", "C. Nitrogen", "D. Hydrogen"},
            {"A. India", "B. China", "C. England", "D. Japan"},
            {"A. 5", "B. 6", "C. 7", "D. 8"}
    };

    char[] correctAnswer = {'A', 'A', 'A', 'B', 'C', 'B', 'A', 'C', 'B', 'C'};
    int[] prizeMoney = {10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};

    int index = 0, money = 0;
    boolean audienceUsed = false, fiftyUsed = false;

    JLabel qLabel;
    JRadioButton optA, optB, optC, optD;
    ButtonGroup group;
    JButton nextBtn, lifelineBtn, quitBtn;

    QuizAppSwings() {
        setTitle("Quiz Game - Swing Edition");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        qLabel = new JLabel("", JLabel.CENTER);
        qLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(qLabel, BorderLayout.NORTH);

        optA = new JRadioButton();
        optB = new JRadioButton();
        optC = new JRadioButton();
        optD = new JRadioButton();

        group = new ButtonGroup();
        group.add(optA); group.add(optB); group.add(optC); group.add(optD);

        JPanel options = new JPanel(new GridLayout(4,1));
        options.add(optA); options.add(optB);
        options.add(optC); options.add(optD);
        add(options, BorderLayout.CENTER);

        JPanel btns = new JPanel();
        nextBtn = new JButton("Submit");
        lifelineBtn = new JButton("Use Lifeline");
        quitBtn = new JButton("Quit");

        btns.add(nextBtn);
        btns.add(lifelineBtn);
        btns.add(quitBtn);
        add(btns, BorderLayout.SOUTH);
//
//        nextBtn.addActionListener(this);
//        lifelineBtn.addActionListener(this);
//        quitBtn.addActionListener(this);

        loadQuestion();

        nextBtn.addActionListener(this);
        lifelineBtn.addActionListener(this);
        quitBtn.addActionListener(this);
        setVisible(true);
    }

    void loadQuestion() {
        if(index < questions.length) {
            qLabel.setText("Q" + (index+1) + ". " + questions[index]);
            optA.setText(options[index][0]);
            optB.setText(options[index][1]);
            optC.setText(options[index][2]);
            optD.setText(options[index][3]);
            group.clearSelection();
        } else {
            JOptionPane.showMessageDialog(this, 
                    "🎉 Congratulations! You won Rs. " + money, 
                    "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==nextBtn) {
            char selected = 'X';
            if(optA.isSelected()) selected = 'A';
            else if(optB.isSelected()) selected = 'B';
            else if(optC.isSelected()) selected = 'C';
            else if(optD.isSelected()) selected = 'D';

            if(selected == correctAnswer[index]) {
                money = prizeMoney[index];
                JOptionPane.showMessageDialog(this, 
                        "✅ Correct! You won Rs. " + money, 
                        "Result", JOptionPane.INFORMATION_MESSAGE);
                index++;
                loadQuestion();
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Wrong Answer!\nYou won Rs. " + money, 
                        "Game Over", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }

        else if(e.getSource()==lifelineBtn) {
            if(audienceUsed && fiftyUsed) {
                JOptionPane.showMessageDialog(this, "No lifelines left!");
            } else {
                String[] choices = {"Audience Poll", "50-50"};
                String choice = (String) JOptionPane.showInputDialog(this, 
                        "Choose Lifeline", "Lifeline", JOptionPane.QUESTION_MESSAGE, 
                        null, choices, choices[0]);

                if("Audience Poll".equals(choice) && !audienceUsed) {
                    audienceUsed = true;
                    JOptionPane.showMessageDialog(this, 
                            "Audience Poll Suggests: " + correctAnswer[index], 
                            "Audience Poll", JOptionPane.INFORMATION_MESSAGE);
                } else if("50-50".equals(choice) && !fiftyUsed) {
                    fiftyUsed = true;
                    JOptionPane.showMessageDialog(this, 
                            "50-50 removes two wrong options.\nKeep " + correctAnswer[index] + " and "+correctAnswer[index+1],
                            "50-50", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        else if(e.getSource()==quitBtn) {
            JOptionPane.showMessageDialog(this, 
                    "You quit with Rs. " + money, 
                    "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new QuizAppSwings();
    }
}
