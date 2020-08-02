package day29_CustomMethods;

public class MethodWithParameter {
    public static void main(String[] args) {

        printHello(5);//n: automatically bc it's parameter
        // it'll print Hello World 5 times
        System.out.println("==============");
        age(2000, 2030);
    }

    public static void printHello(int numberOfTimes) {

        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Hello World");
            // this is how to declare parameter
        }

    }

    public static void age(int birthYear, int currentYear) {

        if (currentYear < birthYear) {
            System.out.println("Invalid Entry");
        } else {
            int age = 2020 - birthYear;
            System.out.println("You are " + age + " years old");
        }
    }
}
