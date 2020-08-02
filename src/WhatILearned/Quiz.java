package WhatILearned;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

        int num1 =input.nextInt();
        int num2 =input.nextInt();
        int iterate =input.nextInt();

        int total =0;

        for(int j=0; j<iterate; j++){
            if(j%3 ==0) continue;;
            total += num1 + num2 ;
        }
        System.out.println(total );


*/

        int[] nums ={14,1,84,97,1243,46};
        int total =0;

        for(int i=0; i < nums.length; i++){
            if(nums[i]%2 !=0){
                total += 3;

            }else{
                total += 10;
            }
            if(i % 3 == 0){
                total -=15;
            }
        }
        System.out.println(total );
        System.out.println("============");

        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);
        System.out.println(s2); // ame was tied at 2-2
        int index1 = s.indexOf("game");
        System.out.println(index1);  //4
        int index2 = s2.indexOf("game");
        System.out.println(index2); // -1
        if(index1 == index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }

        System.out.println("===========");

        for(int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i);


        }
        System.out.println("============");
        int a = 0;
        int b = 0;
       b= a % 2 ;
        System.out.println(b);

        System.out.println("========");


        String str = "cybertek";
        for(int i = 0; i <= str.length(); i+=2){
            System.out.print(str.charAt(i));
        }

    }
}
