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
public class BST {

    private NodeBST root;
    /**
     * Constructor de la clase BST. Inicializa la raíz como nula.
     */
    public BST() {
        this.root = null;
    }
    /**
     * Constructor de la clase BST que inicializa el árbol con un nodo raíz dado.
     * @param root El nodo raíz del árbol binario de búsqueda.
     */
    public BST(NodeBST root) {
        this.root = root;
    }
    /**
     * Obtiene la raíz del árbol binario de búsqueda.
     * @return El nodo raíz del árbol binario de búsqueda.
     */
    public NodeBST getRoot() {
        return root;
    }
    /**
     * Establece el nodo raíz del árbol binario de búsqueda.
     * @param root El nodo que se establecerá como raíz del árbol.
     */
    public void setRoot(NodeBST root) {
        this.root = root;
    }
    /**
     * Verifica si el árbol binario de búsqueda está vacío.
     * @return true si el árbol está vacío, false de lo contrario.
     */
    public boolean isEmpty() {
        return this.getRoot() == null;
    }
    /**
     * Vacía el árbol binario de búsqueda, estableciendo la raíz como nula.
     */
    public void empty() {
        this.setRoot(null);
    }
    /**
     * Inserta un nuevo nodo con una reserva en el árbol binario de búsqueda.
     * @param root El nodo raíz desde el cual se inicia la inserción.
     * @param reservation La reserva a insertar en el árbol.
     */
    public void insertNodo(NodeBST root, Reservation reservation) {
        NodeBST node = new NodeBST();
        node.setReservation(reservation);
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (reservation.getClient().getId() <= root.getReservation().getClient().getId()) {
                if (root.getLeft() == null) {
                    root.setLeft(node);
                    node.setFather(root);
                } else {
                    insertNodo(root.getLeft(), reservation);
                }
            } else {
                if (root.getRight() == null) {
                    root.setRight(node);
                    node.setFather(root);
                } else {
                    insertNodo(root.getRight(), reservation);
                }
            }
        }
    }
    /**
     * Busca un nodo en el árbol binario de búsqueda según el ID del cliente.
     * @param id El ID del cliente a buscar.
     * @param root El nodo raíz desde el cual se inicia la búsqueda.
     * @return El nodo encontrado, o null si no se encuentra.
     */
    public NodeBST searchNode(int id, NodeBST root) {
        if (isEmpty()) {
            return null;
        } else {
            if (root.getReservation().getClient().getId() == id) {
                return root;
            } else {
                if (id < root.getReservation().getClient().getId()) {
                    return searchNode(id, root.getLeft());
                } else {
                    return searchNode(id, root.getLeft());
                }
            }
        }
    }

    public NodeBST searchNode2(NodeBST nodoActual, int num) {
        if (nodoActual == null || nodoActual.getReservation().getClient().getId() == num) {
            return nodoActual;
        }
        if (num < nodoActual.getReservation().getClient().getId()) {
            return searchNode2(nodoActual.getLeft(), num);
        } else {
            return searchNode2(nodoActual.getRight(), num);
        }
    }
    /**
     * Realiza un recorrido en preorden del árbol binario de búsqueda e imprime las reservas.
     * @param root El nodo raíz desde el cual se inicia el recorrido.
     */
    public void preOrder(NodeBST root) {
        if (root != null) {
            System.out.println("{ " + root.getReservation().toString() + " }");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    /**
     * Realiza un recorrido en preorden del árbol binario de búsqueda y devuelve una cadena con las reservas.
     * @param root El nodo raíz desde el cual se inicia el recorrido.
     * @param chain La cadena acumulada durante el recorrido en preorden.
     * @return La cadena que contiene las reservas en preorden.
     */
    public String preOrder2(NodeBST root, String chain) {
        if (root != null) {
            chain = chain + root.getReservation().toString() + ",";
            chain = preOrder2(root.getLeft(), chain);
            chain = preOrder2(root.getRight(), chain);
        }

        return chain;
    }
    /**
     * Llena una lista con las reservas del árbol binario de búsqueda.
     * @param root El nodo raíz desde el cual se inicia el recorrido.
     * @param list La lista en la que se agregan las reservas.
     */
    public void List(NodeBST root, List list) {
        list.addEnd(root.getReservation());

        if (root.getLeft() != null) {
            List(root.getLeft(), list);
        }
        if (root.getRight() != null) {
            List(root.getRight(), list);
        }
    }
    /**
     * Realiza un recorrido en orden del árbol binario de búsqueda e imprime las reservas.
     * @param root El nodo raíz desde el cual se inicia el recorrido.
     */
    public void inOrder(NodeBST root) {
        if (root != null) {
            preOrder(root.getLeft());
            System.out.println("{ " + root.getReservation().toString() + " }");
            preOrder(root.getRight());
        }
    }
    /**
     * Realiza un recorrido en postorden del árbol binario de búsqueda e imprime las reservas.
     * @param root El nodo raíz desde el cual se inicia el recorrido.
     */
    public void postOrder(NodeBST root) {
        if (root != null) {
            preOrder(root.getLeft());
            preOrder(root.getRight());
            System.out.println("{ " + root.getReservation().toString() + " }");
        }
    }
    /**
     * Elimina un nodo del árbol binario de búsqueda según el ID del cliente.
     * @param clientId El ID del cliente cuya reserva se eliminará.
     */
    public void deleteByClientId(int clientId) {
        this.root = deleteRecursively(root, clientId);
    }

    private NodeBST deleteRecursively(NodeBST current, int clientId) {
        if (current == null) {
            return null;
        }

        if (current.getReservation().getClient().getId() == clientId) {
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            
            if (current.getRight() == null) {
                return current.getLeft();
            }
            
            if (current.getLeft() == null) {
                return current.getRight();
            }

            int smallestValueId = findSmallestClientId(current.getRight());
            current.getReservation().getClient().setId(smallestValueId);
            current.setRight(deleteRecursively(current.getRight(), smallestValueId));
            return current;
        } 
        if (clientId < current.getReservation().getClient().getId()) {
            current.setLeft(deleteRecursively(current.getLeft(), clientId));
        } else {
            current.setRight(deleteRecursively(current.getRight(), clientId));
        }
        return current;
    }

    private int findSmallestClientId(NodeBST root) {
        return root.getLeft() == null ? root.getReservation().getClient().getId() : findSmallestClientId(root.getLeft());
    }

}
