package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PoketexInitiatorDelet {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("himanshuUnit01");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Pokemon pokemon = entityManager.find(Pokemon.class, "Pikachu");

        if(pokemon != null)
        {
            transaction.begin();
            entityManager.remove(pokemon);
            transaction.commit();

        }
        else
        {
            System.out.println("Does Not Exist");
        }

    }
}
