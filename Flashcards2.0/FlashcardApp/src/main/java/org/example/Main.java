package org.example;

import org.example.models.User;

public class Main {

    public User classUser = new User();
    // this is defined on the class so there are different access rules than in a method.

    //non access Modifers
    //Static - makes fields and or methods aviable on the cass itslef
    //as poopsed to on the instance of the class

    public static void main(String[] args) {

        System.out.println("Hello world!");

        //4 Pillars of OOP (A.P.I.E)
        //1.Abstraction = Not seeing underlying code but being able to use it's functionality
        //2.Polymorphism = Multiple forms
        //3.Inheritance = A subclass taking on the state and behavior of a parent class
        //4.Encapsulation = Hiding data


        //make an instance of our User class
        User newUser = new User();
        System.out.println(newUser);
        // any variable definied within a method cannot be used outside the method.

        //someargs
        User someArgsUser = new User("Abel","Zewdie");
        System.out.println(someArgsUser);

        User allArgsUser = new User("Tracie","Smith",23,false);
        System.out.println(allArgsUser);
    }


}