package org.example.repos;

import org.example.models.User;
import org.example.utils.CRUD;

import java.util.ArrayList;
import java.util.List;

// the 'implements' keyword denotes that we are inheriting the functions
// or functionality of an interface


public class UserRepo implements CRUD<User>{

    // this is my mock database
    // the list we create will represent the database we are interacting with
    // List is an interface
    // interfaces cannot be instantiated - meaning we cannot create a new instance of an interface
    // why??? because an interface is made up of abstract methods;

    List<User> mockDB;


    public UserRepo(){

        System.out.println("In the User Repo Class");


        this.mockDB = new ArrayList<>();

        User user1 = new User();
        user1.setFirstName("Julian");
        user1.setLastName("Pompey");
        user1.setAge(21);
        user1.setId(generateID());
        mockDB.add(user1);


        User user2 = new User("Etson", "Dorival");
        user2.setAge(17);
        user2.setUnderAge(true);
        user2.setId(generateID());
        mockDB.add(user2);


        User user3 = new User("Sarah", "Mustafa",23,false);
        user3.setId(generateID());
        mockDB.add(user3);


    }



    @Override //this is an annotation : basically it gives instruction to the program
    //so the program knows how to operate with the element
    //annotation are not always mandatory

    public User create(User input) {

        // when we create we are posting a new resource
        //aka adding a new row to a table in the db.

        //this is for the ArrayList example we have going on.
        input.setId(generateID());
        mockDB.add(input);

        return input;
    }

    @Override
    public List<User> getAll() {

        // as we move to jdbc we will be generating an arraylist from a result set

        return mockDB;
    }

    @Override
    public boolean update(User input) {

        // we are mimicking PUT which replaces a resource in the db with a new resource

        mockDB.add(input.getId()-1,input);

        return true;
    }

    @Override
    public boolean delete(int id) {
        // when working with a db you would not actyakly remove 1 from the id
        // we are only doing this because we are using an arraylist
        //as our mockDB.
        mockDB.remove(id-1);

        return true;
    }

    public void extraMethod(){
        System.out.println("Creating an extra method");
    }

    private int generateID(){
        return mockDB.size()+1;
    }
}
