package com.nttdata.bootcamp.service;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.model.Saludo;



@Service
public class TestService {

    public TestService(){}
    public String usoSaludo(String idioma){
        Saludo claseSaludo = new Saludo(idioma);

        return claseSaludo.mensajeSaludo();
    }
}
