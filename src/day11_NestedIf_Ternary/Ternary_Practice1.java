package day11_NestedIf_Ternary;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        // " can vote" or "can not vote"
        int age = 23;
        String citizen = " USA";

        String result = " ";
        if (age >= 18 && citizen == "USA") {
            result = "can vote";
        } else {
            result = "Can Not Vote";
        }
        System.out.println(result);

        String result2 = (age >= 18 && citizen == "USA") ? "Can vote": "Can not Vote";
        System.out.println(result2 );
        System.out.println("===================================================");
        int n1 = 100;
        int n2 = 200;

        String r = (n1 == n2) ? "Equal" : "Not Equal" ;
        // "equal" or "not equal"

        System.out.println(r);

    }
}

