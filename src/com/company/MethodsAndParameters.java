package com.company;

import java.util.Scanner;

class CustomClass2{
    public static void MyMethod1(){
        System.out.println("Nothing Passed.");
    }
    public static void MyMethod1(int a){

        System.out.printf("Numbers Passed into Method : %d.\n",a);
    }
    public static void MyMethod1(int a, int b){
        System.out.printf("Numbers Passed into Method : %d , %d.\n",a,b);
        System.out.println("Add :  "+(a+b));
        System.out.println("Mul :  "+(a*b));
    }
    public static void MyMethod1(int a, int b,int c){
        System.out.printf("Numbers Passed into Method : %d , %d , %d.\n",a,b,c);
        System.out.println("Add :  "+(a+b+c));
        System.out.println("Mul :  "+(a*b*c));
    }
}

public class MethodsAndParameters {
    public static void main(String[] args) {
        CustomClass2.MyMethod1();
        CustomClass2.MyMethod1(5);
        CustomClass2.MyMethod1(7,6);
        CustomClass2.MyMethod1(8,9,15);
    }
}
