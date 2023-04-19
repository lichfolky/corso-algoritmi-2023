package alberiricerca;

public class AlberoDiRicercaTest {

    public static void main(String[] args) {
        AlberoDiRicerca albero = new AlberoDiRicerca();
        albero.insertOrdered(7, "Brugola");
        albero.insertOrdered(3, "Bulloni");
        albero.insertOrdered(15, "Candeliere");

        albero.insertOrdered(2, "Pistola");
        albero.insertOrdered(5, "Sbarra");
        albero.insertOrdered(10, "Corda");
        albero.insertOrdered(22, "Chiave inglese");
        System.out.println(albero.prettyPrint());
    }

}
