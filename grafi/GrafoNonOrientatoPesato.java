package grafi;

import java.util.List;

// matrice di adiacenza
public class GrafoNonOrientatoPesato implements Grafo {

    public class OrientedWeightedEdge extends Edge {
        int weight;

        public OrientedWeightedEdge(int node1, int node2, int weight) {
            super(node1, node2);
            this.weight = weight;
        }
    }

    @Override
    public int addNode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNode'");
    }

    @Override
    public void addEdge(int node1, int node2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addEdge'");
    }

    @Override
    public boolean adjacent(int node1, int node2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adjacent'");
    }

    @Override
    public List<Edge> getEdges(int startNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEdges'");
    }

}
