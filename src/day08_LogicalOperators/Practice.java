package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Tanya ";
        String lastName = "Flower";
        int age = 19;
        String citizenShip = "USA";
        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        //                        19 >= 18 && "USA" == "USA"
        //                         true    &&  true
        String fulltName = firstName+ " " + lastName;
        System.out.println(firstName + "is eligible to vote: " + eligibleToVote);


    }
}
