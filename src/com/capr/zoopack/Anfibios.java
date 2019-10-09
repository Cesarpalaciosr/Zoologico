package com.capr.zoopack;

public class Anfibios extends Vertebrados implements Nadar{
	//Atributos
	private String Semiterrestres, Ectodermicos, RespiracionBranquialLarbal, RespiracionPulmonarAdulta, Metamorfosis;
	private int Patas;
	/*Constructores
	 Funciones varias*/
	public Anfibios () {
		this.Especie = "Anfibios";
	}
	//Metodos
	public static void Metamorfosis () {}
	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Los Anfibios nadan como renaucajos, adultos nadan como ranas";
	}
}
