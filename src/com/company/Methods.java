package com.company;


class CustomClass1{
    public static void MyMethod1(){
        System.out.println("This is the MyMethod1");
    }
    public static void MyMethod2(){
        System.out.println("This is the MyMethod2");
    }
}

public class Methods {
    public static void main(String[] args) {
        boolean b = false;
        if(b){
            CustomClass1.MyMethod1();
        }
        else{
            CustomClass1.MyMethod2();
        }
    }
}
