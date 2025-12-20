package Basics;

public class TypeCastingDemo {
    public static void main(String[] args) {

        // Implicit casting (Widening)
        int a = 10;
        double b = a;
        System.out.println("Implicit casting: " + b);

        // Explicit casting (Narrowing)
        double x = 25.78;
        int y = (int) x;
        System.out.println("Explicit casting: " + y);
    }
}
