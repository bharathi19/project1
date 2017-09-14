package com.demo.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableSort {
    public static void main(String args[])
    {
        List<Student> al=new ArrayList();
        al.add(new Student(1,"RajKumar",23));
        al.add(new Student(2,"Hari",25));
        al.add(new Student(6,"Arul",20));
        Collections.sort(al);
        for (Student st:al)
        {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
