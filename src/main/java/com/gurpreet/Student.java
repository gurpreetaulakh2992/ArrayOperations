package com.gurpreet;

public class Student {
    int sid;
    String firstName,lastname;

    public Student(int sid,String firstName,String lastname) {
        this.sid = sid;
        this.firstName=firstName;
        this.lastname=lastname;
    }

    void display(){
        System.out.println("SID"+this.sid);
        System.out.println("firstname"+this.firstName);
        System.out.println("lastname"+this.lastname);
    }
}
