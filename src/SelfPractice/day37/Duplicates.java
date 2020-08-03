package SelfPractice.day37;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Yadigarjan","Ceren","America","Australia","Austria"));
        names.removeIf(p-> p.toLowerCase().charAt(0) != p.charAt(p.length() -1) );
        System.out.println(names);

        System.out.println("=========");


    }
}
