package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PoketexInitiatorCreate {

    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon();
       // pokemon1.age = -19;
        // pokemon1.setAge(-19);


        pokemon1.setName("Pikachu");
        pokemon1.setPower(100);
        pokemon1.setType("Electrical");
        pokemon1.setColor(Color.Yellow);


        Pokemon pokemon2 = new Pokemon();
        pokemon2.setName("Charizard");
        pokemon2.setType("Fire");
        pokemon2.setPower(200);
        pokemon2.setColor(Color.ORANGE);



        Pokemon pokemon3 = new Pokemon();
        pokemon3.setName("Meowth");
        pokemon3.setPower(80);
        pokemon3.setType("Cat");
        pokemon3.setColor(Color.CREAM);


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("himanshuUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        entityManager.persist(pokemon1);
        entityManager.persist(pokemon2);
        entityManager.persist(pokemon3);

        entityTransaction.commit();



    }
}
