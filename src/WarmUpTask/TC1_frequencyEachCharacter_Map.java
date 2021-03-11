package WarmUpTask;
import java.util.*;

/*
1. Write a program that stores the the character
 and frequency of each character from a String in to a Map

    Ex: "aaabbbccb"
    output:
        {a=3, b=4, c=2}
 */
public class TC1_frequencyEachCharacter_Map {
    public static void main(String[] args) {

        String str = "aaabbbccb";

        List<String> list = new ArrayList<>(Arrays.asList(str.split(""))); // split store to ashe
        Map<String, Integer> myMap = new LinkedHashMap<>(); // create a new map collect
        for (int x = 0; x < list.size(); x++) {
            myMap.put(list.get(x), Collections.frequency(list, list.get(x)));
        }
        System.out.println(myMap);



    }
}
