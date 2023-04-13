package linkedlist;

public class QueueLinkedListLimitata<T> extends QueueLinkedList<T> {

    public int max;

    public QueueLinkedListLimitata(int max) {
        super();
        this.max = max;
    }

    @Override
    public void enqueue(T value) {
        if (this.getSize() <= max) {
            super.enqueue(value);
        }
    }

    public int getMax() {
        return max;
    }

}
