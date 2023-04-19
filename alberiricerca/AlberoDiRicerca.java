package alberiricerca;

import tree.LinkedTree;
import tree.Node;

public class AlberoDiRicerca extends LinkedTree<Element> {

    public Node<Element> insertOrdered(int key, String value) {

        Node<Element> auxNode = this.radice;
        if (auxNode == null) {
            this.radice = new Node<Element>(new Element(key, value));
            return this.radice;
        }

        while (auxNode != null) {
            if (key == auxNode.value.key) {
                return null;
            }
            if (key < auxNode.value.key) {
                if (auxNode.leftChild == null) {
                    return this.insertLeft(auxNode, new Element(key, value));
                }
                auxNode = auxNode.leftChild;
            }
            if (key > auxNode.value.key) {
                if (auxNode.rightChild == null) {
                    return this.insertRight(auxNode, new Element(key, value));
                }
                auxNode = auxNode.rightChild;
            }
        }
        return null;
    }

    /*
     * data una chiave restituisce l'elemento che la contiene
     * naviga l'albero dalla radice fino alle foglie, si ferma se trova l'elemento.
     * per ogni nodo incontra valuta se la chiave è maggiore, minore o uguale, se è uguale
     * retituisce l'elemento
     * 
     * Se non trova la chiave restituisce null
     */
    public Element search(int key) {
        Node<Element> auxNode = this.radice;

        while (auxNode != null) {
            if (key == auxNode.value.key) {
                return auxNode.value;
            }
            if (key < auxNode.value.key) {
                auxNode = auxNode.leftChild;
            }
            if (key > auxNode.value.key) {
                auxNode = auxNode.rightChild;
            }

        }
        return null;
    }

}
