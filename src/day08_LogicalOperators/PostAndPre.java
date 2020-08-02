package day08_LogicalOperators;
/*   manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;*/
public class PostAndPre {
    public static void main(String[] args) {
        int a = 200; // a = 199
        int b = -a++ + - --a * a-- % 2;
        // b = -200 - 200 * 200 % 2
        // b = - 200 - 4000 % 2
        // b = -200 - 0 = -200

        System.out.println(b);
        System.out.println(a);

        System.out.println("================");

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        //3 z=300+400-300*400+300/400;
        // z=300+400-300*400+.75
        //z=300+400-120000.75
        //700-120075=-119,300.75 but because of int well get 19,300
        System.out.println(z);


    }
}
