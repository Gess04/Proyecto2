/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Classes.Client;
import EDD.AVL;
import EDD.BST;
import EDD.HashTable;
import EDD.List;
import Functions.FileCSV;
import javax.swing.JOptionPane;

/**
 * La clase Welcome representa la ventana de bienvenida de la aplicación. Esta
 * ventana carga los datos iniciales necesarios desde archivos CSV.
 * 
 * @author Christian
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * HashTable que almacena el estado actual de las habitaciones.
     */
    public static HashTable states = new HashTable();

    /**
     * BST que almacena las reservas de habitaciones.
     */
    public static BST reservations = new BST();

    /**
     * AVL que almacena la información de las habitaciones.
     */
    public static AVL rooms = new AVL();

    /**
     * Lista que contiene las habitaciones disponibles.
     */
    public static List room_availables = new List();

    /**
     * Constructor de la clase Welcome. Inicializa la interfaz de usuario y
     * configura la posición y la capacidad de redimensionamiento de la ventana.
     */
    public Welcome() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hotel_icon = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setBackground(new java.awt.Color(0, 0, 0));
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Siguiente");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, 40));

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MetroResort");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 30));

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("The best place to stay!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        hotel_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hotel.png"))); // NOI18N
        jPanel1.add(hotel_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(60, 60));
        background.setMinimumSize(new java.awt.Dimension(60, 60));
        background.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 430, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado al hacer clic en el botón "Siguiente". Lee los datos
     * desde archivos CSV y los carga en las estructuras de datos
     * correspondientes. Muestra un mensaje de confirmación cuando los datos se
     * han cargado correctamente. Redirige a la siguiente ventana de la
     * aplicación.
     *
     * @param evt El evento de acción generado al hacer clic en el botón
     * "Siguiente".
     */
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // Instancia de la clase FileCSV para leer datos desde archivos CSV
        FileCSV file = new FileCSV();

        // Lee los estados de las habitaciones desde un archivo CSV y los carga en la HashTable 'states'
        file.Read_state(states);

        // Lee las reservas de habitaciones desde un archivo CSV y las carga en el BST 'reservations'
        file.Read_bookings(reservations);

        // Lee la información de las habitaciones desde un archivo CSV y las carga en el AVL 'rooms'
        file.Read_rooms(rooms);

        // Lee el historial de ocupación de las habitaciones desde un archivo CSV y lo carga en el AVL 'rooms'
        file.Read_history(rooms);

        // Calcula las habitaciones disponibles y las almacena en la Lista 'room_availables'
        states.Availables(room_availables);
        // Marca todas las habitaciones disponibles como disponibles en la estructura de datos AVL 'rooms'
        for (int i = 0; i < room_availables.getSize(); i++) {
            int num_hab = (int) room_availables.getValor(i);
            num_hab++;
            rooms.searchByKey(num_hab).setAvailable(true);
        }

        // Muestra un mensaje de confirmación indicando que los datos se han cargado correctamente
        JOptionPane.showMessageDialog(null, "Datos Cargados.");

        // Cierra la ventana actual de bienvenida
        this.setVisible(false);

        // Crea una nueva instancia de la clase Welcome y la asigna a 'b'
        Welcome b = new Welcome();

        // Crea una instancia de la clase Menu con la ventana de bienvenida 'b' y la muestra
        Menu window1 = new Menu(b);
        window1.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel hotel_icon;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
