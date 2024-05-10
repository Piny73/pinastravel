package Boundary;

import Entity.Travel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CreaTravel {
    private EntityManager em;

    public CreaTravel(EntityManager em) {
        this.em = em;
    }

    public void createTravel(Travel travel) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(travel);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
    }
}
