package tree;

public class Node<T> {
    public T value;
    Node<T> leftChild;
    Node<T> rightChild;
    Node<T> father;

    public Node(T value) {
        this.value = value;
        this.father = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }

    public String prettyPrint(String s) {
        throw new UnsupportedOperationException("Unimplemented method 'prettyPrint'");
    }
}
