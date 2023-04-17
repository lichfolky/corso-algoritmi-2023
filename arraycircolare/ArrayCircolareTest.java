package arraycircolare;

public class ArrayCircolareTest {

    public static void main(String[] args) {
        ArrayCircolare arrayCircolare = new ArrayCircolare(10);

        arrayCircolare.enqueue("Mattia");
        arrayCircolare.enqueue("Simone");
        Object elemento = arrayCircolare.dequeue();
        elemento = arrayCircolare.dequeue();
        arrayCircolare.enqueue("Qui");
        arrayCircolare.enqueue("Quo");
        arrayCircolare.enqueue("Qua");
        arrayCircolare.enqueue("Paperino");
        arrayCircolare.enqueue("Paperone");
        System.out.println(arrayCircolare);

        elemento = arrayCircolare.dequeue();
        System.out.println(elemento);

        elemento = arrayCircolare.dequeue();
        System.out.println(elemento);

        elemento = arrayCircolare.dequeue();
        System.out.println(elemento);

        System.out.println(arrayCircolare.top());

        System.out.println(arrayCircolare);
    }

}
