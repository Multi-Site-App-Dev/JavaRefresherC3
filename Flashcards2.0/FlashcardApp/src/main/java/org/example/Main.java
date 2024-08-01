package org.example;

import org.example.models.User;
import org.example.repos.UserRepo;
import org.example.services.UserService;
import org.example.utils.CRUD;

public class Main {

    public static User classUser = new User();
    // this is defined on the class so there are different access rules than when a variable is
    // defined in a method.
    // Also, we had to make it static in order for us to be able to call it in the main method
    //that's because the main method is static by default.

    //non access modifers
    //Static - makes fields and/or methods avaiable on the cass itself
    //instead of on the instance of the class

    public static void main(String[] args) {



        System.out.println("Hello world!");

        //4 Pillars of OOP (A.P.I.E)
        //1.Abstraction = Not seeing underlying code but being able to use its functionality
        //2.Polymorphism = Many forms - we see this with Overloading and Overriding
        //3.Inheritance = A subclass taking on the state and behavior of a parent class
                //remember state and behavior refers to the fields(variables) and  methods(functions).
        //4.Encapsulation = Hiding data  - created private fields then using getters
                        // snd setter to retrieve or update the fields.



        //make an instance of our User class
//        User newUser = new User();
//        System.out.println(newUser);
//        // any variable defined within a method cannot be used outside the method.
//
//        //someargs
//        User someArgsUser = new User("Abel","Zewdie");
//        System.out.println(someArgsUser);
//
        User allArgsUser = new User("Tracie","Smith",23,false);
//        System.out.println(allArgsUser);

        //TODO:
        //create instances of our Flashcard class
        // aka create new flashcards


        // Testing our the UserService layer
        // after creating a mock DB in our repo layer
        // and passing it into our service layer as a dependency

        UserService userService = new UserService();

        // create

        System.out.println( userService.createWithoutTouching(allArgsUser));
      System.out.println( userService.createNewUser(allArgsUser));




        // read
        System.out.println(userService.getAllUserWithoutTouching());
     System.out.println( userService.getAllUsers());







    }


}