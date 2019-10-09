package com.capr.zoopack;

public class ArtropodosNoVoladores extends Artropodos implements Morder, PonerHuevos{

	public ArtropodosNoVoladores () {
		this.Especie = "ArtropodosNoVoladores";
	}
	@Override
	public String ponerHuevos() {
		// TODO Auto-generated method stub
		return "Ponen huevos en cualquier lugar Osucuro";
	}

	@Override
	public String morder() {
		// TODO Auto-generated method stub
		return "Muerden sus prezas";
	}
}