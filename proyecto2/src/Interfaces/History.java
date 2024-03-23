/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Functions.Helpers;
import static Interfaces.Welcome.rooms;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class History extends javax.swing.JFrame {

    /**
     * Creates new form History
     */
    public static Menu v1;

    public History(Menu v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    public void Validation() {

        if (num_search.getText().isEmpty()) {
            lblNumber.setText("*Campo Requerido");
        } else {
            lblNumber.setText("");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        num_search = new javax.swing.JTextField();
        search_buttom = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 314, 100, 40));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Historial");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        num_search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_searchActionPerformed(evt);
            }
        });
        num_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                num_searchKeyReleased(evt);
            }
        });
        jPanel1.add(num_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 390, 30));

        search_buttom.setBackground(new java.awt.Color(0, 0, 0));
        search_buttom.setForeground(new java.awt.Color(255, 255, 255));
        search_buttom.setText("Buscar");
        search_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttomActionPerformed(evt);
            }
        });
        jPanel1.add(search_buttom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 100, 40));

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Introduzca el número de la habitación:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 330, -1));

        lblNumber.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Menu window1 = new Menu(b);
        window1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void search_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttomActionPerformed
        Helpers help = new Helpers();
        String num = num_search.getText();
        int roomNumber = help.ValidateNumbers(num);

        if (num_search.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar la casilla!");
        }
        else if (roomNumber != -1) {
            if (rooms.searchByKey(roomNumber).showHistory() != null) {
                JOptionPane.showMessageDialog(null, rooms.searchByKey(roomNumber).showHistory());
            } else {
                JOptionPane.showMessageDialog(null, "No ha pasado nadie por la habitación " + roomNumber);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El número de habitación no es válido");
        }
    }//GEN-LAST:event_search_buttomActionPerformed

    private void num_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_searchActionPerformed
      
    }//GEN-LAST:event_num_searchActionPerformed

    private void num_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_searchKeyReleased
        Validation();
    }//GEN-LAST:event_num_searchKeyReleased

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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JTextField num_search;
    private javax.swing.JButton search_buttom;
    // End of variables declaration//GEN-END:variables
}
