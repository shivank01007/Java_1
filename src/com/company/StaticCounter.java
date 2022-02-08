package com.company;

class CounterZ {
    static int count;

    CounterZ(){
        count++;
    }

    void display() {
        System.out.println(count);
    }
}

public class StaticCounter {
    public static void main(String[] args) {
        new CounterZ().display();
        new CounterZ().display();
        new CounterZ().display();
        new CounterZ().display();
        new CounterZ().display();
    }
}
