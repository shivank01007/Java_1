package com.company;
class B4{
    A4 obj;
    B4(A4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of A4 class
    }
}

class A4{
    int data=10;
    A4(){
        B4 b=new B4(this);
        b.display();
    }

}
public class TestThis4 {
    public static void main(String[] args){
        new A4();
    }
}
