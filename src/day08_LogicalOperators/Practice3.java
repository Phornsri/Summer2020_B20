package day08_LogicalOperators;

public class Practice3 {
    public static void main(String[] args) {
        int b =2;
        boolean result = ++b == 2 || --b == 2 && --b == 2;
        // result= 3 == 2  ||  2 == 2  &&  1 ==2
        // result= false  ||   true   &&  false
        // result = false || false
        // result = false
        System.out.println(result);


    }
}
