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
/**
 * Clase que representa un nodo de un árbol AVL.
 */
public class NodeAVL {
    private int key;
    private Room room;
    private int height;
    private NodeAVL left;
    private NodeAVL right;
    /**
     * Constructor de la clase NodeAVL.
     * @param key La clave del nodo.
     * @param room La habitación asociada al nodo.
     */
    public NodeAVL(int key, Room room) {
        this.room =  room;
        this.key = key;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
    /**
     * Verifica si el nodo está lleno, es decir, tiene tanto hijo izquierdo como hijo derecho.
     * @return true si el nodo está lleno, false de lo contrario.
     */
    public boolean isFull(){
        return (getRight()!=null && getLeft()!=null);
    }
    /**
     * Verifica si el nodo es una hoja, es decir, no tiene hijos.
     * @return true si el nodo es una hoja, false de lo contrario.
     */
    public boolean isLeaf(){
        return (getRight()==null && getLeft()==null);
    }
    /**
     * Verifica si el nodo tiene un hijo izquierdo.
     * @return true si el nodo tiene un hijo izquierdo, false de lo contrario.
     */
    public boolean hasLeft(){
        return (getLeft()!=null);
    }
    /**
     * Verifica si el nodo tiene un hijo derecho.
     * @return true si el nodo tiene un hijo derecho, false de lo contrario.
     */
    public boolean hasRight(){
        return (getRight()!=null);
    }
    
    /**
     * Obtiene el hijo derecho del nodo.
     * @return El hijo derecho del nodo.
     */
    public NodeAVL getRight() {
        return right;
    }
    /**
     * Establece el hijo derecho del nodo.
     * @param right El nodo a establecer como hijo derecho.
     */
    public void setRight(NodeAVL right) {
        this.right = right;
    }
    /**
     * Obtiene el hijo izquierdo del nodo.
     * @return El hijo izquierdo del nodo.
     */
    public NodeAVL getLeft() {
        return left;
    }
    /**
     * Establece el hijo izquierdo del nodo.
     * @param left El nodo a establecer como hijo izquierdo.
     */
    public void setLeft(NodeAVL left) {
        this.left = left;
    }
    /**
     * Obtiene la clave del nodo.
     * @return La clave del nodo.
     */
    public int getKey() {
        return key;
    }
    /**
     * Establece la clave del nodo.
     * @param key La clave a establecer.
     */
    public void setKey(int key) {
        this.key = key;
    }
    /**
     * Obtiene la altura del nodo.
     * @return La altura del nodo.
     */
    public int getHeight() {
        return height;
    }
    /**
     * Establece la altura del nodo.
     * @param height La altura a establecer.
     */
    public void setHeight(int height) {
        this.height = height;
    }
     /**
     * Obtiene la habitación asociada al nodo.
     * @return La habitación asociada al nodo.
     */
    public Room getRoom() {
        return room;
    }
    /**
     * Establece la habitación asociada al nodo.
     * @param room La habitación a establecer.
     */
    public void setRoom(Room room) {
        this.room = room;
    }
    
    
}
