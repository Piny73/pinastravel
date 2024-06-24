package it.tsp.Gui;
import javax.swing.*;

import it.tsp.Entity.AccounTurist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TuristPanel extends JPanel {
    private JTextField Fname;
    private JTextField Lname;
    private JTextField Phone;
    private JTextField Email;

    public TuristPanel() {
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Nome:"));
        Fname = new JTextField();
        add(Fname);

        add(new JLabel("Cognome:"));
        Lname = new JTextField();
        add(Lname);

        add(new JLabel("Telefono:"));
        Phone = new JTextField();
        add(Phone);

        add(new JLabel("Email:"));
        Email = new JTextField();
        add(Email);

        JButton insertButton = new JButton("Inserisci nuovo clt");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("pinastravel");
                EntityManager em = emf.createEntityManager();

                AccounTurist turist = new AccounTurist(Fname.getText(), Lname.getText(), Phone.getText(), Email.getText());
                em.persist(turist);
                em.close();
            }
        });
        add(insertButton);
    }
}