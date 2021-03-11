package day51_Exceptions.PetsTask;

public class Horse extends Pet{
    public Horse(String name,String breed,char gender,int age,String color){
        super(name,breed,gender,age,color);// calling parent constructor (Mandatory)
    }
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
