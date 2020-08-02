package day22_NestedLoop;
 /*
    Username: cyber
    password: tek123
     */

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        while(!(u.equals("cyber") && p.equals("tek123") ) ){
            System.out.println();
        }

    }

}
