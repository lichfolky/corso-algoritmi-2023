package generictree;

import java.util.LinkedList;

public class TestTree {
    public static void main(String[] args) {
        GenericTree<String> albero = new GenericTree<String>();
        GenericTree<String>.Node<String> radice = albero.insert(null, "Paperone");
        GenericTree<String>.Node<String> aux = albero.insert(radice, "Paperino");
        albero.insert(aux, "Qui");
        albero.insert(aux, "Quo");
        albero.insert(aux, "Qua");
        albero.insert(radice, "Paperoga");
        albero.insert(radice, "Gastone");
        LinkedList<String> lista = albero.visitaAmpiezza();
        System.out.println(lista);
        System.out.println(albero.prettyPrint());

    }
}
