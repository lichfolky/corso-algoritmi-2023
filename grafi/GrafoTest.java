package grafi;

public class GrafoTest {
    public static void main(String[] args) {
        GrafoOrientato grafo = new GrafoOrientato();
        for (int i = 0; i < 5; i++) {
            grafo.addNode();
        }
        grafo.addEdge(0, 2);
        grafo.addEdge(1, 2);
        grafo.addEdge(2, 3);
        grafo.addEdge(2, 4);
        grafo.addEdge(3, 1);

        System.out.println(grafo);
        grafo.visitaAmpiezza(0);
        grafo.visitaAmpiezza(4);
    }
}
