/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Classes.Client;
import javax.swing.JOptionPane;
import EDD.HashTable;
import Functions.Helpers;
import static Interfaces.Welcome.states;

/**
 * La clase SearchLodging representa la ventana de búsqueda de hospedajes de
 * clientes. Permite buscar si un cliente está hospedado y en qué habitación.
 *
 * @author Christian
 */
public class SearchLodging extends javax.swing.JFrame {

    /**
     * Instancia de la clase Menu asociada a esta ventana de búsqueda de
     * hospedajes.
     */
    public static Menu v1;

    /**
     * Constructor de la clase SearchLodging. Inicializa la interfaz de usuario
     * y oculta la ventana de menú asociada.
     *
     * @param v1 Instancia de la clase Menu que se asocia a esta ventana de
     * búsqueda de hospedajes.
     */
    public SearchLodging(Menu v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * Método para realizar la validación de los campos de entrada del nombre y
     * apellido. Muestra un mensaje de error si alguno de los campos está vacío.
     */
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

    }

    /**
     * Método para validar si una cadena contiene solo números.
     *
     * @param num Cadena a validar.
     * @return true si la cadena contiene solo números, false de lo contrario.
     */
    private boolean validateNumbers(String num) {
        Helpers help = new Helpers();
        return help.validateNumbers(num);
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
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        searchLodging_icon = new javax.swing.JLabel();
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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 30));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Indique el apellido del huesped:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, -1));

        searchText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(searchText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 290, 30));

        searchText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(searchText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 290, 30));

        search_lastName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search_lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_lastNameKeyReleased(evt);
            }
        });
        jPanel1.add(search_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 30));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Indique el nombre del huesped:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, -1));

        lblName.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, 20));

        lblLastName.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, 20));

        searchLodging_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchlodging.png"))); // NOI18N
        jPanel1.add(searchLodging_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado al hacer clic en el botón "Buscar". Realiza el proceso de
     * búsqueda de hospedaje de un cliente.
     *
     * @param evt El evento de acción generado al hacer clic en el botón
     * "Buscar".
     */
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String name = search_name.getText();
        String lastname = search_lastName.getText();
        Client client = new Client(name, lastname);

        if (name.isEmpty() || lastname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar las casillas!");
        } else if (validateNumbers(name) || validateNumbers(lastname)) {
            JOptionPane.showMessageDialog(null, "El nombre y el apellido no pueden ser números.");
        } else {
            if (states.isInHashIndexN(client) != -1) {
                int num_hab = states.isInHashIndexN(client) + 1;
                JOptionPane.showMessageDialog(null, "El cliente " + name + " " + lastname + " está hospedado en la habitación." + num_hab);
            } else {
                JOptionPane.showMessageDialog(null, "El cliente " + name + " " + lastname + " no esta hospedado.");
            }
        }
    }//GEN-LAST:event_searchActionPerformed

    /**
     * Método invocado al hacer clic en el botón "Volver". Oculta la ventana
     * actual de búsqueda de hospedajes y muestra la ventana de menú.
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
     * Método invocado al soltar una tecla en el campo de entrada del nombre.
     * Realiza la validación del campo de entrada del nombre.
     *
     * @param evt El evento de teclado generado al soltar una tecla en el campo
     * de entrada del nombre.
     */
    private void search_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_nameKeyReleased
        Validation();
    }//GEN-LAST:event_search_nameKeyReleased

    /**
     * Método invocado al soltar una tecla en el campo de entrada del apellido.
     * Realiza la validación del campo de entrada del apellido.
     *
     * @param evt El evento de teclado generado al soltar una tecla en el campo
     * de entrada del apellido.
     */
    private void search_lastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_lastNameKeyReleased
        Validation();
    }//GEN-LAST:event_search_lastNameKeyReleased

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JButton search;
    private javax.swing.JLabel searchLodging_icon;
    private javax.swing.JTextField searchText1;
    private javax.swing.JTextField searchText2;
    private javax.swing.JTextField search_lastName;
    private javax.swing.JTextField search_name;
    // End of variables declaration//GEN-END:variables
}
