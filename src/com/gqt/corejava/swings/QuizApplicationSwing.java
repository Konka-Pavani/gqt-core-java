package com.gqt.corejava.swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class QuizApplicationSwing extends JFrame implements ActionListener {

    private String[] questions = {
            "Who invented the java programming?" ,
            "Which component is used to compile,debug and execute the java programs?",
            "Which one of the following is not a java feature?",
            "What is the extension of java code files?",
            "Which environment variable is used to set the java path?",
            "What is the extension of compiled java classes?",
            "What is the numerical range of a char datatype in java?",
            "Which of these method of String class can be used to test two strings for equality?",
            "Which of these method of String class is used to obtain character at specified index?",
            "What is the purpose of the 'length' attribute in a java array?"
    };

    private String[][] options = {
            {"A. Gudio van Rossum", "B. James Gosling", "C. Dennies Ritchie", "D. Bjarne Stroustrup"},
            {"A. JRE", "B. JIT", "C. JDK", "D. JVM"},
            {"A. Object-Oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible"},
            {"A. .js", "B. .txt", "C. .class", "D. .java"},
            {"A. MAVEN_path", "B. JavaPATH", "C. JAVA", "D. JAVA_HOME"},
            {"A. .js", "B. .txt", "C. .class", "D. .java"},
            {"A. 0 to 256", "B. -128 to 127", "C. 0 to 65535", "D. 0 to 32767"},
            {"A. isequal()", "B.isequals()", "C. equal()", "D. equals()"},
            {"A. char()", "B. Charat()", "C. charat()", "D. charAt()"},
            {"A. to determine the size of the array", "B. to modify the size of the array", "C. to sort the array", "D. to initialize the array"}
    };

    private int[] correctAnswers = {1, 2, 1, 3, 3, 2, 2, 3, 3, 0};
    private int[] prizeMoney = {1000, 2000, 5000, 10000, 20000, 40000, 80000, 160000, 320000, 1000000};

    private int currentQ = 0;
    private int totalWinnings = 0;
    private boolean used5050 = false;
    private boolean usedAudience = false;

    private JLabel questionLabel;
    private JButton[] optionButtons;
    private JButton fiftyBtn, audienceBtn, quitBtn;

    public QuizApplicationSwing() {
        setTitle("Java Ultimate Quiz Challenge");
        setSize(600, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        questionLabel = new JLabel("Question", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(questionLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        optionButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JButton();
            optionButtons[i].addActionListener(this);
            centerPanel.add(optionButtons[i]);
        }
        add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        fiftyBtn = new JButton("50:50");
        fiftyBtn.addActionListener(this);
        audienceBtn = new JButton("Audience Poll");
        audienceBtn.addActionListener(this);
        quitBtn = new JButton("Quit");
        quitBtn.addActionListener(this);

        bottomPanel.add(fiftyBtn);
        bottomPanel.add(audienceBtn);
        bottomPanel.add(quitBtn);

        add(bottomPanel, BorderLayout.SOUTH);

        loadQuestion();
    }

    private void loadQuestion() {
        if (currentQ >= questions.length) {
            JOptionPane.showMessageDialog(this, "🎉 Congratulations! You won ₹" + totalWinnings);
            System.exit(0);
        }
        questionLabel.setText("Q" + (currentQ + 1) + ": " + questions[currentQ]);
        for (int i = 0; i < 4; i++) {
            optionButtons[i].setText(options[currentQ][i]);
            optionButtons[i].setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quitBtn) {
            JOptionPane.showMessageDialog(this, "You quit the game. Total Winnings: ₹" + totalWinnings);
            System.exit(0);
        }

        if (e.getSource() == fiftyBtn && !used5050) {
            used5050 = true;
            useFiftyFifty();
            return;
        }

        if (e.getSource() == audienceBtn && !usedAudience) {
            usedAudience = true;
            useAudiencePoll();
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (e.getSource() == optionButtons[i]) {
                if (i == correctAnswers[currentQ]) {
                    totalWinnings = prizeMoney[currentQ];
                    JOptionPane.showMessageDialog(this, "✅ Correct! You won ₹" + totalWinnings);
                    currentQ++;
                    loadQuestion();
                } else {
                    JOptionPane.showMessageDialog(this, "❌ Wrong! You won ₹" + totalWinnings);
                    System.exit(0);
                }
            }
        }
    }

    private void useFiftyFifty() {
        int correctIndex = correctAnswers[currentQ];
        Random rand = new Random();
        int wrong;
        do {
            wrong = rand.nextInt(4);
        } while (wrong == correctIndex);

        for (int i = 0; i < 4; i++) {
            if (i != correctIndex && i != wrong) {
                optionButtons[i].setEnabled(false);
            }
        }
    }

    private void useAudiencePoll() {
        int correct = new Random().nextInt(40) + 50; // 50–90%
        int rem = 100 - correct;
        int opt2 = new Random().nextInt(rem);
        int opt3 = new Random().nextInt(rem - opt2);
        int opt4 = rem - opt2 - opt3;

        JOptionPane.showMessageDialog(this,
                "📊 Audience Poll:\nA: " + correct + "%\nB: " + opt2 + "%\nC: " + opt3 + "%\nD: " + opt4 + "%");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizApplicationSwing().setVisible(true));
    }
}