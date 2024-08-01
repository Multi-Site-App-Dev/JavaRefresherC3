package org.example.services;

import org.example.models.User;
import org.example.repos.UserRepo;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    UserRepo userRepo;

    public UserService(){
        System.out.println("In the User Service Class");
        this.userRepo = new UserRepo();
    }

    // i still need to replicate the functionality from the datalayer

    //create

    public User createNewUser(User userFromClient){

        // here i just changed the return type to show us that we control what we return from
        // each layer of the application.. it totally depends on the type of api
        // you want to build.

        // this is to show us a benefit of having a service layer
        // ex: taking the password from the object and creating a hashcode before saving to the db
        // let pretend the last name is the password

        User user123 = userFromClient;
        int hashPass = user123.hashCode();
        user123.setLastName(String.valueOf(hashPass));


        return userRepo.create(user123);
    }

    public User createWithoutTouching(User user){
        return userRepo.create(user);
    }


    //read

    public List<User> getAllUsers(){

        // just an example..
        // anohter use case for the service kaye
        // can be filtering the data from the db
        // or changing it to protect a user

        List<User> usersToReturnToClient = userRepo.getAll();

        //enhanced for-loop in java
        for(User user: usersToReturnToClient){

            user.setFirstName("*************");
           // usersToReturnToClient.add(user);

        }

        return usersToReturnToClient;
    }

    public List<User> getAllUserWithoutTouching(){
        return userRepo.getAll();
    }



    //update




    //delete



}
