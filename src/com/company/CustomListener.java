package com.company;

interface Sum{
    public int addTwoNum(int a, int b);
    public int addThreeNum(int a, int b,int c);
}

class ListenerZ{
    private Sum sListener;

    class ImplementListener implements Sum{
        public int addTwoNum(int a, int b){
            return a+b;
        }
        public int addThreeNum(int a, int b, int c){
            return a+b+c;
        }
    }
}
public class CustomListener {


}
