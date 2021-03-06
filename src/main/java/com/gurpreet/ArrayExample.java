package com.gurpreet;

public class ArrayExample {
    public static void main(String[] args) {
        int [] a,b,c; // all array
        int x[],y,z[]; // x and z are array and y is integer
//        int  p[] = new int[5];
        int p[]={10,20,30,40,50};
        p[2]=3000; //update 2nd index
//        p[5]=6000; //not allow to add new elements
        for(int v:p){
            System.out.println(v);
        }
        System.out.println(p[3]);

//        String[] strings = new String[10]; //with this no declaration
//        String[] strings;
        String[] strings ={new String("A"),new String("B"),
                new String("C"),new String("D"),
                new String("E")};
        for(String s:strings){
            System.out.println(s);
        }

        // array of student class
        Student students[]=new Student[5]; //create 5 references
        students[0]=new Student(1,"gurpreet","kaur");
        students[1]=new Student(22,"gurpreet","kaur");
        students[2]=new Student(222,"gurpreet","kaur");
        students[3]=new Student(222,"gurpreet","kaur");
        students[4]=new Student(222,"gurpreet","kaur");
        for(Student u: students){
            u.display();
        }

//        Student[] ss ={new Student(),new Student()};
    }
}
