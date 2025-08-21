package com.gqt.corejava.encapsulation;
class StudentMarks {
    private String name;
    private int rollNumber;
    private int marks;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }
}

public class StudentMarksDemo {
    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
        sm.setName("Alice");
        sm.setRollNumber(102);
        sm.setMarks(95);

        System.out.println("Student: " + sm.getName() + " " + sm.getRollNumber() + " Marks=" + sm.getMarks());
    }
6}
