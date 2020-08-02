package Day12_Swich_Scanner;
/*2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF  */
public class AgeGroup {
    public static void main(String[] args) {
        int age = 22;

        String ageGroup = " ";

        if(age > 0 && age <= 150){
            if(age < 21){
                ageGroup = "Teenager";
            }else if(age >= 21 && age <= 55){
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }

        }else{
            ageGroup = "Ivalid";
        }
        System.out.println(ageGroup );
        System.out.println("===================");
        // another way :
      // boolean n1Bigger = n1 > n2 && n1 > n3;
        //boolean n2Bigger = !n1Bigger && n2 > n3;

    }
}
