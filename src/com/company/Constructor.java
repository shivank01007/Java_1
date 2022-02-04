package com.company;

class A1{
    int i;  //0
    float f;  //0.0
    public A1(){
        i = 5;
        f = 5.5f;
        System.out.println(i);
        System.out.println(f);
    }
    public A1(int ... a){                   //Constructor Overloading
        for (int i : a){
            System.out.print(i+"\t");
        }
    }
}

public class Constructor {
    public static void main(String[] args) {
    A1 a = new A1();
    A1 a1 = new A1(1,2,3,4,5,6,7);

    }
}
