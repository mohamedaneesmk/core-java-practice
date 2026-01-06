package Control_Statements;

public class NestedIfDemo {
    public static void main(String[] args) {

        int age = 25;
        boolean hasVoterId = true;

        if (age >= 18) {
            if (hasVoterId) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Voter ID required");
            }
        } else {
            System.out.println("Not eligible due to age");
        }
    }
}
