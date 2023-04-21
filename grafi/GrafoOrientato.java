package grafi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// con lista di adiacenza
public class GrafoOrientato implements Grafo {

    ArrayList<ArrayList<Integer>> adjacencyList;

    public GrafoOrientato() {
        this.adjacencyList = new ArrayList<ArrayList<Integer>>();
    }

    @Override
    public int addNode() {
        adjacencyList.add(new ArrayList<Integer>());
        return adjacencyList.size() - 1;
    }

    // non usare edges
    @Override
    public void addEdge(int node1, int node2) {
        adjacencyList.get(node1).add(node2);
    }

    // O(E) 
    @Override
    public boolean adjacent(int node1, int node2) {
        List<Integer> nodeAdjacencyList = adjacencyList.get(node1);
        for (Integer adjNode : nodeAdjacencyList) {
            if (adjNode == node2) {
                return true;
            }
        }
        return false;
    }

    // usarli per restituire gli archi
    @Override
    public List<Edge> getEdges(int startNode) {
        List<Edge> edgeList = new LinkedList<Edge>();
        List<Integer> nodeAdjacencyList = adjacencyList.get(startNode);
        for (Integer adjNode : nodeAdjacencyList) {
            edgeList.add(new Edge(startNode, adjNode));
        }
        return edgeList;
    }

    @Override
    public String toString() {
        String str = "";
        int node = 0;
        for (ArrayList<Integer> nodeAdjacencyList : adjacencyList) {
            str += node + ": " + nodeAdjacencyList + "\n";
            node++;
        }
        return str;
    }

    public void visitaAmpiezza(int startNode) {
        System.out.println("inizio visita" + startNode);

        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visitati = new boolean[adjacencyList.size()];
        for (int i = 0; i < visitati.length; i++) {
            visitati[i] = false;
        }
        queue.add(startNode);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            visitati[current] = true;
            // queue.addAll(adjacencyList.get(current));

            ArrayList<Integer> lista = adjacencyList.get(current);
            for (Integer node : lista) {
                if (!visitati[node]) {
                    queue.add(node);
                }
            }
            System.out.println(current);
        }
        System.out.println("fine visita");

    }

}
