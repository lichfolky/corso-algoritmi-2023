package browser;

import tree.LinkedTree;
import tree.Node;

public class Browser {
    public static void main(String[] args) {
        /*         SimpleTree albero = new SimpleTree(10);
        int indicePadre = albero.insert(-1, "mattia.com");
        albero.insert(indicePadre, "about-me.html");
        int padreProgetti = albero.insert(indicePadre, "projects");
        albero.insert(padreProgetti, "browser.html");
        albero.insert(padreProgetti, "formulauno.html");
        System.out.println(albero);
        System.out.println(Arrays.toString(albero.padri));
        System.out.println("---");
        albero.visitaProfondita(); */

        LinkedTree<String> albero = new LinkedTree<String>();
        Node<String> radice = albero.insert(null, "mattia.com");
        albero.insert(radice, "about-me.html");
        Node<String> nodoProjects = albero.insert(radice, "projects");
        albero.insert(nodoProjects, "browser.html");
        albero.insert(nodoProjects, "formulauno.html");

        System.out.println(albero);
        System.out.println("---");
        System.out.println(albero.searchProfondita("mattia.com"));
        System.out.println("\nAmpiezza:" + albero.visitaAmpiezza());
        System.out.println("\nProfondità:" + albero.visitaProfondita());
        System.out.println("\nRadice: \n" + albero.prettyPrint());
    }
}
