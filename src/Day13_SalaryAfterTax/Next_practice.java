package Day13_SalaryAfterTax;

import java.util.Scanner;

public class Next_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.next();

        System.out.println("Enter your last name:");
        String lastName = scan.next();

        String fullName = firstName+ " "+lastName;
        System.out.println("Full name is: "+fullName);
    }
}
