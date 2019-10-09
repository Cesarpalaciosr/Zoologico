package com.capr.zoopack;

public class Vertebrados extends Animals implements Morder {
	//Atributos
	private int Vertebras, EspinaDorsal, Craneo, Esqueleto, AparatoLocomotor, AparatoRespiratorio, SistemaNervioso, ColumnaVertebral;
	
//Constructores
	public Vertebrados () {
		this.Especie = "Vertebrados";
	}
	//Metodos
	public static void SegregarHormonas() {
		
	}
	
	@Override
	public void Respirar() {
		System.out.println("Este"+ this.Especie+ "p");
	}
	
	@Override
	public void Desplazarse() {
		System.out.println("Este "+ this.Especie+" camina" );
	}
	
	@Override
	public void Alimentarse() {		
		System.out.println("Esta "+this.Especie+" Se alimentan de carne y plantas");
	}
	
	@Override
	public void Reproducirse() {
		System.out.println("Los "+ this.Especie + "pueden reproducirse pariendo");
		
	}
	
	@Override
	public void Metabolismo() {
		// TODO Auto-generated method stub
		System.out.println("Este Vertebrado puede digerir su comida");
		
	}
	
	@Override
	public void Desarrollo() {
		// TODO Auto-generated method stub
		System.out.println("Los "+ this.Especie+" pueden desarrollarse");
		
	}
	
	@Override
	public void Excresion() {
		System.out.println("Esta "+this.Especie+"desecha las sobras por su aparato excretor");
		
	}
	@Override
	public String morder() {
		// TODO Auto-generated method stub
		return "Muerden con los dientes";
	}
	}
