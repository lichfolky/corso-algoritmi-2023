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
        ArrayList<Integer> listaAdiacenzaNodo = new ArrayList<Integer>(nodo + 1);

        for (int i = 0; i < this.matriceAdiacenza.size() + 1; i++) {
            listaAdiacenzaNodo.add(0);
        }
        this.matriceAdiacenza.add(listaAdiacenzaNodo);

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
        return matriceAdiacenza.get(node1).get(node2) > 0;
    }

    @Override
    public List<OrientedWeightedEdge> getEdges(int startNode) {

        ArrayList<Integer> list = this.matriceAdiacenza.get(startNode);
        List<OrientedWeightedEdge> listaArchi = new ArrayList<OrientedWeightedEdge>(list.size());
        for (int i = 0; i < list.size(); i++) {
            int arco = list.get(i);
            if (arco > 0) {
                listaArchi.add(new OrientedWeightedEdge(startNode, i, arco));
            }
        }
        return listaArchi;
    }

    @Override
    public List<OrientedWeightedEdge> getIncomingEdges(int endNode) {
        List<OrientedWeightedEdge> listaArchi = new ArrayList<OrientedWeightedEdge>(matriceAdiacenza.size());
        for (int i = 0; i < matriceAdiacenza.size(); i++) {
            ArrayList<Integer> list = matriceAdiacenza.get(i);
            int arco = list.get(endNode);
            if (arco > 0) {
                listaArchi.add(new OrientedWeightedEdge(i, endNode, arco));
            }
        }
        return listaArchi;
    }

    @Override
    public int numNodi() {
        return matriceAdiacenza.size();
    }

}
