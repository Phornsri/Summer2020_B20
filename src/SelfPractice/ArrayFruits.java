package SelfPractice;

import java.util.Scanner;

public class ArrayFruits {
    public static void main(String[] args) {
        String [] fruitName = {"Apple","Orange","Watermelon","Grapes","Mango","Papaya"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name and number of fruits:");
        String[] fruitsNum = new String[6];

        fruitsNum [3] = "Orange";
        fruitsNum [0] = "Watermelon";
        fruitsNum [1] = "Grapes";
        fruitsNum [4] = "Mango";
        fruitsNum [2] = "Apple";
        fruitsNum [5] = "Papaya";

        for(int i = 0; i <= fruitsNum.length -1; i++){
            System.out.print(fruitsNum[i]+" ");
        }

        System.out.println();
        System.out.println("===================");

        System.out.println("Enter a number");
        int n = scan.nextInt();
        System.out.println(fruitsNum[n-4]);



    }
}
