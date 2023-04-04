package mystack;
import java.util.Stack;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        System.out.println(stack);
        try{
            stack.push(1);        
            System.out.println("Push ha inserito l'elemento: " + stack.top());
            System.out.println(stack);
            stack.push(2);
            System.out.println("Push ha inserito l'elemento: " + stack.top());
            System.out.println(stack);
            stack.push(3);
            System.out.println("Push ha inserito l'elemento: " + stack.top());
            System.out.println(stack);
        }catch(Exception e){
            System.out.println("errore");
        }
        int elem;
        try{
            elem = stack.pop();
            System.out.println(stack);
            System.out.println("Pop ha restiuito l'elemento: " + elem);

            elem = stack.pop();
            System.out.println(stack);
            System.out.println("Pop ha restiuito l'elemento: " + elem);

            elem = stack.pop();
            System.out.println(stack);
            System.out.println("Pop ha restiuito l'elemento: " + elem);

            elem = stack.pop();
            System.out.println(stack);
            System.out.println("Pop ha restiuito l'elemento: " + elem);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(stack.isEmpty());


     
    }
    
}
