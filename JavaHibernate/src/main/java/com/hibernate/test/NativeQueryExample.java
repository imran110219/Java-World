package com.hibernate.test;

import com.hibernate.model.Client;
import com.hibernate.util.HibernateUtilJava;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import javax.persistence.Query;
import java.util.List;

public class NativeQueryExample {
    public static void main(String[] args) {
        Session session = HibernateUtilJava.getSessionFactory().openSession();
        String sql = "SELECT * FROM client_table";
        NativeQuery query = session.createSQLQuery(sql);
        query.addEntity(Client.class);
        List results = query.list();
        System.out.println(results.get(1));
    }
}
