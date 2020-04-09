package com.hibernate.test;

import com.hibernate.model.Client;
import com.hibernate.util.HibernateUtilJava;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class BatchProcessingExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtilJava.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        for ( int i=1; i<100; i++ ) {
            Client client = new Client(i, "Sobhan");
            session.save(client);
            if( i % 50 == 0 ) { // Same as the JDBC batch size
                //flush a batch of inserts and release memory:
                session.flush();
                session.clear();
            }
        }
        tx.commit();
        session.close();

    }
}
