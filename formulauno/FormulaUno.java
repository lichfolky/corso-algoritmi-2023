package formulauno;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import doublelinkedlist.Classifica;
import doublelinkedlist.DoubleLinkedList;

public class FormulaUno {

    public static void main(String[] args) {

        Classifica classifica;
        classifica = new Classifica();

        Pilota nuovoPilota = new Pilota("M. Verstappen", "Red Bul", 25);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("L. Hamilton", "Mercedes", 18);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("F. Alonso", "Aston Martin", 15);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("L. Stroll", "Aston Martin", 12);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("S. Perez", "Red Bull", 11);
        classifica.insert(nuovoPilota);

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
    }
}
