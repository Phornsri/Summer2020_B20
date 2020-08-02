package StringMethods;

public class Length {
    public static void main(String[] args) {

        String txt = "Hello Cybertek my name is Tammiwan";
        //            012345678
        System.out.println(txt.length() );// total 34 characters

        // charAt(index):
        char ch1= txt.charAt(0); // 'H'
        char ch2 = txt.charAt(7); // 'y'

        System.out.print(ch1);
        System.out.print(ch2);

        System.out.println();

        // length() ==> int
        int l =   txt.length();
        System.out.println(l);

        // last index: length of String - 1
        int lastIndexNumber = txt.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = txt.charAt(lastIndexNumber);
        System.out.println(lastChar);




    }
}
