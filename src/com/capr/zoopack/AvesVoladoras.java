package com.capr.zoopack;

public class AvesVoladoras extends Aves implements Volar{
	public AvesVoladoras () {
		this.Especie = "AvesVoladorass";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Vuelan moviendo sus alas y sus plumas";
	}

}
