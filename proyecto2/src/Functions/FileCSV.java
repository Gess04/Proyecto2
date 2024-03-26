/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author Gabriel Flores
 */
import EDD.*;
import Classes.*;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * Clase que proporciona métodos para leer datos desde archivos CSV y almacenarlos en estructuras de datos.
 */
public class FileCSV {
    private Helpers help = new Helpers();
    
     /**
     * Lee los datos de reservas desde un archivo CSV y los inserta en un árbol binario de búsqueda.
     * @param tree_reservation El árbol binario de búsqueda donde se insertarán las reservas.
     */
    public void Read_bookings(BST tree_reservation){ 
        String line;
        String expresion_txt = "";
        String path = "test//bookings.csv";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)){
                    String[] expresion_split = expresion_txt.split("\n");
                    for(int i =0;i < expresion_split.length;i++){
                        String[] info = expresion_split[i].split(",");
                        if(help.ValidateID(info[0]) != -1 && help.Validate_RoomType(info[5]) != null && help.ValidateEmail(info[3]) != null && help.Validatetelf(info[6]) != null){
                            int id = help.ValidateID(info[0]);
                            String name = info[1];
                            String last_name = info[2];
                            String email = help.ValidateEmail(info[3]);
                            String sex = info[4];
                            String cellphone_number = help.Validatetelf(info[6]);
                            
                            Client client = new Client(name,last_name,email,sex,id,cellphone_number);
                            
                            String roomType = help.Validate_RoomType(info[5]);
                            String departure_date = info[7];
                            String arrival_date = info[8];
                            
                            
                            Reservation booking = new Reservation(client, roomType, departure_date, arrival_date);
                            
                            
                            tree_reservation.insertNodo(tree_reservation.getRoot(), booking);
                        }else{
                            JOptionPane.showMessageDialog(null, "Existe un error en alguno de los datos");
                            break;
                        }   
                    }
                }
                br.close();
            }  
        } catch (HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }

    }
    /**
     * Lee los datos de habitaciones desde un archivo CSV y los inserta en un árbol AVL.
     * @param rooms El árbol AVL donde se insertarán las habitaciones.
     */
    public void Read_rooms(AVL rooms){
        String line;
        String expresion_txt = "";
        String path = "test//rooms.csv";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)){
                    String[] expresion_split = expresion_txt.split("\n");
                    for(int i =0;i < expresion_split.length;i++){
                        String[] info = expresion_split[i].split(",");
                        if(help.ValidateNumbers(info[0]) != -1 && help.ValidateNumbers(info[2]) != -1 && help.Validate_RoomType(info[1]) != null){
                            int num_room = help.ValidateNumbers(info[0]);
                            String roomType = help.Validate_RoomType(info[1]);
                            int floor_number = help.ValidateNumbers(info[2]);
                            
                            Room space = new Room(num_room, roomType, floor_number);
                            
                            rooms.insert(num_room, space);
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "Existe un error en alguno de los datos");
                            break;
                        }   
                    }
                }
                br.close();
            }  
        } catch (HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
    }
    /**
     * Lee los datos de estado de las habitaciones desde un archivo CSV y los inserta en una tabla hash.
     * @param table La tabla hash donde se insertará el estado de las habitaciones.
     */
    public void Read_state(HashTable table){
        String line;
        String expresion_txt = "";
        String path = "test//state2.csv";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)){
                    String[] expresion_split = expresion_txt.split("\n");
                    for(int i =0;i < expresion_split.length;i++){
                        String[] info = expresion_split[i].split(",");
                        
                        if(!info[0].equalsIgnoreCase("")){
                            
                            if(help.ValidateNumbers(info[0]) != -1 &&  help.ValidateEmail(info[3]) != null && help.Validatetelf(info[5]) != null){
                                int num_room = help.ValidateNumbers(info[0]);
                                String name = info[1];
                              
                                String last_name = info[2];
                                String email = help.ValidateEmail(info[3]);
                                String sex = info[4];
                                String cellphone_number = help.Validatetelf(info[5]);
                                Client client = new Client(name,last_name,email,sex,cellphone_number);
                                
                                String arrival_date = info[6];
                                
                                Status state = new Status(num_room, client,arrival_date);
                                
                                table.insertStatus(state);  
                            }else{
                                //JOptionPane.showMessageDialog(null, "Hay un error en algun dato");
                                break;
                            }
                    }    
                    }
                }
                br.close();
            }  
        } catch (HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
    }
    /**
     * Lee el historial de clientes desde un archivo CSV y lo inserta en la lista de historiales de las habitaciones.
     * @param rooms El árbol AVL que contiene las habitaciones donde se insertará el historial.
     */
    public void Read_history(AVL rooms){ 
        String line;
        String expresion_txt = "";
        String path = "test//history.csv";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)){
                    String[] expresion_split = expresion_txt.split("\n");
                    for(int i =0;i < expresion_split.length;i++){
                        String[] info = expresion_split[i].split(",");
                        //if(help.ValidateID(info[0]) != -1 && help.ValidateEmail(info[3]) != null && help.ValidateNumbers(info[6]) != -1){
                            int id = help.ValidateID(info[0]);
                            String name = info[1];
                            String last_name = info[2];
                            String email = help.ValidateEmail(info[3]);
                            String sex = info[4];
                            String date = info[5];
                            int num_hab = help.ValidateNumbers(info[6]);
                            
                            Client client = new Client(name,last_name,email,sex,id);
                            
                            History history =  new History(client, date);
                            
                            rooms.searchByKey(num_hab).getHistory().addEnd(history);
                        //}else{
                            //JOptionPane.showMessageDialog(null, "Existe un error en alguno de los datos");
                            //break;
                        //}   
                    }
                }
                br.close();
            }  
        } catch (HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }

    }
}
