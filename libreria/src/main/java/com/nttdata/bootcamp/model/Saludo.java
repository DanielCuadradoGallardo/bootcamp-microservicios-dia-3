package com.nttdata.bootcamp.model;

public class Saludo {
	
	private String idioma;
	
	public Saludo(String idioma) {
		this.idioma = idioma;
	}
	
	public String mensajeSaludo() {
		String mensaje = "";
		
		switch(idioma) {
			case "castellano":
				mensaje ="Bienvenido";
				break;
			case "Ingles":
				mensaje="Welcome";
				break;
			case "Italiano":
				mensaje="Benvenuto";
				break;
			default:
				mensaje ="Bienvenido";	
		}
		return mensaje;
	}
}
