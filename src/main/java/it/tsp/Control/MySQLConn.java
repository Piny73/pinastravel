package it.tsp.Control;

import java.util.List;

import it.tsp.Entity.AccounTurist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class MySQLConn {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pinastravel");
    private static EntityManager em =emf.createEntityManager();

    public static List<AccounTurist> getatList() {
       return em.createQuery("SELECT at FROM AccounTurist at", AccounTurist.class).getResultList();
    }
    }


