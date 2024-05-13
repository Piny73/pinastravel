package Boundary;

import Entity.AccounTurist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class DeleteViaggio {
    private EntityManager em;

public DeleteViaggio(EntityManager em) {
    this.em = em;
}
public void deleteAccount(AccounTurist viaggio) {
    EntityTransaction tx = em.getTransaction();
    try {
        tx.begin();
        em.remove(viaggio);
        tx.commit();
    } catch (Exception e) {
        tx.rollback();
        throw e;
    }
}
}