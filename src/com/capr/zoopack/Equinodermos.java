package com.capr.zoopack;

public class Equinodermos extends Invertebrados implements Morder, Nadar{
	private String HabitatMarino;
	private int Bentosas, SimetriaPentaRadial, Estomago;
	//Constructores
	public Equinodermos () {
		this.Especie = "Equinodermos";
	}
	//Metodos
	public static void  ReproduccionAsexual () {}
	
	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Nadan poco";
	}

	@Override
	public String morder() {
		// TODO Auto-generated method stub
		return "Muerden lo que este mas cera de ellas";
	}


}
