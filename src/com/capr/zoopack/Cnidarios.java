package com.capr.zoopack;

public class Cnidarios extends Invertebrados implements Nadar {
	//Atributos 
	private String HabitatAcuatico, SimetriaRadial, EctodermisProtectora;
	private int TentaculosConCnidocitos, OrificioBocaAno;

	//Constrructores
	public Cnidarios () {
		this.Especie = "Cnidarios";
	}
	//Metodos
	public static void TentaculosUrticantes() {} 
	public static void Flotar() {}
	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Nadan dejandose llevar por la corriente";
	}
}
