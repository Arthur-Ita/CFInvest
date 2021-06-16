package br.com.cfinvest.model;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="movimentacaoFii")
public class MovimentacaoFii extends Movimentacao {

	@OneToOne
	private Fii fii;
	private int quantidade;
	private Double valorUnitario;
	
	public Fii getFii() {
		return fii;
	}
	public void setFii(Fii fii) {
		this.fii = fii;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
