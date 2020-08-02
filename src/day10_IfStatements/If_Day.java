package day10_IfStatements;
/* 2. Write an if statement that will print day of the week based on value of the day variable.
        Ex:
            num = 1
        output:
            "Monday"
            num = 8
        output:
            "There is no such a day!"
            num = 3

        output:
            Wednesday */
public class If_Day {
    public static void main(String[] args) {
        int day = 3;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("There is no such a day!");

        }
        System.out.println("=================");

        /* write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
        ex:
            month = 3
        output:
            31 days
            month = 4
        output:
            30 days
            month = 13
        output:
            Invalid month

        HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12
*/
        int month = 4;
        String Day = "";
        if (month==2){
            Day= "28 days";
        } else if (month==4||month==6||month==9||month==11){
            Day="30 days";
        }else if(month==1||month==3||month==5||month==7||month==7||month==8||month==12){
            Day="31 days";
        }else {
            Day="Invalid month";
        }
        System.out.println(day);




    }
}
