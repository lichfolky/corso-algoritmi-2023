package grafi;

public class GrafoTest {
    public static void main(String[] args) {
        Grafo grafo = new GrafoNonOrientatoPesato();
        for (int i = 0; i < 5; i++) {
            grafo.addNode();
        }
        grafo.addEdge(0, 2);
        grafo.addEdge(1, 2);
        grafo.addEdge(2, 4);
        grafo.addEdge(2, 3);
        grafo.addEdge(3, 1);

        System.out.println(grafo);
        System.out.println(grafo.visitaAmpiezza(0));
        System.out.println(grafo.visitaAmpiezza(4));
        System.out.println(grafo.getIncomingEdges(2));
        System.out.println(grafo.visitaProfondita(0));
        System.out.println(grafo.visitaProfondita(4));
    }
}
