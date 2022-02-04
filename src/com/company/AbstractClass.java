package com.company;

abstract class roboA{
    abstract void walk();
    abstract void talk();
    abstract void sleep();
}

abstract class developer1 extends roboA{
    public void walk(){
        System.out.println("Robo Alpha starts walking.");
    }
    public void talk(){
        System.out.println("Robo Alpha is talking.");
    }
}

class developer2 extends developer1{
    public void sleep(){
        System.out.println("Robo Alpha is sleeping.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        roboA r = new developer2();
        r.walk();
        r.talk();
        r.sleep();
    }
}
