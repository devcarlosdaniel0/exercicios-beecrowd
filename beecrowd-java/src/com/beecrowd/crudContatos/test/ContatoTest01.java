package com.beecrowd.crudContatos.test;

import com.beecrowd.crudContatos.domain.Contato;
import com.beecrowd.crudContatos.service.ContatoService;

import java.util.Set;

public class ContatoTest01 {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Carlos", "carlos@gmail.com", "(19)99950-5922", "R. Freire de Andrade");
        Contato contato2 = new Contato("Marcos", "marcos@gmail.com", "(19)99832-4932", "R. Freire de Andrade");
        Contato contato3 = new Contato("Carlos", "carlos@gmail.com", "(19)99950-5922", "R. Freire de Andrade");
        Contato contato4 = new Contato("Davi", "davi@gmail.com", "(19)39550-5222", "R. Freire de Andrade");
        ContatoService service = new ContatoService();

        service.addContato(contato1);
        service.addContato(contato2);
        service.addContato(contato3);
        service.addContato(contato4);

        service.listarContatos();

        Set<Contato> contatosSearchByName = service.buscarContato(contato -> contato.getNome().equals("Carlos"));
        Set<Contato> contatoSearchByTell = service.buscarContato(contato -> contato.getTelefone().equals("(19)99832-4932"));
        System.out.println(contatosSearchByName);
        System.out.println(contatoSearchByTell);
    }
}
