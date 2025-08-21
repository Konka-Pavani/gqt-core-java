package com.gqt.corejava.encapsulation;
class Employee {
    private String name;
    private int id;
    private double salary;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ravi");
        emp.setId(501);
        emp.setSalary(60000);

        System.out.println("Employee: " + emp.getName() + " " + emp.getId() + " Salary=" + emp.getSalary());
    }
}
