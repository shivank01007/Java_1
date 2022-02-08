package com.company;

class Yy{
    Yy(){
        System.out.println("This is Default Constructor called by Parameterized Constructor.");
    }
    Yy(int a){
        this(); //default constructor.
        System.out.println("This is Parameterized Constructor.");
        System.out.println("Parameter used:\t"+a+".");
    }
}
class Zz{
    Zz(int a){
        System.out.println("This is Parameterized Constructor called by Default Constructor.");
        System.out.println("Parameter used:\t"+a+".");
    }
    Zz(){
        this(1); //parameterized constructor.
        System.out.println("This is Default Constructor.");
    }
}

public class TestThis3 {
    public static void main(String[] args) {
        new Yy(6);
        new Zz();
    }
}
