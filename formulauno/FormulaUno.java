package formulauno;

import java.util.Calendar;
import doublelinkedlist.Classifica;

public class FormulaUno {

    public static void main(String[] args) {

        Classifica classifica = new Classifica();

        Pilota nuovoPilota = new Pilota("M. Verstappen", "Red Bull", 25);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("L. Hamilton", "Mercedes", 18);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("F. Alonso", "Aston Martin", 15);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("L. Stroll", "Aston Martin", 12);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("S. Perez", "Red Bull", 11);
        classifica.insert(nuovoPilota);

        Pilota pilotaDaCercare = new Pilota("M. Verstappen", "Red Bull", 0);

        System.out.println("trovato: " + classifica.search(pilotaDaCercare));

        Calendar arrivoDelPrimo = Calendar.getInstance();
        arrivoDelPrimo.set(Calendar.HOUR, 2);
        arrivoDelPrimo.set(Calendar.MINUTE, 32);
        arrivoDelPrimo.set(Calendar.SECOND, 38);
        arrivoDelPrimo.set(Calendar.MILLISECOND, 371);

        double[] scarti = { 0.0, 0.179, 0.769, 3.082, 3.32 };

        classifica.aggiungiTempi(arrivoDelPrimo, scarti);

        System.out.println(classifica);

        System.out.println("PRIMO: " + classifica.get(0).nome);
        System.out.println("SECONDO: " + classifica.get(1).nome);
        System.out.println("TERZO: " + classifica.get(2).nome);

        System.out.println("LA GARA è FINITA! Si chiude tutto:");

        System.out.println("Eliminato: " + classifica.remove(0).nome);

        System.out.println(classifica);

        System.out.println("Eliminato: " + classifica.remove(3).nome);

        System.out.println(classifica);

        pilotaDaCercare = new Pilota("F. Alonso", "Aston Martin", 15);
        System.out.println("Eliminato: " + classifica.remove(classifica.search(pilotaDaCercare)).nome);

        System.out.println(classifica);
        System.out.println("Eliminato: " + classifica.remove(1).nome);
        System.out.println("Eliminato: " + classifica.remove(0).nome);

    }
}
