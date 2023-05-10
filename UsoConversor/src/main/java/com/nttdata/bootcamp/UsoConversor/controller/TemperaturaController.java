package com.nttdata.bootcamp.UsoConversor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.UsoConversor.service.TemperaturaService;

@RequestMapping("/api/")
@RestController
public class TemperaturaController {
		
		@Autowired
		TemperaturaService temperaturaService;
		
		@GetMapping("temperaturaEnCelsius/{temperatura}")
		public String convertToCelsius(@PathVariable("temperatura") String temperatura) {
			
			Double temperaturaConvertida = temperaturaService.convertToCelsius(Double.parseDouble(temperatura));
			
			return temperaturaConvertida+"";
		}
		
		@GetMapping("temperaturaEnFarenheit/{temperatura}")
		public String convertToFarenheit(@PathVariable("temperatura") String temperatura) {
			
			Double temperaturaConvertida = temperaturaService.convertToFarenheit(Double.parseDouble(temperatura));
			
			return temperaturaConvertida+"";
		}
	}

