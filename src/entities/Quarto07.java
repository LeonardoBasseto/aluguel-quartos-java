package entities;

public class Quarto07 {

    private String nome;
    private String email;

    public Quarto07(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return nome + ", " + email;
    }
}
