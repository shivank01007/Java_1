package com.company;

class BikeY {
    int id;
    String name;
    String companyName;
    double price;

    BikeY(int i, String n){
        id = i ;
        name = n;
    }

    BikeY(int i, String n, String c, double p){
        id = i ;
        name = n;
        companyName = c;
        price = p;
    }
    void display(){
        System.out.println("ID:\t\t\t"+id+"\nName:\t\t"+name+"\nCompany:\t"+companyName+"\nPrice:\t\t"+price+"\n");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        BikeY y1 =new BikeY(1,"MT 15");
        BikeY y2 =new BikeY(1,"MT 15","Yamaha",145000);
        y1.display();
        y2.display();
    }
}
