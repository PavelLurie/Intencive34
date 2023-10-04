package ru.aston.lurie_pa.task9.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetConnectionWithDB {
    private static SessionFactory sessionFactory;
    public static SessionFactory startSessionFactory(){
        if(sessionFactory == null){
            try{
                sessionFactory = new Configuration().configure().buildSessionFactory();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

    public static void shutdown(){

        startSessionFactory().close();
    }
}
