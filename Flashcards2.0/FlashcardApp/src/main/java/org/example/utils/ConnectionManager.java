package org.example.utils;

import java.sql.Connection;

public class ConnectionManager {

    //this class is responsible for creating a connection to the db.

    //this class is a Singleton -  meaning that we always want to call the same instance.
    //Static is one of our non-access modifier
    // when something is declared static on a class it is shared to all or on all instance of the class.


    public static ConnectionManager connectionManager; // our one instance of the class.
    public static Connection connection;

    private ConnectionManager(){

    }

    private ConnectionManager getConnectionManager(){
        if(connectionManager == null){
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }

    public static Connection getConnection(){
        if(connection == null){
            connection = connect();
        }
        return connection;
    }

    private static Connection connect(){

        // in this method we will be going through the logic needed to generate a connection and assign it
        //to the variable we created declared above.. before returning it.

        return connection;
    }

}
