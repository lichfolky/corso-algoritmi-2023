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

        String str = this.toString() + "\n";
        if (leftChild != null) {
            str += s + leftChild.prettyPrint(s + " ");
        }
        if (rightChild != null) {
            str += s + rightChild.prettyPrint(s + " ");
        }
        return str;

    }
}
