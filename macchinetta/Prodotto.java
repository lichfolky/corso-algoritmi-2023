package macchinetta;

public class Prodotto implements Comparable<Prodotto> {
    public String nome;
    public double prezzo;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public int compareTo(Prodotto prodottoCompare) {
        /*
         * if (this.nome.equals(prodottoCompare.nome)) {
         * if (prezzo == prodottoCompare.prezzo) {
         * return 0;
         * }
         * if (this.prezzo > prodottoCompare.prezzo) {
         * return 1;
         * } else {
         * return -1;
         * }
         * }
         */
        return this.nome.compareTo(prodottoCompare.nome);
    }

}
