package day52_Exceptionss.Phornsri;
/*
4. create a class called Google
            create 5 objects of the Tester and 5 objects of Developer
            create an arrayList of Tester and an ArrayList of Developer, store those 5 objects of the Tester & Developers
            use for each loop to iterate Tester & Developer objects from in those arrayLists
                print out the tester & developer who has the highest salary
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Google {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Ashenafi",31,'M',231,"QA",150000);
        Tester tester2 = new Tester("Jacob",37,'M',3310,"SDET",130000);
        Tester tester3 = new Tester("Jelemie",30,'M',0231,"SDET",250000);
        Tester tester4 = new Tester("Greace",29,'F',5126,"Lead",380000);
        Tester tester5 = new Tester("Virginia",33,'F',7861,"Manager",950000);

        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5) );

        Developer developer1 =new Developer("Cihan",35,'M',3450,"PO",210000);
        Developer developer2 =new Developer("Christina",33,'F',3586,"Dev",180000);
        Developer developer3 =new Developer("Dilyar",36,'M',9857,"Team Lead",190000);
        Developer developer4 =new Developer("Slobodanka",37,'F',4673,"Dev",150000);
        Developer developer5 =new Developer("Parizat",38,'F',977,"SM",150000);

        ArrayList<Developer> developers = new ArrayList<>();
        developers.addAll(Arrays.asList(developer1,developer2,developer3,developer4,developer5) );



    }
}
