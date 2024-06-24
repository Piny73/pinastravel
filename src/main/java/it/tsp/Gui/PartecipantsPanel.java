package it.tsp.Gui;
import javax.swing.*;

import it.tsp.Entity.Partecipants;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PartecipantsPanel extends JPanel {
    private JTextField idTravel;
    private JTextField idAccounTurist;

    public PartecipantsPanel() {
        setLayout(new GridLayout(2, 2));

        add(new JLabel("Id Travel:"));
        idTravel = new JTextField();
        add(idTravel);

        add(new JLabel("Id Account Turist:"));
        idAccounTurist = new JTextField();
        add(idAccounTurist);

        JButton insertButton = new JButton("Inserisci");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("pinastravel");
                EntityManager em = emf.createEntityManager();
                EntityTransaction transaction = em.getTransaction();

                try {
                    transaction.begin();
                    Partecipants partecipants = new Partecipants(Integer.parseInt(idTravel.getText()), Integer.parseInt(idAccounTurist.getText()));
                    em.persist(partecipants);
                    transaction.commit();

                    System.out.println("Row impacted: 1");
                    // Call a method to refresh the list of partecipants

                } catch (Exception ex) {
                    transaction.rollback();
                    System.out.println(ex);
                } finally {
                    em.close();
                }
            }
        });
        add(insertButton);
    }
}