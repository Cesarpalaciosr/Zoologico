package com.capr.zoopack;

public class Peces extends Vertebrados implements Nadar, PonerHuevos {
	//Atributos
	private int Branqueas, Escamas, Aletas;
	private String Ectodermicos;
	
	
	//Metodos
	public static void MoverAletas() {

}
	
	public String Morder() {
		return "Muerden pero no mastican";
		
	}


	@Override
	public String ponerHuevos() {
		// TODO Auto-generated method stub
		return "Ponen huevos en lugares seguros lejos de los tiburones";
	}


	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Mueven aletas y cola";
	}
	
	public void Reproducirse() {
		System.out.println("Este men se reproduce poniendo huevos porque son unos " + this.Especie);
		
	}
	public void Desplazarse () {
		System.out.println("Los"+ this.Especie+ "Solo se deplaza nadando");
	}
//Constructor
	public Peces () {
		this.Especie = "Peces";
	}
}