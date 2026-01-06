package Control_Statements;

public class InfiniteLoopDemo {
    public static void main(String[] args) {

        int i = 1;

        while (true) {
            System.out.println("Infinite Loop: " + i);
            i++;

            if (i == 5) {
                break;
            }
        }
    }
}
