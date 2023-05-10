package com.nttdata.bootcamp.model;

public class Conversor {
	
	private Double temperatura;
	
	public Conversor(Double temperatura) {
		this.temperatura = temperatura;
	}
	
	public Double convertToCelsius() {
		return (temperatura - 32) * 5 / 9;
	}
	
	public Double convertToFarenheit() {
		return (temperatura *  9 / 5) + 32;
	}
}
