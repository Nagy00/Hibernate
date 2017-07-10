/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Alaa.khairy
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    private static SessionFactory factory;
    private static Session session;

    private static void createSession(){
        factory = new AnnotationConfiguration().configure().buildSessionFactory();
    }
    
    public static Session getSession(){
        if(factory == null){
            createSession();
        }
        
        return factory.openSession();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here


    }

}
