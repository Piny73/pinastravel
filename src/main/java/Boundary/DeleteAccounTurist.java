package Boundary;

import Entity.AccounTurist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class DeleteAccounTurist {
    private EntityManager em;

public DeleteAccounTurist(EntityManager em) {
    this.em = em;
}

public void deleteAccount(AccounTurist account) {
    EntityTransaction tx = em.getTransaction();
    try {
        tx.begin();
        em.remove(account);
        tx.commit();
    } catch (Exception e) {
        tx.rollback();
        throw e;
    }
}
}

