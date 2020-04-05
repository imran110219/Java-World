package com.hibernate.test;

import com.hibernate.model.Client;
import com.hibernate.util.HibernateUtilJava;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CriteriaQueryExample {
    public static void main(String[] args) {
        Session session = HibernateUtilJava.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(Client.class);
        cr.add(Restrictions.eq("name", "Sobhan"));
        List results = cr.list();
        System.out.println(results);
    }
}
