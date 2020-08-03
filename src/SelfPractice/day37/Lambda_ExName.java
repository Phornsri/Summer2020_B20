package SelfPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Lambda_ExName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Panda", "Ashenafi","Phornsri",
                "Sarah","Slobodanka","Cristina","Virginia"));
        names.removeIf(p-> p.startsWith("P") );
        System.out.println(names);


    }
}
