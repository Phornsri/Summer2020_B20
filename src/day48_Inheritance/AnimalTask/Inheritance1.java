package day48_Inheritance.AnimalTask;

class A{
static int a = 10;
}

class B extends A{
static int b = 20;
/*
variables : a,b
 */
}
class C extends B{
    static int c = 30;
    /*
    variables : a, b, c
     */
}

public class Inheritance1 extends B{
}
