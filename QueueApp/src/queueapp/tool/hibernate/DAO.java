/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp.tool.hibernate;

import java.util.Calendar;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import queueapp.entitylib.Client;
import queueapp.entitylib.CustomerOrderPending;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author hilman
 */
public class DAO {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static  void save(Object o){
        Session s = getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        try {
            s.save(o);
            trans.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static  void edit(Object o){
        Session s = getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        try {
            s.update(o);
            trans.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static  void delete(Object o){
        Session s = getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        try {
            s.delete(o);
            trans.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static  List query(String query){
        Session s = getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        try {
            Query q = s.createQuery(query);
            trans.commit();
            return q.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        CustomerOrderPending e = new CustomerOrderPending();
        e.setDateCustomerOrder(Calendar.getInstance().getTime());
        DAO.save(e);
    }
}
