package it.tsp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        refreshListaccounturist();
        refreshListtravel();
        refreshListpartecipants();
        initComponents();
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainViaggi_jpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainViaggi_jpa main = new MainViaggi_jpa();
                main.setVisible(true);
            }
        });
    }

    public void refreshListaccounturist() {
        List<AccounTurist> at = AccounTuristManager.atList();
        DefaultListModel<AccounTurist> model = new DefaultListModel<>();
        at.forEach(model::addElement);
        lstAccounTurist.setModel(model);
    }

    public void refreshListtravel() {
        List<Travel> t = TravelManager.tList();
        DefaultListModel<Travel> model = new DefaultListModel<>();
        t.forEach(model::addElement);
        lstTravel.setModel(model);
    }

    public void refreshListpartecipants() {
        List<Partecipants> p = PartecipantsManager.pList();
        DefaultListModel<Partecipants> model = new DefaultListModel<>();
        p.forEach(model::addElement);
        lstPartecipants.setModel(model);
    }
    private void initComponents() {

        lbPinasTravel = new javax.swing.JLabel();
        lbNewAccounTurist = new javax.swing.JLabel();
        lbfname = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lbphone = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        txFname = new javax.swing.JTextField();
        txLname = new javax.swing.JTextField();
        txPhone = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
        btSigninTurist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAccounTurist = new javax.swing.JList<>();
        lbAccounTurist = new javax.swing.JLabel();
        lbNewTravel = new javax.swing.JLabel();
        lbSantMariano = new javax.swing.JLabel();
        lbLength = new javax.swing.JLabel();
        lbDayPrice = new javax.swing.JLabel();
        lbCarriage = new javax.swing.JLabel();
        lbDepartureDate = new javax.swing.JLabel();
        txLength = new javax.swing.JTextField();
        txDestination = new javax.swing.JTextField();
        txDepartureDate = new javax.swing.JTextField();
        txCarriage = new javax.swing.JTextField();
        btSigninTravel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPartecipants = new javax.swing.JList<>();
        lbTravel = new javax.swing.JLabel();
        spDayPrice = new javax.swing.JSpinner();
        lbPartecipants = new javax.swing.JLabel();
        lbPrezzoPrenotazione = new javax.swing.JLabel();
        btPartecipants = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstTravel = new javax.swing.JList<>();
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
    
        lbPinasTravel.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        lbPinasTravel.setText("Welcome to Pina's Travels");
    
        lbNewAccounTurist.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbNewAccounTurist.setText("Nuovo clt");
    
        lbfname.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbfname.setText("Nome:");
    
        lblname.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblname.setText("Cognome:");
    
        lbphone.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbphone.setText("Telefono:");
    
        lbemail.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbemail.setText("email:");
    
        txFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFnameActionPerformed(evt);
            }
        });
        txFname.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txFnamePropertyChange(evt);
            }
        });
    
        txLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLnameActionPerformed(evt);
            }
        });
        txLname.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txLnamePropertyChange(evt);
            }
        });
    
        txPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPhoneActionPerformed(evt);
            }
        });
        txPhone.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txPhonePropertyChange(evt);
            }
        });
    
        txEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEmailActionPerformed(evt);
            }
        });
        txEmail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txEmailPropertyChange(evt);
            }
        });
    
        btSigninTurist.setText("Registra");
        btSigninTurist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSigninTuristActionPerformed(evt);
            }
        });
    
        lstAccounTurist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstAccounTurist);
    
        lbAccounTurist.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbAccounTurist.setText("Lista clt");
    
        lbNewTravel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbNewTravel.setText("Nuova Destinazione");
    
        lbSantMariano.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbSantMariano.setText("Destinazione:");
    
        lbLength.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbLength.setText("Durata (gg):");
    
        lbDayPrice.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbDayPrice.setText("prezzo/gg:");
    
        lbCarriage.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbCarriage.setText("Trasporto:");
    
        lbDepartureDate.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbDepartureDate.setText("Data partenza:");
    
        txLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLengthActionPerformed(evt);
            }
        });
        txLength.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txLengthPropertyChange(evt);
            }
        });
    
        txDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDestinationActionPerformed(evt);
            }
        });
        txDestination.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txDestinationPropertyChange(evt);
            }
        });
    
        txDepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDepartureDateActionPerformed(evt);
            }
        });
        txDepartureDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txDepartureDatePropertyChange(evt);
            }
        });
    
        txCarriage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCarriageActionPerformed(evt);
            }
        });
        txCarriage.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txCarriagePropertyChange(evt);
            }
        });
    
        btSigninTravel.setText("Registra");
        btSigninTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSigninTravelActionPerformed(evt);
            }
        });
    
        lstPartecipants.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstPartecipants);
    
        lbTravel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbTravel.setText("Lista viaggi");
    
        lbPartecipants.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbPartecipants.setText("Lista Prenotazioni");
    
        lbPrezzoPrenotazione.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbPrezzoPrenotazione.setText("Nuova prenotazione:seleziona clt - seleziona viaggio, clicca:");
    
        btPartecipants.setText("Prenota");
        btPartecipants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPartecipantsActionPerformed(evt);
            }
        });
    
        lstTravel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstTravel);
    
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout
                                                                        .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lbPinasTravel)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(lbfname)
                                                                                        .addComponent(lblname)
                                                                                        .addComponent(lbphone)
                                                                                        .addComponent(lbemail)
                                                                                        .addComponent(btSigninTurist))
                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false)
                                                                                        .addComponent(txPhone,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                310, Short.MAX_VALUE)
                                                                                        .addComponent(txFname)
                                                                                        .addComponent(txLname)
                                                                                        .addComponent(txEmail)))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(36, 36, 36)
                                                                .addComponent(btSigninTravel))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addGroup(layout
                                                                        .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(lbSantMariano)
                                                                        .addComponent(lbLength)
                                                                        .addComponent(lbDayPrice)
                                                                        .addComponent(lbCarriage)
                                                                        .addComponent(lbDepartureDate))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout
                                                                        .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txDepartureDate,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txCarriage,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(spDayPrice,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txLength,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txDestination,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(lbNewTravel)
                                                        .addComponent(lbNewAccounTurist))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(lbAccounTurist)
                                                                .addGap(215, 215, 215))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 422,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(lbTravel)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(jScrollPane2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lbPrezzoPrenotazione)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btPartecipants)))
                                                .addGap(151, 151, 151))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(357, 357, 357)
                                .addComponent(lbPartecipants)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(472, 472, 472)
                                        .addComponent(jScrollPane3)
                                        .addGap(10, 10, 10))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbPinasTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(lbNewAccounTurist)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbfname, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txFname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txLname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbphone, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txPhone, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbAccounTurist)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSigninTurist)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNewTravel)
                                        .addComponent(lbTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txDestination, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbSantMariano, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbLength)
                                        .addComponent(txLength, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbDayPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spDayPrice, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbCarriage, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txCarriage, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbDepartureDate)
                                        .addComponent(txDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btSigninTravel)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbPrezzoPrenotazione)
                                        .addComponent(btPartecipants))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPartecipants)
                                .addGap(8, 8, 8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(278, 278, 278)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(321, Short.MAX_VALUE))));
    
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txFnameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txFnameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txFnameActionPerformed
    
    private void txFnamePropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_txFnamePropertyChange
        // TODO add your handling code here:
    
    }// GEN-LAST:event_txFnamePropertyChange
    
    private void txLnameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txLnameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txLnameActionPerformed
    
    private void txLnamePropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_txLnamePropertyChange
        // TODO add your handling code here:
    }// GEN-LAST:event_txLnamePropertyChange
    
    private void txPhoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txPhoneActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txPhoneActionPerformed
    
    private void txPhonePropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_txPhonePropertyChange
        // TODO add your handling code here:
    }// GEN-LAST:event_txPhonePropertyChange
    
    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txEmailActionPerformed
    
    private void txEmailPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_txEmailPropertyChange
        // TODO add your handling code here:
    }
    private void txLengthActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txLengthActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txLengthActionPerformed
    
    private void txLengthPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_txLengthPropertyChange
        // TODO add your handling code here:
    }// GEN-LAST:event_txLengthPropertyChange
    
    private void txDestinationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txDestinationActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txDestinationActionPerformed
    
    private void txDestinationPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_txDestinationPropertyChange
        // TODO add your handling code here:
    }// GEN-LAST:event_txDestinationPropertyChange
    
    private void txDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txDepartureDateActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txDepartureDateActionPerformed
    
    private void txDepartureDatePropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_txDepartureDatePropertyChange
        // TODO add your handling code here:
    }// GEN-LAST:event_txDepartureDatePropertyChange
    
    private void txCarriageActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txCarriageActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txCarriageActionPerformed
    
    private void txCarriagePropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_txCarriagePropertyChange
        // TODO add your handling code here:
    }

private void btSigninTuristActionPerformed(java.awt.event.ActionEvent evt) {
    String nome = txFname.getText();
    String cognome = txLname.getText();
    String telefono = txPhone.getText();
    String email = txEmail.getText();

    AccounTurist turist = new AccounTurist(nome, cognome, telefono, email);
    txFname.setText("");
    txLname.setText("");
    txPhone.setText("");
    txEmail.setText("");
}

private void btSigninTravelActionPerformed(java.awt.event.ActionEvent evt) {
    
    String destinazione = txDestination.getText();
    String durata = txLength.getText();
    Number numero = (Number) spDayPrice.getValue();
    BigDecimal prezzo = BigDecimal.valueOf(numero.doubleValue());
    String trasporto = txCarriage.getText();
    String dateString = txDepartureDate.getText();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime datapartenza = LocalDateTime.parse(dateString, formatter);

   // Travel trip = new Travel(destinazione, durata, prezzo, trasporto, datapartenza);
    txDestination.setText("");
    txLength.setText("");
    spDayPrice.setValue(numero);
    txCarriage.setText("");
    txDepartureDate.setText("");
    }

    private void btPartecipantsActionPerformed(java.awt.event.ActionEvent evt) {
        int selclt = lstAccounTurist.getSelectedIndex();
        int seltravel = lstTravel.getSelectedIndex();
        String queryInsert = "INSERT INTO partecipants (idtravel,idaccounturist) VALUES (?, ?)";
    
    }

private javax.swing.JButton btPartecipants;
private javax.swing.JButton btSigninTravel;
private javax.swing.JButton btSigninTurist;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JScrollPane jScrollPane2;
private javax.swing.JScrollPane jScrollPane3;
private javax.swing.JLabel lbAccounTurist;
private javax.swing.JLabel lbCarriage;
private javax.swing.JLabel lbDayPrice;
private javax.swing.JLabel lbDepartureDate;
private javax.swing.JLabel lbLength;
private javax.swing.JLabel lbNewAccounTurist;
private javax.swing.JLabel lbNewTravel;
private javax.swing.JLabel lbPartecipants;
private javax.swing.JLabel lbPinasTravel;
private javax.swing.JLabel lbPrezzoPrenotazione;
private javax.swing.JLabel lbSantMariano;
private javax.swing.JLabel lbTravel;
private javax.swing.JLabel lbemail;
private javax.swing.JLabel lbfname;
private javax.swing.JLabel lblname;
private javax.swing.JLabel lbphone;
private javax.swing.JList<AccounTurist> lstAccounTurist;
private javax.swing.JList<Partecipants> lstPartecipants;
private javax.swing.JList<Travel> lstTravel;
private javax.swing.JSpinner spDayPrice;
private javax.swing.JTextField txCarriage;
private javax.swing.JTextField txDepartureDate;
private javax.swing.JTextField txDestination;
private javax.swing.JTextField txEmail;
private javax.swing.JTextField txFname;
private javax.swing.JTextField txLength;
private javax.swing.JTextField txLname;
private javax.swing.JTextField txPhone;

}