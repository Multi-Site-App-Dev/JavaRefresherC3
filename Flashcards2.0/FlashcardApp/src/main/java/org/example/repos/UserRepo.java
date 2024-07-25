package org.example.repos;

import org.example.models.User;
import org.example.utils.CRUD;

import java.util.List;

// the 'implements' keyword denotes that we are inheriting the functions
// or functionality of an interface

public class UserRepo implements CRUD<User>{
    @Override
    public User create(User input) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean update(User input) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
