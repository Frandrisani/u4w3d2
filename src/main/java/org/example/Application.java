package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d2");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

    }
}