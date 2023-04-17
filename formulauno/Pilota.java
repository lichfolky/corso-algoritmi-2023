package formulauno;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pilota {
    public String nome;
    public String scuderia;
    public double scarto;
    public Calendar tempo;
    public int punti;

    SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss.SSS");

    public Pilota(String nome, String scuderia, int punti) {
        this.nome = nome;
        this.scuderia = scuderia;
        this.punti = punti;
        this.scarto = 0.0;
        this.tempo = null;
    }

    @Override
    public String toString() {
        if (tempo != null) {
            String tempoFormattato = timeFormatter.format(tempo.getTime());
            return "\t" + nome + "\t" + scuderia + "\t" + tempoFormattato + "\t" + punti;
        } else
            return "\t" + nome + "\t" + scuderia + "\t" + punti;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pilota) {
            Pilota objPilota = (Pilota) obj;
            return this.nome == objPilota.nome && this.scuderia == objPilota.scuderia;
        } else {
            return false;
        }

    }
}