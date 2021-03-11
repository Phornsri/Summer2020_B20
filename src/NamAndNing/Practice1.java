package NamAndNing;

public class Practice1 {
    public static void main(String[] args) {
        int j=0;
        for(int i =1; i <= 10; i++) { // i: 0,1,2,3,4,5,6,7,8,9,10
            //System.out.print(i+",");

        if(i==5 || i==7) {
            j++;
            System.out.println("Round "+i +" I = "+i);
            System.out.println("Five n Seven count " + j);
        }
        else
            System.out.println("I = "+i);

        }
        }
}
