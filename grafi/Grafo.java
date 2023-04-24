package grafi;

import java.util.List;

public interface Grafo {

    public class Edge {
        int node1;
        int node2;

        public Edge(int node1, int node2) {
            this.node1 = node1;
            this.node2 = node2;
        }

        public int getNode1() {
            return node1;
        }

        public int getNode2() {
            return node2;
        }

        @Override
        public String toString() {
            return "(" + node1 + "->" + node2 + ")";
        }
    }

    public int addNode();

    public void addEdge(int node1, int node2);

    public boolean adjacent(int node1, int node2);

    public List<? extends Edge> getEdges(int startNode);

    public List<Integer> visitaAmpiezza(int startNode);

    public List<Integer> visitaProfondita(int startNode);

    public List<? extends Edge> getIncomingEdges(int endNode);

}
