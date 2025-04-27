package com.mhoffmann.meu_primeiro_springboot.controller;

import com.mhoffmann.meu_primeiro_springboot.service.MensagemService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MensagemController {
    private final MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService) {
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mensagem")
    public String mensagem(){
        return mensagemService.obterMensagem();
    }
}
