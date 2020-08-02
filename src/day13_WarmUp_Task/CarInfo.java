package day13_WarmUp_Task;

import java.util.Scanner;

/* 1. write a program that asks the user enter his car info:
                            brand
                            model
                            year
                            color
                            mileage
                            price
                ex: output format should be:
                      2012 Toyota Corolla white, 120000 miles, 12000 dollars
 */
public class CarInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car's brand:");

        String brand = scan.nextLine();
        System.out.println("Enter car's model:");


        String model = scan.nextLine();
        System.out.println("Enter car's year:");
        int year = scan.nextInt();
        System.out.println("Enter car's color:");

        String color = scan.next();
        System.out.println("Enter car's mileage:");
        int mileage = scan.nextInt();
        System.out.println("Enter car's price:");

        int price = scan.nextInt();

        double dollars = scan.nextDouble();

        System.out.println(year+ " "+brand+ " "+model+ " "+color+ " "+ ","+mileage+ "miles, "+price+ " "+dollars);




    }
}
