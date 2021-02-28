package day51_Exceptions.PetsTask;

public class House {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Winton","Scotty Terrier",'M',4, "Black");

        System.out.println( dog1.name );

        System.out.println(dog1);

        Cat cat1 = new Cat("Welat", "British Short hair", 'M',1, "White" );

        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Zara","Caspian",'M',12,"Brown");

        System.out.println(tiger1);

        Horse horse1 = new Horse("Jacky","Indian",'M',12,"Brown") ;
        System.out.println(horse1);

       // tiger1.eat();
       // tiger1.drink();
    }
    //outputs: Winton
    //Dog{name='Winton', breed='Scotty Terrier', gender=M, age=4, color='Black'}
    //Cat{name='Welat', breed='British Short hair', gender=M, age=1, color='White'}
    //Tiger{name='Zara', breed='Caspian', gender=M, age=12, color='Brown'}
    //Horse{name='Jacky', breed='Indian', gender=M, age=12, color='Brown'}
}
