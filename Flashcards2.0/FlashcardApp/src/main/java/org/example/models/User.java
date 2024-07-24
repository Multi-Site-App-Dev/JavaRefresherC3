package org.example.models;

// a class 9s a blueprint for an object in java
//an object has  state  and   behavior
// state is defined using fields or variables
// behaviors are defined using methods

import java.util.Objects;

public class User {
    // first name
    // last name
    //age
    //isUnderAge

    //field syntax: access modifier , non access , datatype , fieldName (identifier);
    // note: the semi colon denotes that the field had not been instantiated
    // it's been defined - i.e it has a name etc, but it hasn't been assigned a value yet.

    //access modifiers to know:
    // public  - makes fields or variables or classes etc accessible EVERYWHERE withing the app.
    // protected - makes elements accessible only if they are subclasses and in the same package.
    // default (usually means there's no keyword in front of the field) - Only accessible within
                 // the same package - regardless if there's a subclass or not.
    // private - makes elements accessible only in the class it was created. It doesn't matter
    // if that class has subclasses.

    private String firstName; // we are using camelCasing for our variables
    private String lastName;
    private int age;
    private boolean isUnderAge;

    //Datatypes in Java
    //We have 7 primitive datatypes and wrapper classes to go with all of them.
    //String is the only datatype that is only an Object

    //byte,char,int,String,float,double,short,long
    //Wrapper classes - Used when using collections
    //Byte,Charater,Integer,String,Float,Double,Short,Long


    //Constructors - example of Polymorphism
    //A special method - a constructor is used to create an instance of our class
    // aka we are creating objects from our classes (blueprints)
    //This is the default constructor
    public User(){

    }

    //this is our some args constructor
    //meaning some of the fields that are on the class can be defined at instantiation
    public User(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //all args


    public User(String firstName, String lastName, int age, boolean isUnderAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isUnderAge = isUnderAge;
    }


    //Getters nd Setters
    //these are methods that allow us to practice encapsulation
    // we set our fields are private which means they are only accessible within the class
    //therefore we must create getter snd setter (aka methods) that we can use
    //to update (set) or retrieve (get) data frm these fields in our classes.


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnderAge() {
        return isUnderAge;
    }

    public void setUnderAge(boolean underAge) {
        isUnderAge = underAge;
    }

    //The override method related back top polymorphism

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isUnderAge == user.isUnderAge && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, isUnderAge);
    }

    @Override
    public String toString() {
        return "This user's name is" +
                " " + firstName +
                " " + lastName + '.' +
                " They are " + age +
                " years old.";
    }
}
