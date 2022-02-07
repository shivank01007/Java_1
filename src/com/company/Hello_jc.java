package com.company;

class Hello{
    String name;
    int id;
    public void display(){
        System.out.println(id+"\t"+name);
    }
}

public class Hello_jc {
    public static void main(String[] args) {
        Hello h1 = new Hello();
        h1.id = 1;
        h1.name = "abc";
        Hello h2 = new Hello();
        h2.id = 2;
        h2.name = "Efg";
        h1.display();
        h2.display();
    }
}

