package com.gqt.corejava.encapsulation;
class Student2 {
    private String name;
    private int rollNumber;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class StudentGetterDemo {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.setName("John");
        s1.setRollNumber(101);
        s1.setAge(20);

        System.out.println("Student: " + s1.getName() + " " + s1.getRollNumber() + " " + s1.getAge());
    }
}
