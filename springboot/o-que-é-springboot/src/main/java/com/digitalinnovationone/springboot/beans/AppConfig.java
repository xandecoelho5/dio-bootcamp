package com.digitalinnovationone.springboot.beans;

import com.digitalinnovationone.springboot.beans.model.Autor;
import com.digitalinnovationone.springboot.beans.model.AutorLivro;
import com.digitalinnovationone.springboot.beans.model.Livro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro() {
        return new Livro();
    }

    @Bean
    public AutorLivro getAutorLivro() {
        return new Autor();
    }
}
