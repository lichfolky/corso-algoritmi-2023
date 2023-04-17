package browser;

import tree.SimpleTree;

public class Browser {
    public static void main(String[] args) {
        SimpleTree albero = new SimpleTree(10);
        int indicePadre = albero.insert(-1, "mattia.com");
        albero.insert(indicePadre, "about-me.html");
        int padreProgetti = albero.insert(indicePadre, "projects");
        albero.insert(padreProgetti, "browser.html");
        albero.insert(padreProgetti, "formulauno.html");
        System.out.println(albero);
    }
}
