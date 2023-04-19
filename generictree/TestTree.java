package generictree;

import java.util.LinkedList;

public class TestTree {
    public static void main(String[] args) {
        GenericTree<String> papeAlbero = new GenericTree<String>();
        GenericTree<String>.Node<String> radice = papeAlbero.insert(null, "Paperone");
        GenericTree<String>.Node<String> aux = papeAlbero.insert(radice, "Paperino");
        papeAlbero.insert(aux, "Qui");
        papeAlbero.insert(aux, "Quo");
        papeAlbero.insert(aux, "Qua");
        papeAlbero.insert(radice, "Paperoga");
        papeAlbero.insert(radice, "Gastone");
        LinkedList<String> lista = papeAlbero.visitaAmpiezza();
        System.out.println(lista);
        System.out.println(papeAlbero.prettyPrint());

        GenericTree<String> topoAlbero = new GenericTree<String>();
        GenericTree<String>.Node<String> topoRadice = topoAlbero.insert(null, "Topolino");
        topoAlbero.insert(topoRadice, "Tip");
        topoAlbero.insert(topoRadice, "Tap");

        papeAlbero.insert(radice, topoAlbero);

        System.out.println(papeAlbero.prettyPrint());

    }
}
