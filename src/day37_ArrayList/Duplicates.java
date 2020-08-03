package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8));

        list.removeIf(p -> Collections.frequency(list,p) ==1 );
        System.out.println(list);

        System.out.println("===================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida") );

        names.removeIf( p ->   p.toLowerCase().charAt(0) != p.charAt(p.length()-1)   );

        System.out.println(names);

        System.out.println("============================================");

        ArrayList<Integer> grade = new ArrayList<>();
        grade.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
           gradeOfA.addAll(grade);
           gradeOfA.removeIf(p -> p <= 90 && p > 100);
        System.out.println("Your grade is A:"+gradeOfA.size() );

        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
           gradeOfB.addAll(grade);
           gradeOfB.removeIf(p -> p <= 80 && p > 89) ;
        System.out.println("Your grade is B: "+gradeOfB.size() );

        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
           gradeOfC.addAll(grade);
           gradeOfB.removeIf(p-> p <= 70 && p > 79);
        System.out.println("Your grade is C:" +gradeOfC.size() );

        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
           gradeOfD.addAll(grade);
           gradeOfD.removeIf(p-> p <= 60 && p > 69);
        System.out.println("Your grade is D: "+gradeOfD.size() );

        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
           gradeOfF.addAll(grade);
           gradeOfF.removeIf(p-> p < 0 && p > 59);
        System.out.println("Your grade is F:"+gradeOfF.size() );


        /*
        how many students made:
                A?
                B?
                C?
                D?
        how many failed?
        DO NOT use loop
         */




    }
}
