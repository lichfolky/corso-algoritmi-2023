package hashmap;

public class Persona {
    String nome;
    int anni;

    public Persona(String nome, int anni) {
        this.nome = nome;
        this.anni = anni;
    }

    @Override
    public String toString() {
        return nome + " " + anni;
    }

}
