package day07_Unary_ShortHand;

public class Divisible_2_3_5 {

    public static void main(String[] args) {
        int number = 1500;
        boolean divisibleBy2 = number % 2 ==0;
        boolean divisibleBy3 = number % 3 ==3;
        boolean divisibleBy5 = number % 5 ==5;

        System.out.println(number+" is evenly divisible by 2: " + divisibleBy2);
        System.out.println(number+" is evenly divisible by 3: " + divisibleBy3);
        System.out.println(number+" is evenly divisible by 5: " + divisibleBy5);


    }
}