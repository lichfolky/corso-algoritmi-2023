package restogreedy;

import java.util.LinkedList;
import java.util.List;

public class RestoGreedy {

    public class Moneta {
        double valore;
        String nome;

        public Moneta(double valore, String nome) {
            this.valore = valore;
            this.nome = nome;
        }

        @Override
        public String toString() {
            return nome;
        }
    }

    Moneta[] moneteDisponibili;

    public RestoGreedy() {
        this.moneteDisponibili = new Moneta[4];
        this.moneteDisponibili[0] = new Moneta(0.5, "50 cents");
        this.moneteDisponibili[1] = new Moneta(0.2, "20 cents");
        this.moneteDisponibili[2] = new Moneta(0.10, "10 cents");
        this.moneteDisponibili[3] = new Moneta(0.05, "5 cents");
    }

    // quantità

    public List<Moneta> restoGreedy(double resto) {
        List<Moneta> monete = new LinkedList<Moneta>();
        double restoRimanente = resto; // soluzione parziale

        // la soluzione è stata trovata?
        while (restoRimanente > 0) {
            Moneta migliore = null;
            for (int i = 0; i < moneteDisponibili.length; i++) {
                // è migliore di, euristica
                double epsilon = 0.0001;
                if (moneteDisponibili[i].valore - restoRimanente < epsilon)
                    if (migliore == null) {
                        migliore = moneteDisponibili[i];
                    } else {
                        if (moneteDisponibili[i].valore > migliore.valore) {
                            migliore = moneteDisponibili[i];
                        }
                    }
            }
            if (migliore == null) {
                break;
            }
            monete.add(migliore);
            restoRimanente -= migliore.valore;
        }
        return monete;
    }

    public List<Moneta> restoGreedyLimitato(double resto) {
        List<Moneta> monete = new LinkedList<Moneta>();
        double restoRimanente = resto; // soluzione parziale

        // la soluzione è stata trovata?
        while (restoRimanente > 0) {
            Moneta migliore = null;
            for (int i = 0; i < moneteDisponibili.length; i++) {
                if (!monete.contains(moneteDisponibili[i])) {
                    // è migliore di, euristica
                    double epsilon = 0.0001;
                    if (moneteDisponibili[i].valore - restoRimanente < epsilon)
                        if (migliore == null) {
                            migliore = moneteDisponibili[i];
                        } else {
                            if (moneteDisponibili[i].valore > migliore.valore) {
                                migliore = moneteDisponibili[i];
                            }
                        }
                }
            }
            if (migliore == null) {
                break;
            }
            monete.add(migliore);
            restoRimanente -= migliore.valore;
        }
        return monete;
    }
}
