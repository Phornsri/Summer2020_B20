package Office_Hours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = { "C#", "C#", "Python", "Python", "Java", "C++", "Ruby"};
        //                  0      1      2         3        4       5
        // Unique means only one in the elements

        for(String b: words){ // b: represent of elements

            int count = 0; // 0: represent of index
            for(String a : words){
                if(a.equals(b)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(b);
            }

        }

    }
}
