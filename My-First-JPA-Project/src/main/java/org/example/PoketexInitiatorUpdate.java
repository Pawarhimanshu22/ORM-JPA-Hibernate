package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PoketexInitiatorUpdate {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("himanshuUnit01");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        Pokemon pokemon = entityManager.find(Pokemon.class, "Pikachu");

        if(pokemon != null)
        {
            pokemon.setPower(2000);

            transaction.begin();
            entityManager.persist(pokemon);
            transaction.commit();
        }
        else
        {
            System.out.println("Entry Does Not Exist");
        }
    }
}
