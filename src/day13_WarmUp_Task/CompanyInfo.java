package day13_WarmUp_Task;

import java.util.Scanner;

/* write a program that asks the user enter the:
                    1. company name
                    2. first name
                    3. last name
                    4. Job title
                    5. salary
 */
public class CompanyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter company name:");
        String companyName = scan.nextLine();
        System.out.println("Company name is:"+ " "+companyName);

        System.out.println("Enter first name:");
        String firstName = scan.nextLine();
        System.out.println("FirstName is:"+ " "+firstName);

        System.out.println("Enter last name:");
        String lastName = scan.nextLine();
        System.out.println("LastName is:"+ " "+lastName);

        System.out.println("Enter job title:");
        String jobTitle = scan.nextLine();
        System.out.println("JobTiTle is:"+ " "+jobTitle);

        System.out.println("Enter annual salary:");
       double  salary = scan.nextDouble();
        System.out.println("Annual salary is:"+ " $ "+salary);

        scan.close();












    }
}
