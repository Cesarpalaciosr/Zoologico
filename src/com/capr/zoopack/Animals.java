package com.capr.zoopack;

public abstract class Animals {
	//Atributos
	public String Especie, Sexo, Nutricion, AparatoRespiratorio, AparatoDigestivo, AparatoExcretor, OrganizacionCelular;
	public int NumOjos, NumExtremidades;
	public float Peso;
	
	//Metodos
	public abstract void Respirar() ;
		public abstract void Desplazarse(); 
		public abstract void Alimentarse ();
		public abstract void Reproducirse();
		public abstract void Metabolismo();
		public abstract void Desarrollo() ;
		public abstract void Excresion() ;
}