package com.company;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] a = new int[5][5][5];
        for (int i=0;i<5;i++){
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    a[i][j][k]=i+j+k;
                }
            }
        }
        for (int[][] i : a){
            System.out.print("{\t");
            for (int[] j : i){
                System.out.print("[\t");
                for (int k : j){
                    System.out.printf("%d\t",k);
                }
                System.out.print("]\t");
            }
            System.out.print("}\n");
        }
    }
}
