package com.capr.zoopack;

public class Reptiles extends Vertebrados implements Nadar, PonerHuevos {
	//Atributos
	private int Escamas, SistemaCirculatorioDeDobleCircuito, PulmonesBienDesarrollados, temp;
	private String ControlDeTemperaturaCorporal;
	private boolean SangreFria;
	
	/*Constructores
	Funciones varias*/
	public Reptiles () {
		this.Especie = "Reptiles";
	}
	public Reptiles(int tempInicial) {
		this.temp = tempInicial;
	}
	//Metodos
	public void CambioDeTemperatura(int nuevaTemp) {
		System.out.println("La temperatura de este bicho cambio de " + this.temp + " grados a " + nuevaTemp + " grados.");
		this.temp = nuevaTemp;
		
	}
	public static void MetabolismoLento() {
		
	}
	@Override
	public String ponerHuevos() {
		// TODO Auto-generated method stub
		return "Ponen huevos en lugares calidos";
	}
	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Nadan moviendo patas y cola";
	}
}
