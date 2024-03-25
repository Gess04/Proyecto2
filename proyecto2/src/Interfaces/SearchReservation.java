/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Functions.Functions;
import Functions.Helpers;
import static Interfaces.Welcome.reservations;
import javax.swing.JOptionPane;

/**
 * La clase SearchReservation representa la ventana de búsqueda de reservas de
 * clientes. Permite buscar una reserva por número de identificación (cédula).
 *
 * @author Christian
 */
public class SearchReservation extends javax.swing.JFrame {

    /**
     * Instancia de la clase Menu asociada a esta ventana de búsqueda de
     * reservas.
     */
    public static Menu v1;

    /**
     * Constructor de la clase SearchReservation. Inicializa la interfaz de
     * usuario y oculta la ventana de menú asociada.
     *
     * @param v1 Instancia de la clase Menu que se asocia a esta ventana de
     * búsqueda de reservas.
     */
    public SearchReservation(Menu v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    /**
     * Método para realizar la validación del campo de entrada del número de
     * identificación (cédula). Muestra un mensaje de error si el campo está
     * vacío.
     */
    public void Validation() {

        if (searchByID.getText().isEmpty()) {
            lblId.setText("*Campo Requerido");
        } else {
            lblId.setText("");
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
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchByID = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 40));

        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar reservación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 30));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Buscar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 90, 30));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese la cédula del huesped:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        searchByID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchByID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByIDKeyReleased(evt);
            }
        });
        jPanel1.add(searchByID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 310, 30));

        lblId.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado al hacer clic en el botón "Volver". Oculta la ventana
     * actual de búsqueda de reservas y muestra la ventana de menú.
     *
     * @param evt El evento de acción generado al hacer clic en el botón
     * "Volver".
     */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Menu window1 = new Menu(b);
        window1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    /**
     * Método invocado al hacer clic en el botón "Buscar". Realiza el proceso de
     * búsqueda de una reserva por número de identificación (cedula).
     *
     * @param evt El evento de acción generado al hacer clic en el botón
     * "Buscar".
     */
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        Helpers help = new Helpers();
        String cedula = searchByID.getText();
        int ci = help.ValidateID(cedula);

        if (cedula.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar la casilla!");

        } else if (!help.validateNumbers(cedula)) {
            JOptionPane.showMessageDialog(null, "Debes llenar la casilla con números!");
        } else {

            if (ci != -1) {
                if (reservations.searchNode2(reservations.getRoot(), ci) != null) {
                    JOptionPane.showMessageDialog(null, reservations.searchNode2(reservations.getRoot(), ci).getReservation().toString());
                } else {
                    JOptionPane.showMessageDialog(null, "La cedula " + ci + " no se ha encontrado");
                }

            } else {
                JOptionPane.showMessageDialog(null, "La cedula no es valida");
            }
        }
    }//GEN-LAST:event_searchActionPerformed

    /**
     * Método invocado al soltar una tecla en el campo de entrada del número de
     * identificación (cedula). Realiza la validación del campo de entrada del
     * número de identificación (cedula).
     *
     * @param evt El evento de teclado generado al soltar una tecla en el campo
     * de entrada del número de identificación (cedula).
     */
    private void searchByIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByIDKeyReleased
        Validation();
    }//GEN-LAST:event_searchByIDKeyReleased

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
            java.util.logging.Logger.getLogger(SearchReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchReservation(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchByID;
    // End of variables declaration//GEN-END:variables
}
