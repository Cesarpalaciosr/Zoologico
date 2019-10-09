package com.capr.zoopack;

public class Anelidos extends Invertebrados implements Morder, Nadar{
	//Atributos
	private String SimetriaBilateral, Hermafroditas;
	private String CuerpoSegmentadoPorAnillos;
	//Constructores
	public Anelidos () {
		this.Especie = "Anelidos";
	}
	//Metodos
	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Los anelidos se delizan en el agua";
	}
	@Override
	public String morder() {
		// TODO Auto-generated method stub
		return "Los anelidos muerden y se aferran";
	}
	

}
