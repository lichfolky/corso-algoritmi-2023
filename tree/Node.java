package tree;

public class Node<T> {
    public T value;
    public Node<T> leftChild;
    public Node<T> rightChild;
    public Node<T> father;

    public Node(T value) {
        this.value = value;
        this.father = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public String prettyPrint(int lv) {
        String str = "";
        if (lv > 0) {
            str += " ".repeat(lv * 3) + "│ \n";
            str += " ".repeat(lv * 3) + "└──";
        }
        str += this.toString() + "\n";
        if (leftChild != null) {
            str += leftChild.prettyPrint(lv + 1);
        }
        if (rightChild != null) {
            str += rightChild.prettyPrint(lv + 1);
        }
        return str;
    }
}
