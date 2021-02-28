package day51_Exceptions.PetsTask;

public class Pet {
    String name;
    String breed;
    char gender;
    int age;
    String color;
    public Pet(String name, String breed, char gender, int age, String color){
        this.name = name;
        this.breed = breed;
        this.gender=gender;
        this.age= age;
        this.color =color;
    }
    protected void eat(){
        System.out.println(name+" is eating chocolate");
    }

    protected void drink(){
        System.out.println(name+" is drinking milk");
    }

    protected void sleep(){
        System.out.println(name+" is sleeping on the floor");
    }



    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
