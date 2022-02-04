package com.company;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[5];
        for(int i=0; i<a.length; i++){
            a[i] = r.nextInt();
        }
        for(int i : a){
            System.out.println(i);
        }
    }
}
