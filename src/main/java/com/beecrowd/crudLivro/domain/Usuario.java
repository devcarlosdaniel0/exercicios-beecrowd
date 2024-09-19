package com.beecrowd.crudLivro.domain;

public class Usuario {
    private String nome;
    private int id;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{\n" +
                "  nome='" + nome + '\'' + "\n" +
                "  id=" + id + "\n" +
                '}';
    }
}
