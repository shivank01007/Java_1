package com.company;

class StudentX{
    int id;
    String name;
    double percent;
    StudentX(int id, String name, double percent){
        this.id = id;
        this.name = name;
        this.percent = percent;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + percent);
    }
}

public class TestThis1 {
    public static void main(String[] args) {
        StudentX x1 = new StudentX(191,"ABC",87.78);
        StudentX x2 = new StudentX(195,"EFG",91.25);
        x1.display();x2.display();
    }
}
