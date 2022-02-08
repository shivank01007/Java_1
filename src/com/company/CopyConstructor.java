package com.company;

class StudentZ{
    int id;
    String name;
    StudentZ(int i,String n){
        name = n;
        id = i;
    }
    StudentZ(StudentZ z1){
        id = z1.id;
        name = z1.name;
    }
    void display(){
        System.out.println(id+"\t"+name);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        StudentZ z1 = new StudentZ(101,"ABCD");
//        StudentZ z2 = new StudentZ(102,"XYZ");
        StudentZ z2 = new StudentZ(z1);
        z1.display();
        z2.display();
    }
}
