package it.tsp.Boundary;

import java.util.List;

import it.tsp.Entity.AccounTurist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class AccounTuristManager {
    private EntityManager em;

    public AccounTuristManager(EntityManager em) {
        this.em = em;
    }
     public void createAccount(AccounTurist account) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(account);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
    }
    public static List<it.tsp.Entity.AccounTurist> atList() {
        throw new UnsupportedOperationException("Unimplemented method 'atList'");
    }
    
}
