package com.company;

class AddressZ{
    String city,state,country;
    AddressZ(String city, String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class HumanZ{
    int id;
    String name;
    AddressZ address;
    HumanZ(int id, String name, AddressZ address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + address.city + "\t" + address.state + "\t" + address.country);
    }
}

public class TestAggregation {
    public static void main(String[] args) {
        AddressZ a1 = new AddressZ("GZB","UP","INDIA");
        AddressZ a2 = new AddressZ("SNP","HARYANA","INDIA");
        HumanZ h1 = new HumanZ(1,"Naman",a1);
        HumanZ h2 = new HumanZ(2,"Aman",a2);
        h1.display();h2.display();
    }
}
