package day23Arrays;

import java.util.Scanner;

/*   1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loo */
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 + num2;

            System.out.println(result );

            System.out.println("Do you want cotinue?");
            String a = input.next().toLowerCase();

            while(!(a.equals("yes") || a.equals("no") ) ){
                System.out.println("Invalid Answer, please yes or no");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }


            if(a.equals("no") ){
                break;
            }

        }
        System.out.println("Thanks for using Cybertek!");
    }
}
