package queue;

import linkedlist.StackQueueLinkedList;
import stack.Stack;

public class TestStackLinkedList {
    public static void main(String[] args) {

        Stack<Integer> stack = new StackQueueLinkedList<Integer>();
        System.out.println(stack);
        try {
            stack.push(1);
            System.out.println("Push ha inserito l'elemento: " + stack.top());
            System.out.println(stack);
            stack.push(2);
            System.out.println("Push ha inserito l'elemento: " + stack.top());
            System.out.println(stack);
            stack.push(3);
            System.out.println("Push ha inserito l'elemento: " + stack.top());
            System.out.println(stack);
        } catch (Exception e) {
            System.out.println("errore");
        }
        int elem;
        try {
            elem = stack.pop();
            System.out.println("Pop ha restituito l'elemento: " + elem);
            System.out.println(stack);

            elem = stack.pop();
            System.out.println("Pop ha restituito l'elemento: " + elem);
            System.out.println(stack);

            elem = stack.pop();
            System.out.println("Pop ha restituito l'elemento: " + elem);
            System.out.println(stack);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(stack.isEmpty());
    }
}
