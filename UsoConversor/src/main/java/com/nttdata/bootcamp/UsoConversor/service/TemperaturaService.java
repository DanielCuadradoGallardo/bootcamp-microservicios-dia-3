package com.nttdata.bootcamp.UsoConversor.service;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.model.Conversor;


@Service
public class TemperaturaService {


	    public TemperaturaService(){}
	    
	    public Double convertToCelsius(Double temperatura){
	        Conversor conversor = new Conversor(temperatura);

	        return conversor.convertToCelsius();
	    }
	    
	    public Double convertToFarenheit(Double temperatura){
	        Conversor conversor = new Conversor(temperatura);

	        return conversor.convertToFarenheit();
	    }
	}
