package com.beecrowd.crudContatos.service;

import com.beecrowd.crudContatos.domain.Contato;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ContatoService {
    private Set<Contato> contatoSet = new LinkedHashSet<>();

    public void addContato(Contato contato) {
        if (!contatoSet.contains(contato)) {
            contatoSet.add(contato);
        } else {
            System.out.println("O contato já existe");
        }
    }

    public void removerContato(Contato contato) {
        if (contatoSet.contains(contato)) {
            contatoSet.remove(contato);
        } else {
            System.out.println("O contato não está na lista");
        }
    }

    public Set<Contato> buscarContato(Predicate<Contato> predicate) {
        return contatoSet.stream().filter(predicate).collect(Collectors.toSet());
    }

    public void listarContatos() {
        System.out.println(contatoSet);
    }
}
