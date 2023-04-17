package arraycircolare;

public class ArrayCircolareTest {

    public static void main(String[] args) {
        ArrayCircolare arrayCircolare = new ArrayCircolare(10);

        arrayCircolare.enqueue("Ciao");
        Object elemento = arrayCircolare.dequeue();

        System.out.println(elemento);

    }

}
