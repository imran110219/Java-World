package com.hibernate.test;

import com.hibernate.model.Client;
import com.hibernate.util.HibernateUtilJava;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NativeQueryExample {
    public static void main(String[] args) {
        Session session = HibernateUtilJava.getSessionFactory().openSession();
        String sql = "SELECT * FROM client_table";
        NativeQuery query = session.createSQLQuery(sql);
        query.addEntity(Client.class);
        List clients = query.list();

        for (Iterator iterator = clients.iterator(); iterator.hasNext();){
            Client client = (Client) iterator.next();
            System.out.print("Id: " + client.getId());
            System.out.print("    Name: " + client.getName());
            System.out.println();
        }
    }
}
