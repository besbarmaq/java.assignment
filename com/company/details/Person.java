package com.company.details;

public class Person extends Driver{
    public int age;
    public Person(int age, String fullName, int experience){
        super(fullName, experience);
        this.age=age;
    }
}
