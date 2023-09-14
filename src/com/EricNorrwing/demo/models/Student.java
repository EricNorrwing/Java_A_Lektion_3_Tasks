package com.EricNorrwing.demo.models;

public class Student {
    public String name;
    public int age;

    public Student (String name, int age){
        this.name = name;
        this.age = age;

    }

    public int doubleMyAge(int age){
        int sum = age*2;
        return sum;
    }

    @Override
    public String toString() {
        return "This person is called " + name + " and is " + age + " years old";
    }


}
