package com.company;

class BikeX{
    int id;
    String name;
    String companyName;
    double price;
    BikeX(int i,String n,String c,double p){
        id = i ;
        name = n;
        companyName = c;
        price = p;
    }
    void display(){
        System.out.println("ID:\t\t\t"+id+"\nName:\t\t"+name+"\nCompany:\t"+companyName+"\nPrice:\t\t"+price);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        BikeY x1 =new BikeY(1,"MT 15","Yamaha",145000);
        x1.display();
    }
}
