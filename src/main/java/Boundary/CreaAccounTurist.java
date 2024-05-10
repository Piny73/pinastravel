package Boundary;

import Entity.AccounTurist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CreaAccounTurist {
    private EntityManager em;

    public CreaAccounTurist(EntityManager em) {
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
}