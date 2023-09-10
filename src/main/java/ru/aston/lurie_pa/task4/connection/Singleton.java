package ru.aston.lurie_pa.task4.connection;

public class Singleton extends GetConnectionWithDB {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
