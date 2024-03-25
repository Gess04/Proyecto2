/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Functions.Helpers;
import Classes.Client;
import static Interfaces.Welcome.room_availables;
import static Interfaces.Welcome.rooms;
import static Interfaces.Welcome.states;
import javax.swing.JOptionPane;

/**
 * La clase CheckOut representa la ventana de salida de clientes del hotel.
 * Permite realizar el proceso de salida de un cliente del hotel.
 *
 * @author Christian
 */
public class CheckOut extends javax.swing.JFrame {

    /**
     * Instancia de la clase Menu asociada a esta ventana de salida.
     */
    public static Menu v1;

    /**
     * Constructor de la clase CheckOut. Inicializa la interfaz de usuario y
     * oculta la ventana de menú asociada.
     *
     * @param v1 Instancia de la clase Menu que se asocia a esta ventana de
     * salida.
     */
    public CheckOut(Menu v1) {
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

        if (search_lastname.getText().isEmpty()) {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        search_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        search_lastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese la cédula del huesped:");

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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 40));

        search_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_nameKeyReleased(evt);
            }
        });
        jPanel1.add(search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 310, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check Out");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el apellido del huesped:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Buscar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 90, 30));

        search_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_lastnameKeyReleased(evt);
            }
        });
        jPanel1.add(search_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 310, 30));

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese el nombre del huesped:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblName.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, 20));

        lblLastName.setFont(new java.awt.Font("Britannic Bold", 2, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 260, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado al hacer clic en el botón "Volver". Oculta la ventana
     * actual de salida y muestra la ventana de menú.
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
     * búsqueda y salida de un cliente del hotel.
     *
     * @param evt El evento de acción generado al hacer clic en el botón
     * "Buscar".
     */
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String name = search_name.getText();
        String lastname = search_lastname.getText();

        // Verifica si los campos están vacíos
        if (name.isEmpty() || lastname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar las casillas!");
        } else if (validateNumbers(name) || validateNumbers(lastname)) {
            JOptionPane.showMessageDialog(null, "El nombre y el apellido no pueden ser números.");
        } else {
            // Si los campos no están vacíos y no son números, procede con la lógica existente
            Client client = new Client(name, lastname);
            if (states.isInHashIndexN(client) != -1) {
                int num_hab = states.isInHashIndexN(client) + 1;

                rooms.searchByKey(num_hab).setAvailable(true);
                rooms.searchByKey(num_hab).getHistory().addEnd(states.isInHashStatus(client));

                states.deleteStatus(states.isInHashStatus(client));

                room_availables.clear();

                states.Availables(room_availables);

                JOptionPane.showMessageDialog(null, "Haz salido del Hotel");
            } else {
                JOptionPane.showMessageDialog(null, "El cliente " + name + " " + lastname + " no esta hospedado");
            }
        }
    }//GEN-LAST:event_searchActionPerformed

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
    private void search_lastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_lastnameKeyReleased
        Validation();
    }//GEN-LAST:event_search_lastnameKeyReleased

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
            java.util.logging.Logger.getLogger(CheckOut.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_lastname;
    private javax.swing.JTextField search_name;
    // End of variables declaration//GEN-END:variables
}
