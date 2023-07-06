package br.edu.atitus.pooavancado.CadUsuario.Entities;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "pedido")
public class Pedido extends GenericEntity {
	
	@Column(nullable = true)
	private Date data;
	
	@Column(nullable = false)
	private Produto produto;
	
	@Column(nullable = false)
	private Double quantidade;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
}
