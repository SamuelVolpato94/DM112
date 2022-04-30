package br.inatel.dm112.model.entities;

public class Cliente {
	
	private int CPF;


	public Cliente() {
	}

	public Cliente(int CPF) {
		super();
		this.CPF = CPF;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	
	public void IdentificarCliente() {
	}

}
