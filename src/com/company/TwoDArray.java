package com.company;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3,4},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}
        };
        for(int i[] : a){
            System.out.printf("[");
            for(int j : i){
                System.out.printf("%d\t",j);
            }
            System.out.printf("]\n");
        }
    }
}
