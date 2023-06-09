import java.util.ArrayList;

public class QuickFind<T> implements UnionFind<T> {

    ArrayList<Node<T>> nodes;
    ArrayList<SetNode> sets;

    public QuickFind() {
        nodes = new ArrayList<Node<T>>();
        sets = new ArrayList<SetNode>();
    }

    @Override
    public UnionFind.Node<T> make(T value) {
        Node<T> nuovoNodo = new Node<T>(nodes.size(), value);
        nuovoNodo.set = new SetNode(nodes.size());
        sets.add(nodes.size(), nuovoNodo.set);
        nodes.add(nuovoNodo);
        return nuovoNodo;
    }

    @Override
    public UnionFind.SetNode find(UnionFind.Node<T> node) {
        return node.set;
    }

    @Override
    public void union(UnionFind.SetNode set1, UnionFind.SetNode set2) {
        Node<T> nodeAux;
        for (int i = 0; i < nodes.size(); i++) {
            nodeAux = nodes.get(i);
            if (nodeAux.set.equals(set2)) {
                nodeAux.set = set1;
            }
        }
    }

    @Override
    public UnionFind.SetNode getSet(int key) {
        return sets.get(key);
    }

    @Override
    public UnionFind.Node<T> getNode(int key) {
        return nodes.get(key);
    }

    @Override
    public String toString() {
        String str = "";
        for (Node<T> node : nodes) {
            str += node.set.toString() + ": " + node.toString() + "\n";
        }
        return str;
    }

}
