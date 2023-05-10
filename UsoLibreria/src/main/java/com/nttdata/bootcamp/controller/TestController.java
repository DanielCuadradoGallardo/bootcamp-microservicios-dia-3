package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.service.TestService;


@RequestMapping("/api/")
@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("saludo/{idioma}")
	public String saludo(@PathVariable("idioma") String idioma) {
		
		String saludoIdioma = testService.usoSaludo(idioma);
		
		return saludoIdioma;
	}
}
