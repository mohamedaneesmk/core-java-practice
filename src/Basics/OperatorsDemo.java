package basics;

public class OperatorsDemo {
    public static void main(String[] args) { 

        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational
        System.out.println(a > b);
        System.out.println(a < b);

        // Logical
        System.out.println(a > b && b < a);
        System.out.println(a > b || b > a);

        // Unary
        System.out.println(++a);
        System.out.println(--b);
    }
}

