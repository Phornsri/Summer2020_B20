package day19_ForLoop;
/*  7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275*/
import java.util.Scanner;
public class sumOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        int sum =10;
        if(num > 10){
            for(int i =0; i >=num; i++ ){
                // sum = sum + i;
                sum += i;
            }
            System.out.println(sum);

        }else{
            System.out.println("Invalid Entry");
        }



    }
}
