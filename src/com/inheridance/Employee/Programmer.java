package com.inheridance.Employee;

/**
 * Created by cts1 on 6/9/17.
 */
public class Programmer extends Employee {
    float bonus=10000;
    public static void main(String args[])
    {
        Programmer p=new Programmer();
        System.out.println("Name of programmer "+p.name);
        System.out.println("salary of programmer "+p.salary);
        System.out.println("Bonus of programmer "+p.bonus);
    }
}
