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
public class AVL {
    
    private NodeAVL root;

    public AVL() {
        root = null;
    }

    public NodeAVL getRaiz() {
        return root;
    }

 
    public void insert(int key, Room room) {
        root = insert(root, key, room);
    }

    private NodeAVL insert(NodeAVL node, int key, Room room) {
        if (node == null) {
            return new NodeAVL(key, room);
        }

        if (key < node.getKey()) {
            node.setLeft(insert(node.getLeft(), key, room));
        } else if (key > node.getKey()) {
            node.setRight(insert(node.getRight(), key, room));
        } else {
            return node;
        }
        node.setHeight(1 + Math.max(height(node.getLeft()), height(node.getRight())));
        return balance(node, key);
    }

    private int height(NodeAVL N) {
        if (N == null)
            return 0;
        return N.getHeight();
    }

    private NodeAVL balance(NodeAVL node, int key) {
        int balance = getBalance(node);
        if (balance > 1 && key < node.getLeft().getKey()) {
            return rotateRight(node);
        }
        if (balance < -1 && key > node.getRight().getKey()) {
            return rotateLeft(node);
        }
        if (balance > 1 && key > node.getRight().getKey()) {
            node.setLeft(rotateLeft(node.getLeft()));
            return rotateRight(node);
        }
        if (balance < -1 && key < node.getRight().getKey()) {
            node.setRight(rotateRight(node.getRight()));
            return rotateLeft(node);
        }
        return node;
    }
    
    private int getBalance(NodeAVL N) {
        if (N == null)
            return 0;
        return height(N.getLeft()) - height(N.getRight());
    }
    
    private NodeAVL rotateRight(NodeAVL y) {
        NodeAVL x = y.getLeft();
        NodeAVL T2 = x.getRight();
        x.setRight(y);
        y.setLeft(T2);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
        return x;
    }
    
    private NodeAVL rotateLeft(NodeAVL x) {
        NodeAVL y = x.getRight();
        NodeAVL T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

   
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
        return y;
    }
    
    public void inOrden() {
        inOrder(root);
    }

    private void inOrder(NodeAVL node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getKey()+ " - " + node.getRoom().toString()); 
            inOrder(node.getRight());
        }
    }
    
    public Room searchByKey(int key) {
        NodeAVL actual = root;

        while (actual != null) {
            if (key < actual.getKey()) {               
                actual = actual.getLeft();
            } else if (key > actual.getKey()) {
                actual = actual.getRight();
            } else {
                return actual.getRoom();
            }
        }
        return null;
    }
}
