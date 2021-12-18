package com.digitalinnovationone.springboot.beans;

import com.digitalinnovationone.springboot.beans.model.Autor;
import com.digitalinnovationone.springboot.beans.model.Livro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Harry Potter");
        livro.setCodigo("D34FD");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("J.K. Rowling");

        livro.exibir();

        ((AnnotationConfigApplicationContext) factory).close();
    }
}
