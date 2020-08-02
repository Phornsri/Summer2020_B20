package day23Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number berween 1~ 12");
        int n = scan.nextInt();
        System.out.println(months[n-1]);
    }
}
