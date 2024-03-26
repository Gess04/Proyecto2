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
    /**
     * Constructor de la clase HashTable.
     * Inicializa el tamaño de la tabla y crea un arreglo de estado con ese tamaño.
     */
    public HashTable() {
        this.size = 300;
        this.status = new Status[size];
    }
    /**
     * Obtiene el tamaño de la tabla de dispersión.
     * @return El tamaño de la tabla de dispersión.
     */
    public int getSize() {
        return size;
    }
    /**
     * Establece el tamaño de la tabla de dispersión.
     * @param size El tamaño a establecer.
     */
    public void setSize(int size) {
        this.size = size;
    }
    /**
     * Obtiene el arreglo de estado de la tabla de dispersión.
     * @return El arreglo de estado de la tabla de dispersión.
     */
    public Status[] getStatus() {
        return status;
    }

     /**
     * Establece el arreglo de estado de la tabla de dispersión.
     * @param status El arreglo de estado a establecer.
     */
    public void setStatus(Status[] status) {
        this.status = status;
    }
    /**
     * Inicializa la tabla de dispersión, asignando valores nulos a cada celda del arreglo de estado.
     */
    public void initTable(){
        setStatus(new Status[getSize()]);
        for (int i = 0; i < size; i++) {
            getStatus()[i] = null;
        }
    }
    /**
     * Inserta un estado en la tabla de dispersión si no existe ya.
     * @param status El estado a insertar.
     * @return El índice donde se insertó el estado, o -1 si ya existe en la tabla.
     */
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
    /**
     * Busca un estado en la tabla de dispersión basado en el cliente asociado.
     * @param client El cliente para el que se busca el estado.
     * @return El estado encontrado, o null si no se encuentra.
     */
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
    /**
     * Elimina un estado de la tabla de dispersión.
     * @param status El estado a eliminar.
     * @return true si se eliminó correctamente, false si no se encontró el estado.
     */
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
    /**
     * Verifica si un estado ya existe en la tabla de dispersión.
     * @param status El estado a verificar.
     * @return true si el estado ya existe, false de lo contrario.
     */
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
    /**
     * Obtiene el índice de un estado en la tabla de dispersión.
     * @param status El estado para el que se busca el índice.
     * @return El índice del estado, o -1 si no se encuentra en la tabla.
     */
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
    /**
     * Obtiene el índice de un cliente en la tabla de dispersión.
     * @param client El cliente para el que se busca el índice.
     * @return El índice del cliente, o -1 si no se encuentra en la tabla.
     */
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
     /**
     * Llena una lista con las habitaciones disponibles en la tabla de dispersión.
     * @param room_availables La lista donde se agregan las habitaciones disponibles.
     */
    public void Availables(List room_availables){
        for (int i = 0; i < status.length; i++) {
            if (status[i] == null){
                
                room_availables.addEnd(i);
            }
        }
    }
}