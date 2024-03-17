/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Gabriel Flores
 */
public class NodeList {
    private Object tInfo;
    private NodeList  pNext;

    public NodeList() {
        this.tInfo = null;
        this.pNext = null;
    }
    /**
     * Creacion del constructor de la clase 'Node'
     * @param tInfo
     *      Indica el atributo que se le esta pasando al Nodo.
     * @param pNext 
     *      Indica el apuntador hacia el siguiente Nodo.
     */
    
    public NodeList(Object tInfo, NodeList pNext) {
        this.tInfo = tInfo;
        this.pNext = pNext;
    }

    public NodeList(Object tInfo) {
        this.tInfo = tInfo;
        this.pNext = null;
    }
    public Object gettInfo() {
        return tInfo;
    }

    public void settInfo(Object tInfo) {
        this.tInfo = tInfo;
    }

    public NodeList getpNext() {
        return pNext;
    }

    public void setpNext(NodeList pNext) {
        this.pNext = pNext;
    }

    @Override
    public String toString() {
        return "Node{" + "tInfo=" + tInfo + ", pNext=" + pNext + '}';
    }
}
