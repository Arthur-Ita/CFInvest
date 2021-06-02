package br.com.cfinvest.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carteira {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	@OneToMany()
	private List<Fii> fundos;
	@Column
	@OneToMany
	private List<MovimentacaoFii> operacoes;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Fii> getFundos() {
		return fundos;
	}
	public void setFundos(List<Fii> fundos) {
		this.fundos = fundos;
	}
	public List<MovimentacaoFii> getOperacoes() {
		return operacoes;
	}
	public void setOperacoes(List<MovimentacaoFii> operacoes) {
		this.operacoes = operacoes;
	}
}
