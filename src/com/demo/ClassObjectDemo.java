package com.demo;

/**
 * Created by cts1 on 6/9/17.
 */
public class ClassObjectDemo {
    int rollno;
    String name;
    int age;
    void insertData(int r,String n,int a)
    {
        rollno=r;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+age);
    }
    public static void main(String args[])
    {
        ClassObjectDemo obj=new ClassObjectDemo();
        ClassObjectDemo obj1=new ClassObjectDemo();
        obj.insertData(1,"arul",45);
        obj1.insertData(8,"karthick",25);
        obj.display();
        obj1.display();
    }
   /* public static void main(String args[])
    {
        ClassObjectDemo obj=new ClassObjectDemo();
        System.out.println(obj.rollno=25);
        System.out.println(obj.name="Bharathi");
        System.out.println( obj.age=23);

    }*/
}
