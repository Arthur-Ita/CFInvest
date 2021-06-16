package br.com.cfinvest.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="fii")
public class Fii {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String codigo;
	private String setor;
	@Column
	@OneToMany
	private List<Cotacao> cotacao;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public List<Cotacao> getCotacao() {
		return cotacao;
	}
	public void setCotacao(List<Cotacao> cotacao) {
		this.cotacao = cotacao;
	}
	
}
