package WarmUpTask;
/*
2. write a program that stores the unique characters
from a string into map:

        Ex: "abacbdeef";
        output:
            {c=1, d=1, f=1}

 */

import java.util.*;

public class Task2_UniqueCharacters_StringMap {
    public static void main(String[] args) {

        String str = "abacbdeef";

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        Map<String, Integer> uniqueChar = new LinkedHashMap<>();
        for(int x = 0; x < list.size();x++){
            if((Collections.frequency(list,list.get(x))) == 1){
                uniqueChar.put(list.get(x), (Collections.frequency(list,list.get(x))));
            }
        }
        System.out.println(uniqueChar);

    }
}
