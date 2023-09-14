package com.EricNorrwing.demo;

import com.EricNorrwing.demo.models.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        /*
        Student eric = new Student("Eric", 30);
        Student per = new Student("Per", 24);
        Student fredrik = new Student("Fredrik", 38);
        System.out.println(eric.name);
        */

        for(int i = 0; i < 5; i++){
            String studentName = "Student:" + i;
            Student tempStudent = new Student(studentName, randomAge());
            studentList.add(tempStudent);
        }

        for (int i = 0; i< 5; i++){
            System.out.println(studentList.get(i).doubleMyAge(studentList.get(i).age));


        }
        for (Student student: studentList){
            System.out.println(student);
        }


    }
    public static int randomAge(){
        int age = (int)(Math.random()*10)+1;
        return age;
    }
}
