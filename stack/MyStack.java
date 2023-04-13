package stack;

import java.util.EmptyStackException;

public class MyStack {

    int[] stack;
    int nextElementIndex;

    public MyStack(int n) {
        this.stack = new int[n];
        this.nextElementIndex = 0;
    }

    // inserisce un elemento nello stack
    public void push(int element) {
        if (nextElementIndex < stack.length) {
            this.stack[nextElementIndex] = element;
            nextElementIndex++;
        }
    }

    // restituisce l'ultimo elemento inserrito nello stack, rimuovendolo
    public int pop() throws Exception {
        if (nextElementIndex == 0) {
            throw new EmptyStackException();
        }
        int aux = this.stack[nextElementIndex - 1];
        this.stack[nextElementIndex - 1] = 0;
        nextElementIndex--;
        return aux;
    }

    // restituisce l'ultimo elemento inserrito nello stack
    public int top() throws Exception {
        if (nextElementIndex == 0) {
            throw new EmptyStackException();
        }
        return this.stack[nextElementIndex - 1];
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    @Override
    public String toString() {

        String toString = "\n";

        for (int i = stack.length - 1; i >= nextElementIndex; i--) {
            toString += "|       |\n";
        }

        for (int i = nextElementIndex - 1; i >= 0; i--) {
            toString += "|   " + stack[i] + "   |\n";
        }

        toString += "|_______|\n";

        return toString;

    }

}