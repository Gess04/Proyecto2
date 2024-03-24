/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Classes.*;

/**
 *
 * @author Gabriel Flores
 */
public class HashTable {
    private int size;
    private Status[] status;

    public HashTable() {
        this.size = 300;
        this.status = new Status[size];
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }

    public Status[] getStatus() {
        return status;
    }

    
    public void setStatus(Status[] status) {
        this.status = status;
    }
    
    public void initTable(){
        setStatus(new Status[getSize()]);
        for (int i = 0; i < size; i++) {
            getStatus()[i] = null;
        }
    }
    
    public int insertStatus(Status status){
        if (!isInHash(status)) {
            int index = status.getNum_hab()-1;
            if(getStatus()[index] == null){
                getStatus()[index] = status;
                return index;
            }
            
            return 0;
            
        } else{
        return -1;
        }
    }
    
    public Status isInHashStatus(Client client){
        for (int i = 0; i < this.getStatus().length; i++) {
            if(getStatus()[i] != null){
                if(getStatus()[i].getClient().getName().equalsIgnoreCase(client.getName())&& getStatus()[i].getClient().getLastname().equalsIgnoreCase(client.getLastname())){
                    return getStatus()[i];
                }
            }
        }
        return null;
    }
    
    public boolean deleteStatus(Status status){
        int index = isInHashIndex(status);
        if(index != -1){
            getStatus()[index] = null;
            System.out.println("Estado eliminado exitosamente");
            return true;
        }else{
            System.out.println("Estado no encontrado");
        }
        return false;
    }
    
    public boolean isInHash(Status status){
        boolean aux = false;
        for (int i = 0; i < this.getStatus().length; i++) {
            if (getStatus()[i] != null){
                if (getStatus()[i].compareState(status)){
                    aux = true;
                }
            }
        }
        return aux;
    }
    
    public int isInHashIndex(Status status){
        for (int i = 0; i < this.getStatus().length; i++) {
            if (getStatus()[i] != null){
                if (getStatus()[i].compareState(status)){
                    return i;
                }
            }
        }
        
        return -1;
    }
    
    public int isInHashIndexN(Client client){
        for (int i = 0; i < this.getStatus().length; i++) {
            if (getStatus()[i] != null){
                if (getStatus()[i].getClient().getName().equalsIgnoreCase(client.getName()) && getStatus()[i].getClient().getLastname().equalsIgnoreCase(client.getLastname())){
                    return i;
                }
            }
        }
        
        return -1;
    }
    
    public void Availables(List room_availables){
        for (int i = 0; i < status.length; i++) {
            if (status[i] == null){
                
                room_availables.addEnd(i);
            }
        }
    }
}