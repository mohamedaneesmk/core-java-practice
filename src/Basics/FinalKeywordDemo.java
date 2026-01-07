package basics;

public class FinalKeywordDemo {
 
    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        System.out.println("Max Value: " + MAX_VALUE);

        // MAX_VALUE = 200; // Compile-time error
    } 
}

