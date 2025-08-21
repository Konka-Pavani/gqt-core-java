package com.gqt.corejava.swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class QuizGameGUI extends JFrame {
    private JLabel questionLabel, statusLabel;
    private JRadioButton[] optionButtons;
    private ButtonGroup optionsGroup;
    private JButton fiftyFiftyBtn, audienceBtn, submitBtn, quitBtn;
    private String[] questions = {
        "What is the capital of France?",
        "Who was the Indian captain when India won their first ODI World Cup in 1983?",
        "Who was the first president of the United States?",
        "What is the correct value of 54 / (9-3) + 1 * 6?",
        "What is chemical formula of common salt?",
        "Which is the largest continent by area?",
        "What is the Scientific study of animal behaviour called?",
        "What is the body's largest organ (by surface area)?",
        "Which vitamin does human skin naturally produce when exposed to sunlight?",
        "The Eiffel Tower is a global symbol of which country?"
    };
    private String[][] options = {
        {"Berlin", "Madrid", "Paris", "Rome"},
        {"Kapil Dev", "Sunil Gavaskar", "Sachin Tendulkar", "Mohinder Amarnath"},
        {"George Washington", "John Adams", "Thomas Jefferson", "Abraham Lincoln"},
        {"8", "15", "20", "50"},
        {"NaCl₂", "Na₂ClO", "KCl", "NaCl"},
        {"Africa", "Europe", "Asia", "Antarctica"},
        {"Zoology", "Ecology", "Embryology", "Ethology"},
        {"Skin", "Liver", "Lung", "Kidney"},
        {"Vitamin A", "Vitamin C", "Vitamin D", "Vitamin E"},
        {"Germany", "France", "Britain", "Italy"}
    };
    private int[] correct = {2, 0, 0, 1, 3, 0, 3, 0, 2, 1};
    private int[] prize = {1000,2000,5000,10000,20000,40000,80000,160000,320000,1000000};
    private int currentIndex = 0;
    private boolean used5050 = false, usedAudience = false;
    private int totalWinnings = 0, safeWinnings = 0;

    public QuizGameGUI() {
        setTitle("Quiz Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout(10, 10));

        // Top: question & status
        JPanel topPanel = new JPanel(new GridLayout(2,1));
        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        statusLabel = new JLabel("Winnings: ₹0", SwingConstants.CENTER);
        topPanel.add(questionLabel);
        topPanel.add(statusLabel);
        add(topPanel, BorderLayout.NORTH);

        // Center: options
        JPanel centerPanel = new JPanel(new GridLayout(2,2,10,10));
        optionButtons = new JRadioButton[4];
        optionsGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton();
            optionsGroup.add(optionButtons[i]);
            centerPanel.add(optionButtons[i]);
        }
        add(centerPanel, BorderLayout.CENTER);

        // Bottom: buttons
        JPanel buttonPanel = new JPanel();
        fiftyFiftyBtn = new JButton("50:50");
        audienceBtn = new JButton("Audience Poll");
        submitBtn = new JButton("Submit");
        quitBtn = new JButton("Quit");
        buttonPanel.add(fiftyFiftyBtn);
        buttonPanel.add(audienceBtn);
        buttonPanel.add(submitBtn);
        buttonPanel.add(quitBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        // Button actions
        fiftyFiftyBtn.addActionListener(e -> useFiftyFifty());
        audienceBtn.addActionListener(e -> useAudiencePoll());
        submitBtn.addActionListener(e -> handleSubmit());
        quitBtn.addActionListener(e -> endGame("You chose to quit."));

        loadQuestion();
        setVisible(true);
    }

    private void loadQuestion() {
        if (currentIndex >= questions.length) {
            endGame("Congratulations! You are a Crorepati!");
            return;
        }
        questionLabel.setText("Q" + (currentIndex+1) + ": " + questions[currentIndex]);
        for (int i = 0; i < 4; i++) {
            optionButtons[i].setText(options[currentIndex][i]);
            optionButtons[i].setEnabled(true);
        }
        optionsGroup.clearSelection();
    }

    private void useFiftyFifty() {
        if (used5050) {
            JOptionPane.showMessageDialog(this, "50:50 already used!");
            return;
        }
        used5050 = true;
        int correctIdx = correct[currentIndex];
        Random r = new Random();
        int wrongIdx;
        do {
            wrongIdx = r.nextInt(4);
        } while (wrongIdx == correctIdx);
        // disable the other two options
        for (int i = 0; i < 4; i++) {
            if (i != correctIdx && i != wrongIdx) {
                optionButtons[i].setEnabled(false);
            }
        }
    }

    private void useAudiencePoll() {
        if (usedAudience) {
            JOptionPane.showMessageDialog(this, "Audience Poll already used!");
            return;
        }
        usedAudience = true;
        Random r = new Random();
        int correctPct = 50 + r.nextInt(41); // 50-90%
        int rem = 100 - correctPct;
        int a = r.nextInt(rem+1);
        int b = r.nextInt(rem - a +1);
        int c = rem - a - b;
        String msg = String.format("Audience Poll:\nA: %d%%\nB: %d%%\nC: %d%%\nD: %d%%",
                correctIdxLetter(0)==correct[currentIndex] ? correctPct : a,
                correctIdxLetter(1)==correct[currentIndex] ? correctPct : a,
                correctIdxLetter(2)==correct[currentIndex] ? correctPct : b,
                correctIdxLetter(3)==correct[currentIndex] ? correctPct : c
        );
        JOptionPane.showMessageDialog(this, msg);
    }

    private int correctIdxLetter(int letterIdx) {
        // Not needed, keeping structure—always maps to index
        return letterIdx;
    }

    private void handleSubmit() {
        int sel = -1;
        for (int i = 0; i < 4; i++) {
            if (optionButtons[i].isSelected()) {
                sel = i; break;
            }
        }
        if (sel == -1) {
            JOptionPane.showMessageDialog(this, "Please select an option or Quit.");
            return;
        }
        if (sel == correct[currentIndex]) {
            totalWinnings = prize[currentIndex];
            statusLabel.setText("Winnings: ₹" + totalWinnings);
            JOptionPane.showMessageDialog(this, "Correct! You win ₹" + totalWinnings);
            if (currentIndex == 4) safeWinnings = prize[4];
            if (currentIndex == 6) safeWinnings = prize[6];
            currentIndex++;
            loadQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "Wrong! Game over.");
            if (currentIndex < 5) totalWinnings = 0;
            else if (currentIndex < 7) totalWinnings = safeWinnings = prize[4];
            else totalWinnings = safeWinnings = prize[6];
            statusLabel.setText("Winnings: ₹" + totalWinnings);
            endGame("Game Over!");
        }
    }

    private void endGame(String message) {
        JOptionPane.showMessageDialog(this, message + "\nYou won ₹" + totalWinnings);
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizGameGUI::new);
    }
}