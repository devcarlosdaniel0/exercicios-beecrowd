package com.beecrowd.crudContatos.service;

import com.beecrowd.crudContatos.domain.Contato;

import java.util.LinkedHashSet;
import java.util.Set;

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

    public void listarContatos() {
        System.out.println(contatoSet);
    }
}
