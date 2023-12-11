package model;

public class Equipe {
    private static int count = 0;
    private int id;
    private String nome;

    public Equipe(String nome) {
        this.id = count++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Equipe " + id + ": " + nome;
    }
}