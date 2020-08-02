package day13_WarmUp_Task;

import java.util.Scanner;

/* write a program that asks the user to enter:
                        1. building number
                        2. street name (assume it has one word only)
                        3. road name (assume it has one word only)
                        4. city name (assume it has one word only)
                        5. state
                        6. zipcode
            and then print out the full address
                ex:
                    input:
                            7925
                            JonesBranch
                            Dr
                            McLean
                            VA
                            22000
                    output:
                        addrees:    7925 JonesBranch Dr, McLean VA, 22000
 */
public class Building_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter building number:");

        int building = scan.nextInt();
        System.out.println("Enter street name:");
        String streetName = scan.next();

        System.out.println("Enter road name:");
        String roadName = scan.next();

        System.out.println("Enter city name:");
        String cityName = scan.next();

        System.out.println("Enter state:");
        String stateName = scan.next();

        System.out.println("Enter zipcode:");
        int zipCode = scan.nextInt();

        System.out.println("address:    "+building+ " "+streetName+ " "+roadName+ ","+cityName+ " "+stateName+ ","+zipCode);







    }
}
