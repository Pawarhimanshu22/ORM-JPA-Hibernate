package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PoketexInitiatorRead {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("himanshuUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Pokemon pokemon = entityManager.find(Pokemon.class, "Pikachu");

        System.out.println(pokemon);

    }
}
