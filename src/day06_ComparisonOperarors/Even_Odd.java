package day06_ComparisonOperarors;

public class Even_Odd {
    /*
    int x = 1000;
odd: x % 2 != 0  ===> false
even: x % 2 == 0 ===> true
divisible by 3:  x % 3 == 0  ===> false
divisible by 5:  x % 5 == 0  ===> true
divisible by 10: x % 10 == 0  ===> true
     */
    public static void main(String[] args) {
        int x=1000;
        boolean odd = x%2 != 0;         // false
        boolean even = x%2 == 0;        // true
        System.out.println(odd);
        System.out.println(even);

        boolean result1=x%3 == 0;       //false
        boolean result2=x%5==0;         //true
        boolean result3=x%10==0;       // true

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
