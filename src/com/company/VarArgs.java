package com.company;

class Display{
//    public static void show(int a) {
//        System.out.println(a);
//    }
    public static void show(int ... a) {
        for (int i : a){
            System.out.print(i+"\t");
        }
    }
}

public class VarArgs {
    public static void main(String[] args) {
//        Display d = new Display();
//        d.show(4,5,6,7,8,9,10);
        Display.show(4,5,6,7,8,9,10);
    }
}
