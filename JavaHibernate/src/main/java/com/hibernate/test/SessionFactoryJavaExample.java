package com.hibernate.test;

import com.hibernate.model.Client;
import com.hibernate.util.HibernateUtilJava;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class SessionFactoryJavaExample {
    public static void main(String[] args) {
        Client client = new Client(2, "Sobhan");
        Transaction transaction = null;
//        try (Session session = HibernateUtilJava.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
//            // save the student objects
//            session.save(client);
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
        try (Session session = HibernateUtilJava.getSessionFactory().openSession()) {
            List< Client > clients = session.createQuery("from Client", Client.class).list();
            clients.forEach(c -> System.out.println(c.getName()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
