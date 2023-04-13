package stack;

public interface Stack<T> {

    public void push(T element);

    public T pop();

    public T top();

    public boolean isEmpty();

}