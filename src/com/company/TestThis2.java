package com.company;

class TestZ{
    void m(){
        System.out.println("This is method M().");
    }
    void n(){
        System.out.println("This is method N()");
        this.m();
    }
}

public class TestThis2 {
    public static void main(String[] args) {
        new TestZ().m();
        new TestZ().n();

    }
}
