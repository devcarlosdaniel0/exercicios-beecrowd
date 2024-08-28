package com.beecrowd.crudContatos.test;

import com.beecrowd.crudContatos.domain.Contato;
import com.beecrowd.crudContatos.service.ContatoService;

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
        service.removerContato(contato4);

        service.listarContatos();
    }
}
