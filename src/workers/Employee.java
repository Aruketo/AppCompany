package workers;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
    private String name;
    private String surName;
    private int age;
    private double salary;

    public Employee(String name, String surName, int age, double salary)
    {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void showInformation()
    {
        System.out.println("---------------------------------------");
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surName);
        System.out.println("Wiek: " + age);
        System.out.println("Wynagrodzenie w pln: " + salary + " " + "pln");
        System.out.println("---------------------------------------");
    }
}
