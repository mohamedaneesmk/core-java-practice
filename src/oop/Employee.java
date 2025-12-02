package oop;

public class Employee {
    private String name; // Encapsulation
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}
