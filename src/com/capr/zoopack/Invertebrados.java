package com.capr.zoopack;

public class Invertebrados extends Animals {
	//Atributos
	public final boolean Esqueleto = false;

	@Override
	public void Respirar() {
		System.out.println("Los"+ this.Especie+" respira" );
		
	}

	@Override
	public void Desplazarse() {
		System.out.println("Estos"+this.Especie+ " camina bien chido");
		
	}

	@Override
	public void Alimentarse() {
		System.out.println("Esta "+this.Especie+" se alimenta de plantas");
		
	}

	@Override
	public void Reproducirse() {
		System.out.println("Esta "+this.Especie+" pone huevos");
		
	}

	@Override
	public void Metabolismo() {
		System.out.println("Esta "+this.Especie+" Digiere la comida lentamente");
		
	}

	@Override
	public void Desarrollo() {
		System.out.println("Esta "+this.Especie+" se desarrolla en poco tiempo ");
		
	}

	@Override
	public void Excresion() {
		System.out.println("Esta "+this.Especie+ " bota sus deshechos");
		
	} 
	
	
	public String retorcerse() {
		return this.Especie+" Se retuerce";
	}


//Constructores
public Invertebrados () {
	this.Especie = "Invertebrados";
	}
}