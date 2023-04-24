package grafi;

import java.util.ArrayList;
import java.util.List;

// matrice di adiacenza
public class GrafoNonOrientatoPesato implements Grafo {

    public ArrayList<ArrayList<Integer>> matriceAdiacenza;

    public class OrientedWeightedEdge extends Edge {
        int weight;

        public OrientedWeightedEdge(int node1, int node2, int weight) {
            super(node1, node2);
            this.weight = weight;
        }
    }

    public GrafoNonOrientatoPesato() {
        this.matriceAdiacenza = new ArrayList<ArrayList<Integer>>();
    }

    @Override
    public int addNode() {
        int nodo = this.matriceAdiacenza.size();
        for (int i = 0; i < nodo; i++) {
            this.matriceAdiacenza.get(i).add(0);
        }
        ArrayList<Integer> listaAdiacenzaNodo = new ArrayList<Integer>(nodo);
        for (int i = 0; i < listaAdiacenzaNodo.size(); i++) {
            listaAdiacenzaNodo.set(i, 0);
        }
        return nodo;
    }

    @Override
    public void addEdge(int node1, int node2) {
        addWeightedEdge(node1, node2, 1);
    }

    public void addWeightedEdge(int node1, int node2, int weight) {
        matriceAdiacenza.get(node1).set(node2, weight);
    }

    @Override
    public boolean adjacent(int node1, int node2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adjacent'");
    }

    @Override
    public List<OrientedWeightedEdge> getEdges(int startNode) {
        return null;
    }

    @Override
    public List<OrientedWeightedEdge> getIncomingEdges(int endNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncomingEdges'");
    }

    @Override
    public List<Integer> visitaAmpiezza(int startNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visitaAmpiezza'");
    }

    @Override
    public List<Integer> visitaProfondita(int startNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visitaProfondita'");
    }

}
