package day51_Exceptions.BrowserTask;
/*
 1. create a class called Pet
                    attributes:
                            name, age, gender, breed, color
                    create a constructor that can initialize the instances
                   instance methods (with protected access modifiers):
                            eat(): by default assume all Pets eat  chocolate
                            drink(): by default assume all Pets drink milk
                            sleep(): by default assume all Pet sleep on the floor
                            toString():
 */

public class Pet {

    public String name;
    public String breed;
    public char gender;
    public int age;
    public String color;

    public Pet(String name, String breed, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }
}
