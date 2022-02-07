package com.company;

class BikeZ{
    int id;
    String name;
    String companyName;
    double price;
    void display(){
        System.out.println("ID:\t"+id+"\nName:\t"+name+"\nCompany:\t"+companyName+"\nPrice:\t"+price);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        BikeZ z1 =new BikeZ();
        z1.display();
    }
}
