package formulauno;

import doublelinkedlist.DoubleLinkedList;

public class FormulaUno {

    public static class Pilota {
        public String nome;
        public String scuderia;
        public String tempo;
        public int punti;

        public Pilota(String nome, String scuderia, String tempo, int punti) {
            this.nome = nome;
            this.scuderia = scuderia;
            this.tempo = tempo;
            this.punti = punti;
        }

        @Override
        public String toString() {
            return "\t" + nome + "\t" + scuderia + "\t" + tempo + "\t" + punti;
        }

    }

    public static void main(String[] args) {
        DoubleLinkedList<Pilota> classifica;
        classifica = new DoubleLinkedList<Pilota>();
        Pilota nuovoPilota = new Pilota("M. Verstappen", "Red Bull", "2:32:38.371", 25);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("L. Hamilton", "Mercedes", "+0.179s", 18);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("F. Alonso", "Aston Martin", "+0.769s", 15);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("L. Stroll", "Aston Martin", "+3.082s", 12);
        classifica.insert(nuovoPilota);
        nuovoPilota = new Pilota("S. Perez", "Red Bull", "+3.320s", 11);
        classifica.insert(nuovoPilota);

        System.out.println(classifica);

        System.out.println("PRIMO: " + classifica.get(0).nome);
        System.out.println("SECONDO: " + classifica.get(1).nome);
        System.out.println("TERZO: " + classifica.get(2).nome);
    }
}
