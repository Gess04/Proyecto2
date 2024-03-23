/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Classes.Reservation;
import Classes.Status;
import EDD.List;
import Functions.Helpers;
import static Interfaces.Welcome.reservations;
import static Interfaces.Welcome.room_availables;
import static Interfaces.Welcome.rooms;
import static Interfaces.Welcome.states;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    public static Menu v1;

    public CheckIn(Menu v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void Validation() {

        if (input_ci.getText().isEmpty()) {
            lblId.setText("*Campo Requerido");
        } else {
            lblId.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        input_ci = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lodge = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, 40));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check In");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        input_ci.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        input_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_ciActionPerformed(evt);
            }
        });
        input_ci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_ciKeyReleased(evt);
            }
        });
        jPanel1.add(input_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 370, 30));

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Introduzca la cédula del huésped:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 300, -1));

        lblId.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 300, 20));

        lodge.setBackground(new java.awt.Color(0, 0, 0));
        lodge.setForeground(new java.awt.Color(255, 255, 255));
        lodge.setText("Hospedar");
        lodge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lodgeActionPerformed(evt);
            }
        });
        jPanel1.add(lodge, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 600, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Menu window1 = new Menu(b);
        window1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void input_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_ciActionPerformed

    private void input_ciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_ciKeyReleased
        Validation();
    }//GEN-LAST:event_input_ciKeyReleased

    private void lodgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lodgeActionPerformed
        Helpers help = new Helpers();
        String id = input_ci.getText();
        int ci = help.ValidateID(id);
        List habs_disp = new List();

        if (input_ci.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar la casilla!");
        }

        else if (ci != -1) {
            if (reservations.searchNode2(reservations.getRoot(), ci) != null) {
                Reservation reservation = reservations.searchNode2(reservations.getRoot(), ci).getReservation();

                for (int i = 0; i < room_availables.getSize(); i++) {
                    int num_hab = (int) room_availables.getValor(i) + 1;

                    if (rooms.searchByKey(num_hab).getRoomType().equalsIgnoreCase(reservation.getRoomType())) {
                        habs_disp.addEnd(num_hab);
                    }
                }

                if (habs_disp.getSize() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay habitación del tipo deseado disponible");
                } else {
                    Status status = new Status(-1, reservations.searchNode2(reservations.getRoot(), ci).getReservation().getClient(), reservations.searchNode2(reservations.getRoot(), ci).getReservation().getCheckIn());
                    int count = 0;
                    for (int i = 0; i < habs_disp.getSize(); i++) {
                        int num_hab = (int) habs_disp.getValor(i);
                        status.setNum_hab(num_hab);
                        if (states.insertStatus(status) != 0 || states.insertStatus(status) != -1) {
                            room_availables.clear();
                            states.Availables(room_availables);
                            reservations.deleteByClientId(ci);
                            JOptionPane.showMessageDialog(null, "El cliente se ha hospedado en la habitacion " + num_hab);
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        JOptionPane.showMessageDialog(null, "No hay habitación del tipo deseado disponible");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "La cédula " + ci + " no se ha encontrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cédula no es valida");
        }
    }//GEN-LAST:event_lodgeActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JTextField input_ci;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JButton lodge;
    // End of variables declaration//GEN-END:variables
}
