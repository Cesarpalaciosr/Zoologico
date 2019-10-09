package com.capr.zoopack;

public class Pinguinos extends AvesNoVoladoras implements Nadar{

	@Override
	public String nadar() {
		// TODO Auto-generated method stub
		return "Los pinguinos se impulsan antes de entrar al agua";
	}
	
	//Constructores
	public Pinguinos () {
		this.Especie = "Pinguinos";
	}
}
