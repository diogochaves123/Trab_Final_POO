package br.edu.atitus.pooavancado.CadUsuario.controllers.payloads;

import br.edu.atitus.pooavancado.CadUsuario.Entities.Pedido;

public class SignupPayload {
	
	private String nome;
	private String email;
	private Pedido departamento;
	private Pedido pedido;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Pedido getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Pedido departamento) {
		this.pedido = departamento;
	}
	public Object getPedido() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
