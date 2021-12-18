package com.dio.openfeign1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato retornaContato() {
        return Contato.builder()
                .id(1L)
                .nome("Teste")
                .telefone("99999-9999")
                .build();
    }
}
