package grafi;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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

    public default List<Integer> visitaAmpiezza(int startNode) {
        Queue<Integer> queue = new LinkedList<Integer>();
        LinkedList<Integer> visita = new LinkedList<Integer>();
        boolean[] visitati = new boolean[numNodi()];
        for (int i = 0; i < visitati.length; i++) {
            visitati[i] = false;
        }
        queue.add(startNode);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            visitati[current] = true;
            // queue.addAll(adjacencyList.get(current));
            visita.add(current);

            List<? extends Edge> lista = getEdges(current);
            for (Edge edge : lista) {
                if (!visitati[edge.node2]) {
                    queue.add(edge.node2);
                }
            }
            /* 
            ArrayList<Integer> lista = adjacencyList.get(current);
            for (Integer node : lista) {
                if (!visitati[node]) {
                    queue.add(node);
                }
            }*/
        }
        return visita;
    }

    public default List<Integer> visitaProfondita(int startNode) {
        LinkedList<Integer> visita = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] visited = new boolean[numNodi()];
        stack.push(startNode);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            visita.add(current);
            visited[current] = true;

            List<? extends Edge> lista = getEdges(current);
            for (Edge edge : lista) {
                if (!visited[edge.node2]) {
                    stack.push(edge.node2);
                }
            }
        }
        return visita;
    }

    public List<? extends Edge> getIncomingEdges(int endNode);

    public int numNodi();

}
