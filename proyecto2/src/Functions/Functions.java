/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import EDD.*;
import Classes.*;
import java.util.Hashtable;
import javax.swing.JOptionPane;
/**
 *
 * @author 58414
 */
public class Functions {
    
    public void load_hashtable(List list1, Reservation reserv, Hashtable table){
        NodeList aux = list1.getPfirst();
        boolean find = false;
        while(aux != null && find != true){
            if(aux.gettInfo().equals(reserv)){
                find = true;
                break;
            }else{
                aux = aux.getpNext();
            }
        }
        if(find == false){
            JOptionPane.showMessageDialog(null, "No hay reservacion");
        }else{
            JOptionPane.showMessageDialog(null, "Cargado");
        }
    }
    public String SearchByID(List list, int id2){
        NodeList aux = list.getPfirst();
        for (int i = 0; i < list.getSize(); i++) {
            Reservation reserve1 = (Reservation) list.getValor(i);
            Client client1 = reserve1.getClient();
            if(client1.getId() == id2){
                return reserve1.toString();
            }
            aux.getpNext();
        }
        return null;
    }
}
