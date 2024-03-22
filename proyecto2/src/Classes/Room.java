/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import EDD.List;

/**
 *
 * @author tomasaraujo
 */
public class Room {
    private int roomNum;
    private String roomType;
    private int floor;
    private boolean dispo;
    private List historial;

    public Room(int roomNum, String roomType, int floor) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.floor = floor;
        this.dispo = true;
        this.historial = new List();
    }

    /**
     * @return the roomNum
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * @param roomNum the roomNum to set
     */
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * @return the roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * @return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }
    
      public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public List getHistarial() {
        return historial;
    }

    public void setHistarial(List historial) {
        this.historial = historial;
    }
    
    
    @Override
    public String toString() {
        return "\nNumero de habitacion: " + roomNum + "\nTipo de habitación: " + roomType + "\nPiso: " + floor ;
    }
    
    public String mostrar_historial(){
        if(!historial.isEmpty()){
            return historial.transform();
        }
        return null;
    }
    
}

