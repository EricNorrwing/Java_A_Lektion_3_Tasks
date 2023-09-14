package com.EricNorrwing.demo;

import com.EricNorrwing.demo.models.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Arraylist for Students to generate unique names without creating unique object names for task 5
        ArrayList<Student> studentList = new ArrayList<>();


        /*
        Student eric = new Student("Eric", 30);
        Student per = new Student("Per", 24);
        Student fredrik = new Student("Fredrik", 38);
        System.out.println(eric.name);
        */

        //creating unique students and adding them to Arraylist "student.List. Age is random up to age 10

        for(int i = 0; i < 5; i++){
            String studentName = "Student:" + i;
            Student tempStudent = new Student(studentName, randomAge());
            studentList.add(tempStudent);
        }

        //printing the arraylist with double the ages, instead of fetching a single instance because its fun :)
        for (int i = 0; i< 5; i++){
            System.out.println(studentList.get(i).doubleMyAge(studentList.get(i).age));
        }

        //printing students in Student lists
        for (Student student: studentList){
            System.out.println(student);
        }


    }
    //age randomizer for Student objects, values 1-10
    public static int randomAge(){
        int age = (int)(Math.random()*10)+1;
        return age;
    }
}
