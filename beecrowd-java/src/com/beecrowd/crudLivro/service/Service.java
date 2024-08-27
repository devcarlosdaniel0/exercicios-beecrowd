package com.beecrowd.crudLivro.service;

import com.beecrowd.crudLivro.domain.Livro;
import com.beecrowd.crudLivro.domain.Usuario;

import java.util.LinkedHashMap;
import java.util.Map;

public class Service {
    private Map<Livro, Usuario> livroMap = new LinkedHashMap<>();

    public void emprestarLivro(Livro livro, Usuario usuario) {
        livroMap.putIfAbsent(livro, usuario);
    }

    public void devolverLivro(Livro livro, Usuario usuario) {
        livroMap.remove(livro, usuario);
    }

    @Override
    public String toString() {
        return "Service{" +
                "livroMap=" + livroMap +
                '}';
    }

    public void listarLivros() {
        System.out.println(livroMap);
    }
}
