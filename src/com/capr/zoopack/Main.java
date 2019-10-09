package com.capr.zoopack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals[] groupAnimals = new Animals[9];
		Vertebrados[] groupVertebrados = new Vertebrados[7];
		Invertebrados[] groupInvertebrados = new Invertebrados[6];
		
		groupAnimals[0] = new Equinodermos();
		groupAnimals[1] = new Cnidarios();
		groupAnimals[2] = new Anelidos();
		groupAnimals[3] = new Artropodos();
		groupAnimals[4] = new Peces();
		groupAnimals[5] = new Reptiles(40);
		groupAnimals[6] = new Anfibios();
		groupAnimals[7] = new Mamiferos("Perry porque pone huevos");
		groupAnimals[8] = new Aves();
		
		groupInvertebrados[0] = new Equinodermos();
		groupInvertebrados[1] = new Cnidarios();
		groupInvertebrados[2] = new Anelidos();
		groupInvertebrados[3] = new Artropodos();
		groupInvertebrados[4] = new ArtropodosAereos();
		groupInvertebrados[5] = new ArtropodosNoVoladores();
		
		groupVertebrados[0] = new Aves();
		groupVertebrados[1] = new Peces();
		groupVertebrados[2] = new Reptiles(403);
		groupVertebrados[3] = new Anfibios();
		groupVertebrados[4] = new Mamiferos("Pancho");
		groupVertebrados[5] = new AvesVoladoras();
		groupVertebrados[6] = new AvesNoVoladoras();

		System.out.println("Mostrando las funciones de todos los tipos de animal /n");
		for (Animals a: groupAnimals) {
			a.Alimentarse();
			a.Desarrollo();
			a.Desplazarse();
			a.Excresion();
			a.Metabolismo();
			a.Reproducirse();
			a.Respirar();
		}
		
		System.out.println("Mostrando que todos los vertebrados muerden");
		for (Vertebrados v: groupVertebrados) {
			System.out.println(v.morder());
		}
		
		System.out.println("Mostrando que todos los invertebrados se retuercen");
		for (Invertebrados i: groupInvertebrados) {
			System.out.println(i.retorcerse());
		}
		
		ArtropodosAereos ap = (ArtropodosAereos) groupInvertebrados[4];
		System.out.println("El siguiente artotropodo aereo ejecuta un metodo: /n");
		ap.Picar();
		ArtropodosAereos.Succionar();
		
		Mamiferos mam = (Mamiferos) groupVertebrados[4];
		System.out.println("El siguiente mamifero ejecuta un metodo: /n");
		mam.Amamantar();
		
		Reptiles Re = (Reptiles) groupVertebrados[2];
		System.out.println("El siguiente reptil cambio de temperatura: \n");
		Re.CambioDeTemperatura(50);

		
	}

}
