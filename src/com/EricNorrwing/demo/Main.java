package com.EricNorrwing.demo;

import com.EricNorrwing.demo.models.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Arraylist for Students to generate unique names without creating unique object names for task 5
        ArrayList<Student> studentList = new ArrayList<>();

        //Task 4, rows 16-19. Commented out because it is not used further as we use the generated students later.
        /*
        Student eric = new Student("Eric", 30);
        Student per = new Student("Per", 24);
        Student fredrik = new Student("Fredrik", 38);
        */


        //Task 6, rows 25-29
        //creating unique students and adding them to Arraylist student.List.
        //Student names will be: Student:0 > Student:4, Age is random 1-10 because im a child
        for(int i = 0; i < 5; i++){
            String studentName = "Student:" + i;
            Student tempStudent = new Student(studentName, randomAge());
            studentList.add(tempStudent);
        }

        // Task 7, rows 36-38.
        // printing the arraylist with double the ages, instead of fetching a single instance because its fun :)
        // This does however not change the values in the objects, it only displays the double value. I am not sure if
        // you wanted this change the value or not. But if that was the case you would just ask for index in the
        //arraylist and fetch that then double it.
        for (int i = 0; i< 5; i++){
            System.out.println(studentList.get(i).doubleMyAge(studentList.get(i).age));
        }



        //enhanced for-loop to print all the students, used this for testing. Can be ignored
        /*
        for (Student student: studentList){
            System.out.println(student);
        }
        */

        // Task 8, rows 54-55.
        // Used an @override function in "Student" class rows 22-23. Cleans up the output
        // I could have grabbed any from the generated names in the ArrayList by fetching index,
        // but the names look terrible so i skipped it and ran with the default task

        Student benny = new Student("Benny", 18);
        System.out.println(benny);
    }
    //age randomizer for Student objects, values 1-10
    public static int randomAge(){
        return (int)(Math.random()*10)+1;
    }
}
