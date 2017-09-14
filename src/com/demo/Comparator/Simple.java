package com.demo.Comparator;


import java.util.*;

public class Simple {
    public static void main(String args[]) {
        List al = new ArrayList();
        al.add(new Student(100, "Ram", 30));
        al.add(new Student(101, "Sita", 26));
        al.add(new Student(103, "Bharathi", 23));
        System.out.println("Sorting by name......");
        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        System.out.println("Sorting by age......");
        Collections.sort(al, new AgeComparator());
        Iterator itr1 = al.iterator();
        while (itr1.hasNext()) {
            Student st = (Student) itr1.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

    }
}
