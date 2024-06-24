package it.tsp.Gui;

import javax.swing.*;

import it.tsp.Entity.Travel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TravelPanel extends JPanel {
    private JTextField Destination;
    private JTextField Length;
    private JTextField DayPrice;
    private JTextField Carriage;
    private JTextField DepartureDate;

    public TravelPanel() {
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Destinazione:"));
        Destination = new JTextField();
        add(Destination);

        add(new JLabel("Lunghezza viaggio:"));
        Length = new JTextField();
        add(Length);

        add(new JLabel("Prezzo al giorno:"));
        DayPrice = new JTextField();
        add(DayPrice);

        add(new JLabel("Carrozza:"));
        Carriage = new JTextField();
        add(Carriage);

        add(new JLabel("Data partenza:"));
        DepartureDate = new JTextField();
        add(DepartureDate);

        JButton insertButton = new JButton("Inserisci");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("pinastravel");
                EntityManager em = emf.createEntityManager();

                Travel travel = new Travel(Destination.getText(), Integer.parseInt(Length.getText()), Float.parseFloat(DayPrice.getText()), Carriage.getText(), DepartureDate.getText());
                em.persist(travel);
                em.close();
            }
        });
        add(insertButton);
    }
}