package com.EricNorrwing.demo.models;

public class Student {

    //Task 2, rows 6-7
    public String name;
    public int age;

    //Task 33, rows 10-13
    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    //used in task 7, rows here are 16-19, rows 36-38 in Main.
    public static int doubleMyAge(int age){
        int sum = age*2;
        return sum;
    }
    public int doubleBennyAge(int age){
        return age*2;
    }




    //toString override to make decipherable outputs
    @Override
    public String toString() {
        return "This person is called " + name + " and is " + age + " years old";
    }


}
