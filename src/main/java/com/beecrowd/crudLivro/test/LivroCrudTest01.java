package com.beecrowd.crudLivro.test;

import com.beecrowd.crudLivro.domain.Livro;
import com.beecrowd.crudLivro.domain.Usuario;
import com.beecrowd.crudLivro.service.Service;

import java.util.ArrayList;
import java.util.List;

public class LivroCrudTest01 {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(
                List.of(new Livro("Entendendo algoritimos", "Adytia", 2017),
                        new Livro("Fundamentos da Matemática Elementar", "Saraiva", 2005),
                        new Livro("O Príncipe", "Maquiável", 1958),
                        new Livro("História do Herói", "Marvel", 2022)));

        List<Usuario> usuarios = new ArrayList<>(
                List.of(new Usuario("Carlos", 0),
                        new Usuario("Cleber", 1),
                        new Usuario("Maria", 2))
        );

        Service service = new Service();
        service.emprestarLivro(livros.get(0), usuarios.get(0));
        service.emprestarLivro(livros.get(1), usuarios.get(1));
        service.emprestarLivro(livros.get(2), usuarios.get(0));
        service.emprestarLivro(livros.get(3), usuarios.get(2));

//        service.devolverLivro(livros.get(0), usuarios.get(0));

        service.listarLivros();


    }
}
