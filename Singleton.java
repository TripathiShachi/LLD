package org.example;

public class MySingleton {

    private static MySingleton instance;

    private MySingleton() {
        // private constructor to prevent instantiation
    }
    public static MySingleton getInstance() {
        if (instance == null) {
            //thread a
            //thread b
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton(); // thread a, obj created/
                }
            }
        }
        return instance;
    }


//To log activities like errors, payments, user actions, etc., across the entire system — you only need one logger, not a new one for every request.






}
