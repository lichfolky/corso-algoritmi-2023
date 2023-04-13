package doublelinkedlist;

public class DoubleNode<E> {
    E value;
    DoubleNode<E> next;
    DoubleNode<E> prev;

    DoubleNode(DoubleNode<E> prev, E value, DoubleNode<E> next) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
