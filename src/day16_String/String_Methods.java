package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";

        email = email.replace("gmail","yahoo"); //"cybertek@yahoo.com"
        System.out.println(email);

        String word = "java";
        word.replace("a", "e"); // "java"
        System.out.println(word );

        String sentence = "I like to learn Java, Java  is cool, Java is fun";
        sentence = sentence.replace("a,Java","a, C#");

        sentence = sentence.replace("Java ", "Python ");

        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";  //MIT

        s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");

        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java"; //r

        s2 = s2.replace("R", "r");  // "I like to learn Java"

        System.out.println(s2);

        // replaceFirst:
        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "cola"); //"I like to drink tea and tea"
        System.out.println(s3);

        String s4 = "I like to Watch Game ot thrones, and Walking dead";
              s4= s4.replace(", and Walking dead","" ); // String s4 = "I like to Watch Game ot thrones, and Walking dead"
        System.out.println(s4);

        // indexOf()
        String s5 = " I like to stsy in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");

        System.out.println(r1);
        System.out.println(r2);





    }
}
