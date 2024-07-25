package org.example.utils;

//An interface allow us to have more functionality in our applications
//with the OOP principal of inheritance, we can create interfaces
//with functions(methods) that we will need multiple times, and then inherit
// these functions(methods) by all the classes that will need them

// all methods on an interface are abstract
//abstract means that the method has no implementation (no body)
//aka no opening and closing brackets


import java.util.List;

//<T> denotes that we are creating the interface to be used by ALL datatypes
//T represents a Generic datatype;  it is a placeholder for whatever type might use this interface
public interface CRUD<T> {

    //method syntax for interfaces
    // why is it different? Because methods on interfaces are public and static by default

    //create
    T create(T input);

    //read
    List<T> getAll();


    //update
    boolean update(T input);


    //delete
    boolean delete(int id);


}
