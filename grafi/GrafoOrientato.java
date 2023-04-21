package grafi;

import java.util.ArrayList;
import java.util.List;

// con lista di adiacenza
public class GrafoOrientato implements Grafo {

    ArrayList<ArrayList<Integer>> adjacencyList;

    public GrafoOrientato() {
        this.adjacencyList = new ArrayList<ArrayList<Integer>>();
    }

    @Override
    public int addNode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNode'");
    }

    // non usare edges
    @Override
    public void addEdge(int node1, int node2) {
    }

    @Override
    public boolean adjacent(int node1, int node2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adjacent'");
    }

    // usarli per restituire gli archi
    @Override
    public List<Edge> getEdges(int startNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEdges'");
    }

}
