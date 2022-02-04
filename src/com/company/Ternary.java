package com.company;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        //Use of Ternary Operator
        System.out.println(age<18 ? "You are not eligible.":"You are eligible.");

        //Another way
//        if(age<18) {
//            System.out.println("You are not eligible.");
//        }
//        else{
//            System.out.println("You are eligible.");
//        }
    }
}
