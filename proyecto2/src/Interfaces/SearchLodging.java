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
        Label_lastname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchText1 = new javax.swing.JTextField();
        searchText2 = new javax.swing.JTextField();
        search_lastName = new javax.swing.JTextField();
        Label_name = new javax.swing.JLabel();
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

        Label_lastname.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        Label_lastname.setForeground(new java.awt.Color(255, 255, 255));
        Label_lastname.setText("Indique el apellido del huésped ");
        jPanel1.add(Label_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 480, -1));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar hospedaje");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 30));

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

        search_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_lastNameActionPerformed(evt);
            }
        });
        jPanel1.add(search_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 290, 30));

        Label_name.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        Label_name.setForeground(new java.awt.Color(255, 255, 255));
        Label_name.setText("Indique el nombre del huésped ");
        jPanel1.add(Label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 480, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String name = search_name.getText();
        String lastname = search_lastName.getText();
        
        
        Client client = new Client(name,lastname);
        if(states.isInHashIndexN(client) != -1){
            int num_hab = states.isInHashIndexN(client) + 1;
            JOptionPane.showMessageDialog(null, "El cliente " + name + " "+ lastname + " esta hospedado en la habitacion " +  num_hab);
        }else{
            JOptionPane.showMessageDialog(null, "El cliente " + name + " "+ lastname + " no esta hospedado");
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

    private void searchText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchText1ActionPerformed

    private void searchText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchText2ActionPerformed

    private void search_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_lastNameActionPerformed

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
    private javax.swing.JLabel Label_lastname;
    private javax.swing.JLabel Label_name;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText1;
    private javax.swing.JTextField searchText2;
    private javax.swing.JTextField search_lastName;
    private javax.swing.JTextField search_name;
    // End of variables declaration//GEN-END:variables
}
