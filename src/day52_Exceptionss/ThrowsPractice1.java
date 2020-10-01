package day52_Exceptionss;

public class ThrowsPractice1 {


    public static void main(String[] args) throws InterruptedException {

        m1();

        m2();


    }

    public static void m1() throws InterruptedException{
        Thread.sleep(3000);
    }

    public static void m2() throws InterruptedException{
        m1();
    }

    public static void m3(){
        try {
            m2();
        }catch (InterruptedException e){
            System.out.println(e.getMessage() );
            System.out.println("Hello");
        }

    }

    public static void m4(){
        m3();
    }
    }

