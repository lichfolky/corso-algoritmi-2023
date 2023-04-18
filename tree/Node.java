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
        // TODO Auto-generated method stub
        String str = "[" + value + "]\n";
        if (leftChild != null) {
            str += "  " + leftChild;
        }
        if (rightChild != null) {
            str += "  " + rightChild;
        }

        return str;
    }
}
