package Boundary;

import Entity.AccounTurist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class DeletePartecipants {
    private EntityManager em;

public DeletePartecipants(EntityManager em) {
    this.em = em;
}
public void deleteAccount(AccounTurist partecipant) {
    EntityTransaction tx = em.getTransaction();
    try {
        tx.begin();
        em.remove(partecipant);
        tx.commit();
    } catch (Exception e) {
        tx.rollback();
        throw e;
    }
}
}
