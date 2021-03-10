package day52_Exceptionss.Phornsri;
/*
1. create a class called Person
            attributes:
                name, age, gender
            add a constructor that can initialize the attributes
            generate a toString method that can print any Person object

 */

public class Person {
    String name;
    int age;
    char gender;



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


    public Person(String name, int age, char gender){

        this.name = name;
        this.age = age;
        this.gender = gender;
    }




}
