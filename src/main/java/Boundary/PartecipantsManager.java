package Boundary;

import Entity.AccounTurist;
import Entity.Partecipants;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PartecipantsManager {
    private EntityManager em;

    public PartecipantsManager(EntityManager em) {
        this.em = em;
    }

    public void createParticipant(Partecipants participant) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(participant);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
    }
    public void deletePartecipant(AccounTurist partecipant) {
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