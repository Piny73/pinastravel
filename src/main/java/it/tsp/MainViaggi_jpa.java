package it.tsp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

import javax.swing.DefaultListModel;

import it.tsp.Boundary.AccounTuristManager;
import it.tsp.Boundary.PartecipantsManager;
import it.tsp.Boundary.TravelManager;
import it.tsp.Entity.AccounTurist;
import it.tsp.Entity.Partecipants;
import it.tsp.Entity.Travel;

public class MainViaggi_jpa extends javax.swing.JFrame {
    private EntityManagerFactory emf;
    private EntityManager em;

    
    public MainViaggi_jpa() {
        emf = Persistence.createEntityManagerFactory("pinastravel");
        em = emf.createEntityManager();    
    }

    public void refreshListaccounturist(DefaultListModel<AccounTurist> atLst) {
        List<AccounTurist> at = AccounTuristManager.atList();
        atLst.clear();
        at.forEach(atLst::addElement);
    }

    public void refreshListtravel(DefaultListModel<Travel> tLst) {
        List<Travel> t = TravelManager.tList();
        tLst.clear();
        t.forEach(tLst::addElement);
    }

    public void refreshListpartecipants(DefaultListModel<Partecipants> pLst) {
        List<Partecipants> p = PartecipantsManager.pList();
        pLst.clear();
        p.forEach(pLst::addElement);
        
    }
}