package com.company;

interface developer3{
    void walk();
    void talk();
}

interface developer4{
    void sleep();
}

class roboB implements developer3,developer4{
    public void walk(){
        System.out.println("Robo Beta starts walking.");
    }
    public void talk(){
        System.out.println("Robo Beta is talking.");
    }
    public void sleep(){
        System.out.println("Robo Beta is sleeping.");
    }
}

public class Interface {
    public static void main(String[] args) {
        roboB r = new roboB();
        r.walk();
        r.talk();
        r.sleep();
    }
}
