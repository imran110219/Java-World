package com.hibernate.test;

import com.hibernate.model.Bank;
import com.hibernate.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerFactoryExample {
    public static void main(String[] args) {
        javax.persistence.EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Client client = new Client();
        client.setId(1);
        client.setName("Sadman");

        Bank bank = new Bank();
        bank.setName("HSBC");

        entityManager.persist(client);
        entityManager.persist(bank);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
