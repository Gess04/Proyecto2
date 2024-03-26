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
public class NodeBST {
    
    private Reservation reservation;
    private NodeBST left;
    private NodeBST right;
    private NodeBST father;
    /**
     * Constructor de la clase NodeBST.
     * @param reservation La reserva asociada al nodo.
     * @param left El hijo izquierdo del nodo.
     * @param right El hijo derecho del nodo.
     * @param father El padre del nodo.
     */
    public NodeBST(Reservation reservation , NodeBST left, NodeBST right, NodeBST father) {
        this.reservation = reservation;
        this.left = left;
        this.right = right;
        this.father = father;
    }
    /**
     * Constructor de la clase NodeBST.
     * Crea un nodo con valores nulos para la reserva y los hijos.
     */
    public NodeBST() {
        this.reservation = null;
        this.left = null;
        this.right = null;
        this.father = null;
    }
    /**
     * Constructor de la clase NodeBST.
     * Crea un nodo con una reserva y valores nulos para los hijos.
     * @param reservation La reserva asociada al nodo.
     */
    public NodeBST(Reservation reservation) {
        this.reservation = reservation;
        this.left = null;
        this.right = null;
        this.father = null;
    }
    /**
     * Obtiene la reserva asociada al nodo.
     * @return La reserva asociada al nodo.
     */
    public Reservation getReservation() {
        return reservation;
    }
    /**
     * Establece la reserva asociada al nodo.
     * @param reservation La reserva a establecer.
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    /**
     * Obtiene el hijo izquierdo del nodo.
     * @return El hijo izquierdo del nodo.
     */
    public NodeBST getLeft() {
        return left;
    }
    /**
     * Establece el hijo izquierdo del nodo.
     * @param left El nodo a establecer como hijo izquierdo.
     */
    public void setLeft(NodeBST left) {
        this.left = left;
    }
    /**
     * Obtiene el hijo derecho del nodo.
     * @return El hijo derecho del nodo.
     */
    public NodeBST getRight() {
        return right;
    }
    /**
     * Establece el hijo derecho del nodo.
     * @param right El nodo a establecer como hijo derecho.
     */
    public void setRight(NodeBST right) {
        this.right = right;
    }
    /**
     * Obtiene el padre del nodo.
     * @return El padre del nodo.
     */
    public NodeBST getFather() {
        return father;
    }
    /**
     * Establece el padre del nodo.
     * @param father El nodo a establecer como padre.
     */
    public void setFather(NodeBST father) {
        this.father = father;
    }
}
