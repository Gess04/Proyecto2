/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import Classes.*;
import EDD.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 58414
 */
public class Functions {
    public void loadHashTable(List list, Reservation reservation, HashTable table) {
        NodeList aux = list.getPfirst();
        boolean found = false;
        while (aux != null && found != true) {
            if (aux.gettInfo().equals(reservation)) {
                found = true;
                break;
            }else{
                aux = aux.getpNext();
            }
        }
        
        if (found == false) {
            JOptionPane.showMessageDialog(null, "No hay reservacion");
        }else{
            
        }
    }
    

    public String searchById(List list, int id) {
        NodeList aux = list.getPfirst();
        for (int i = 0; i < list.getSize(); i++) {
            Reservation reserv = (Reservation) list.getValor(i);
            Client client = reserv.getClient();
            if (client.getId() == id) {
                return reserv.toString();
            }
            aux.getpNext();
        }
        return null;
    }
    
    public Reservation reserv(List list, int id) {
        NodeList aux = list.getPfirst();
        for (int i = 0; i < list.getSize(); i++) {
            Reservation reserv = (Reservation) list.getValor(i);
            Client client = reserv.getClient();
            if (client.getId() == id) {
                return reserv;
            }
            aux.getpNext();
        }
        return null;
    }
    
    public int indexReservation(List list, int id) {
        NodeList aux = list.getPfirst();
        for (int i = 0; i < list.getSize(); i++) {
            Reservation reserv = (Reservation) list.getValor(i);
            Client client = reserv.getClient();
            if (client.getId() == id) {
                return i;
            }
            aux.getpNext();
        }
        return -1;
    }
    
    public void checkIn(List bookings, int id, List rooms, HashTable table) {
        if (searchById(bookings, id) != null) {
            int count = 0;
            Reservation reserv = reserv(bookings, id);
            List availableRooms = new List();
            table.Availables(availableRooms);
            for (int i = 0; i < rooms.getSize(); i++) {
                int roomNumber = (int) availableRooms.getValor(i);
                Room room = (Room) rooms.getValor(roomNumber-1);
                
                if (room.getRoomType().equalsIgnoreCase(reserv.getRoomType())) {
                    Status status = new Status(room.getRoomNum(), reserv.getClient(), reserv.getCheckIn());
                    table.insertState(status);
                    bookings.deleteByReference(indexReservation(bookings, id));
                    count++;
                    break;
                }
            }
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "El cliente ha llegado");
            }else{
                JOptionPane.showMessageDialog(null, "No hay habitación dsiponible");
            }
        }else{
        JOptionPane.showMessageDialog(null, "El cliente no tiene reserva");
        }
    }

    public void load_hashtable(List list1, Reservation reserv, HashTable table){
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
