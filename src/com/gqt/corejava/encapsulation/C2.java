class Student {
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

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Pavani");
        s.setRollNumber(501);
        s.setMarks(88);

        System.out.println("Student: " + s.getName() + " " + s.getRollNumber() + " Marks=" + s.getMarks());
    }
}
