package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Tanya";
        String lastName = "Eden";
        String fullName = firstName + " " + lastName;
        int age = 32;
        String citizen = "USA";
        boolean eligibleVote = age > 18 && citizen == "USA";
        boolean notEligible = !eligibleVote;
        if (eligibleVote) {
            System.out.println(fullName + ": You are eligible to vote ");
        }
        if (notEligible) {
            System.out.println(fullName + ": You are not eligible to vote ");
        }
    }
}