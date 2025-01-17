/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.tsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author utentepc
 */
public class WinViaggi extends javax.swing.JFrame {

    static final String DB_URL = "jdbc:mysql://localhost:3306/pinastravel";
    static final String USER = "root";
    static final String PASS = "root";
    Connection conn;
    ArrayList<Integer> listaccounturist = new ArrayList<Integer>();
    ArrayList<Integer> listtravel = new ArrayList<Integer>();

    /**
     * Creates new form WinViaggi
     */
    public WinViaggi() {
        initComponents();
        refreshListaccounturist();
        refreshListtravel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        lbDestination = new javax.swing.JLabel();
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
        lstTravel = new javax.swing.JList<>();
        lbTravel = new javax.swing.JLabel();
        spDayPrice = new javax.swing.JSpinner();

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

        lbDestination.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbDestination.setText("Città:");

        lbLength.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbLength.setText("Durata (gg):");

        lbDayPrice.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbDayPrice.setText("prezzo giornaliero:");

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

        lstTravel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstTravel);

        lbTravel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbTravel.setText("Lista viaggi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNewAccounTurist)
                    .addComponent(lbPinasTravel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbfname)
                            .addComponent(lblname)
                            .addComponent(lbphone)
                            .addComponent(lbemail)
                            .addComponent(btSigninTurist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txFname)
                            .addComponent(txLname)
                            .addComponent(txPhone)
                            .addComponent(txEmail)))
                    .addComponent(lbNewTravel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDestination)
                            .addComponent(lbLength)
                            .addComponent(lbCarriage)
                            .addComponent(lbDepartureDate)
                            .addComponent(lbDayPrice)
                            .addComponent(btSigninTravel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txCarriage, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txDestination, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txLength, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txDepartureDate, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(spDayPrice))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTravel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addComponent(lbAccounTurist)
                        .addComponent(jScrollPane2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPinasTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNewAccounTurist)
                            .addComponent(lbAccounTurist))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbfname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbphone, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSigninTurist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTravel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNewTravel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDestination))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLength)
                            .addComponent(txLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDayPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spDayPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txCarriage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCarriage, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDepartureDate)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSigninTravel)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFnameActionPerformed

    private void txFnamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txFnamePropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txFnamePropertyChange

    private void txLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLnameActionPerformed

    private void txLnamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txLnamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txLnamePropertyChange

    private void txPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPhoneActionPerformed

    private void txPhonePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txPhonePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txPhonePropertyChange

    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEmailActionPerformed

    private void txEmailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txEmailPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txEmailPropertyChange

    private void btSigninTuristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSigninTuristActionPerformed
        // TODO add your handling code here:
        String nome = txFname.getText();
        String cognome = txLname.getText();
        String telefono = txPhone.getText();
        String email = txEmail.getText();

        AccounTurist turist = new AccounTurist(nome, cognome, telefono, email);
        txFname.setText("");
        txLname.setText("");
        txPhone.setText("");
        txEmail.setText("");

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("insert INTO accounturist(`Fname`, `Lname`, `Phone`, `Email`)"
                    + "values(?,?,?,?)");
            stmt.setString(1, nome);
            stmt.setString(2, cognome);
            stmt.setString(3, telefono);
            stmt.setString(4, email);
            int rows = stmt.executeUpdate();
            System.out.println("Row impacted: " + rows);
            refreshListaccounturist();

        } catch (Exception e) {
            System.out.println(e);

        }

    }//GEN-LAST:event_btSigninTuristActionPerformed

    private void txLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLengthActionPerformed

    private void txLengthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txLengthPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txLengthPropertyChange

    private void txDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDestinationActionPerformed

    private void txDestinationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txDestinationPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txDestinationPropertyChange

    private void txDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDepartureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDepartureDateActionPerformed

    private void txDepartureDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txDepartureDatePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txDepartureDatePropertyChange

    private void txCarriageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCarriageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCarriageActionPerformed

    private void txCarriagePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txCarriagePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txCarriagePropertyChange

    private void btSigninTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSigninTravelActionPerformed
        // TODO add your handling code here:
        String città = txDestination.getText();
        String durata = txLength.getText();
        Number numero = (Number) spDayPrice.getValue();
        BigDecimal prezzo = BigDecimal.valueOf(numero.doubleValue());
        String trasporto = txCarriage.getText();

        String dateString = txDepartureDate.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate datapartenza = LocalDate.parse(dateString, formatter);

        Travel trip = new Travel(città, durata, prezzo, trasporto, datapartenza);
        txDestination.setText("");
        txLength.setText("");
        spDayPrice.setValue(numero);
        txCarriage.setText("");
        txDepartureDate.setText("");

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("insert INTO travel (Destination, Length, DayPrice, Carriage, DepartureDate) "
                    + "values(?,?,?,?,?)");
            stmt.setString(1, città);
            stmt.setString(2, durata);
            stmt.setString(3, prezzo.toString());
            stmt.setString(4, trasporto);
            String datapartenzaString = datapartenza.toString();
            stmt.setString(5, datapartenzaString);
            int rows = stmt.executeUpdate();
            System.out.println("Row impacted: " + rows);
            refreshListtravel();

        } catch (Exception e) {
            System.out.println(e);

        }


    }//GEN-LAST:event_btSigninTravelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinViaggi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinViaggi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinViaggi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinViaggi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinViaggi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSigninTravel;
    private javax.swing.JButton btSigninTurist;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAccounTurist;
    private javax.swing.JLabel lbCarriage;
    private javax.swing.JLabel lbDayPrice;
    private javax.swing.JLabel lbDepartureDate;
    private javax.swing.JLabel lbDestination;
    private javax.swing.JLabel lbLength;
    private javax.swing.JLabel lbNewAccounTurist;
    private javax.swing.JLabel lbNewTravel;
    private javax.swing.JLabel lbPinasTravel;
    private javax.swing.JLabel lbTravel;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbfname;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbphone;
    private javax.swing.JList<String> lstAccounTurist;
    private javax.swing.JList<String> lstTravel;
    private javax.swing.JSpinner spDayPrice;
    private javax.swing.JTextField txCarriage;
    private javax.swing.JTextField txDepartureDate;
    private javax.swing.JTextField txDestination;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txFname;
    private javax.swing.JTextField txLength;
    private javax.swing.JTextField txLname;
    private javax.swing.JTextField txPhone;
    // End of variables declaration//GEN-END:variables

    private void refreshListaccounturist() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("SELECT idAccounTurist, concat(Lname,' ',Fname) as turista FROM pinastravel.accounturist order by turista;");
            ResultSet rs = stmt.executeQuery();
            DefaultListModel model = new DefaultListModel();
            listaccounturist.clear();
            while (rs.next()) {
                model.addElement(rs.getString("turista"));
                listaccounturist.add(rs.getInt("idAccounTurist"));
                // Retrieve by column name              
            }
            lstAccounTurist.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void refreshListtravel() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("SELECT idTravel,concat(Destination,' - ',Length,' giorni',' - ',DayPrice,' € al giorno') as destinazione FROM pinastravel.travel order by destinazione;");
            ResultSet rs = stmt.executeQuery();
            DefaultListModel model = new DefaultListModel();
            listtravel.clear();
            while (rs.next()) {
                model.addElement(rs.getString("destinazione"));
                listtravel.add(rs.getInt("idTravel"));
                // Retrieve by column name              
            }
            lstTravel.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
