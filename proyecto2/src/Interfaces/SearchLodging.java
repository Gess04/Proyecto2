/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Classes.Client;
import javax.swing.JOptionPane;
import EDD.HashTable;
import static Interfaces.Welcome.states;

/**
 *
 * @author Christian
 */
public class SearchLodging extends javax.swing.JFrame {

    /**
     * Creates new form FindLodging
     */
    public static Menu v1;

    public SearchLodging(Menu v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        bottomSave.setEnabled(false);

    }

    public void Validation() {

        if (search_lastName.getText().isEmpty()) {
            lblLastName.setText("*Campo Requerido");
        } else {
            lblLastName.setText("");
        }

        if (search_name.getText().isEmpty()) {
            lblName.setText("*Campo Requerido");
        } else {
            lblName.setText("");
        }

        if (search_name.getText().isEmpty() || search_lastName.getText().isEmpty()) {
            bottomSave.setEnabled(false);
        } else {
            bottomSave.setEnabled(true);
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
        search_name = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchText1 = new javax.swing.JTextField();
        searchText2 = new javax.swing.JTextField();
        search_lastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bottomSave = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 40));

        search_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_nameActionPerformed(evt);
            }
        });
        search_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_nameKeyReleased(evt);
            }
        });
        jPanel1.add(search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 290, 30));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Buscar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 110, 30));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar hospedaje");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 30));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Indique el apellido del huesped:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, -1));

        searchText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchText1ActionPerformed(evt);
            }
        });
        jPanel1.add(searchText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 290, 30));

        searchText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchText2ActionPerformed(evt);
            }
        });
        jPanel1.add(searchText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 290, 30));

        search_lastName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_lastNameActionPerformed(evt);
            }
        });
        search_lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_lastNameKeyReleased(evt);
            }
        });
        jPanel1.add(search_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, 30));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Indique el nombre del huesped:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, -1));

        bottomSave.setBackground(new java.awt.Color(0, 0, 0));
        bottomSave.setForeground(new java.awt.Color(255, 255, 255));
        bottomSave.setText("Guardar");
        bottomSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomSaveActionPerformed(evt);
            }
        });
        jPanel1.add(bottomSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 90, 40));

        lblName.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, 20));

        lblLastName.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String name = search_name.getText();
        String lastname = search_lastName.getText();

        if (search_lastName.getText().isEmpty() || search_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar las casillas!");
        }

        Client client = new Client(name, lastname);
        if (states.isInHashIndexN(client) != -1) {
            int num_hab = states.isInHashIndexN(client) + 1;
            JOptionPane.showMessageDialog(null, "El cliente " + name + " " + lastname + " esta hospedado en la habitacion " + num_hab);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente " + name + " " + lastname + " no esta hospedado");
        }

//        JOptionPane.showMessageDialog(null, );
    }//GEN-LAST:event_searchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Menu window1 = new Menu(b);
        window1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_nameActionPerformed

    private void search_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_lastNameActionPerformed

    private void bottomSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomSaveActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Menu window1 = new Menu(b);
        window1.setVisible(true);
    }//GEN-LAST:event_bottomSaveActionPerformed

    private void search_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_nameKeyReleased
        Validation();
    }//GEN-LAST:event_search_nameKeyReleased

    private void search_lastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_lastNameKeyReleased
        Validation();
    }//GEN-LAST:event_search_lastNameKeyReleased

    private void searchText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchText1ActionPerformed

    private void searchText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchText2ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchLodging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchLodging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchLodging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchLodging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchLodging(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton bottomSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText1;
    private javax.swing.JTextField searchText2;
    private javax.swing.JTextField search_lastName;
    private javax.swing.JTextField search_name;
    // End of variables declaration//GEN-END:variables
}
