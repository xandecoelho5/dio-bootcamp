package com.digitalinnovationone.springboot;

import com.digitalinnovationone.springboot.model.Autor;
import com.digitalinnovationone.springboot.model.AutorLivro;
import com.digitalinnovationone.springboot.model.Livro;
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
