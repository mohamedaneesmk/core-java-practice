package oop;

public class Developer extends Employee { // Inheritance
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void display() { // Polymorphism
        System.out.println("Developer: " + getSalary());
    }
}
