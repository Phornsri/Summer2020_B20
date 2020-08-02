package Day13_SalaryAfterTax;

import java.util.Scanner;

public class NextLine_Vs_NextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Enter
        System.out.println("Enter your salary:");
        double salary = scan.nextDouble(); // 120000

        scan.nextLine();
        //use this to take put the Enters that are left in the scanner. so that we can use the next nextLine method
        // Enter

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);

    }
}
