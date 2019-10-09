package com.capr.zoopack;

public class ArtropodosAereos extends Artropodos implements PonerHuevos, Morder{
	//Atributos
	private int Aguijon, Alas;
	
	//Constructores
	public ArtropodosAereos () {
		this.Especie = "ArtopodosAereos";
	}
	
	//Metodos
	public void Picar () {System.out.println("te pique");}
	public static void Succionar () {}
	public static void SegregarVeneno () {}
	@Override
	public String morder() {
		// TODO Auto-generated method stub
		return "Los Artropodos muerden con la boca ";
	}
	@Override
	public String ponerHuevos() {
		// TODO Auto-generated method stub
		return "Ponen huevos en cualquier lugar";
	}
}
