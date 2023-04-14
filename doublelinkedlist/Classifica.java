package doublelinkedlist;

import java.util.Calendar;

import formulauno.Pilota;

public class Classifica extends DoubleLinkedList<Pilota> {

    public void aggiungiTempi(Calendar arrivoDelPrimo, double[] scarti) {
        for (int i = 0; i < scarti.length; i++) {
            Calendar aux = Calendar.getInstance();
            aux.setTimeInMillis(arrivoDelPrimo.getTimeInMillis() + Math.round(scarti[i] * 1000));
            get(i).tempo = aux;
        }
    }

    public void sorpassa(int posizionePilota1, int posizionePilota2) {
        throw new UnsupportedOperationException("Unimplemented method 'sorpassa'");
    }

}