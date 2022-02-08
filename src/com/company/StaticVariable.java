package com.company;

class StudentY{
    int id;
    String name;
    static String clg = "MIT";
    StudentY(int i, String n){
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t"+clg);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        StudentY s1 = new StudentY(1,"ABC");
        StudentY s2 = new StudentY(2,"DEF");
        StudentY s3 = new StudentY(3,"HIJ");
        StudentY.clg = "XYZ";
        s1.display();
        s2.display();
        s3.display();
    }
}
