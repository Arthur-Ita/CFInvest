package br.com.cfinvest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cotacao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private Date data;
	private String precoAtual;
	private String liquidezDiaria;
	private String dividendo;
	private String dividendYield;
	private String dy3ac;
	private String dy6ac;
	private String dy12ac;
	private String dy3m;
	private String dy6m;
	private String dy12m;
	private String dyAno;
	private String variacaoPreco;
	private String rentPeriodo;
	private String rentAcumulada;
	private String patLiquido;
	private String vpa;
	private String pvpa;
	private String dyPatrimonial;
	private String varPatrimonial;
	private String rentPatPeriodo;
	private String rentPatAc;
	private String vacanciaFisica;
	private String vacanciaFinanceira;
	private String quantAtivos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getPrecoAtual() {
		return precoAtual;
	}
	public void setPrecoAtual(String precoAtual) {
		this.precoAtual = precoAtual;
	}
	public String getLiquidezDiaria() {
		return liquidezDiaria;
	}
	public void setLiquidezDiaria(String liquidezDiaria) {
		this.liquidezDiaria = liquidezDiaria;
	}
	public String getDividendo() {
		return dividendo;
	}
	public void setDividendo(String dividendo) {
		this.dividendo = dividendo;
	}
	public String getDividendYield() {
		return dividendYield;
	}
	public void setDividendYield(String dividendYield) {
		this.dividendYield = dividendYield;
	}
	public String getDy3ac() {
		return dy3ac;
	}
	public void setDy3ac(String dy3ac) {
		this.dy3ac = dy3ac;
	}
	public String getDy6ac() {
		return dy6ac;
	}
	public void setDy6ac(String dy6ac) {
		this.dy6ac = dy6ac;
	}
	public String getDy12ac() {
		return dy12ac;
	}
	public void setDy12ac(String dy12ac) {
		this.dy12ac = dy12ac;
	}
	public String getDy3m() {
		return dy3m;
	}
	public void setDy3m(String dy3m) {
		this.dy3m = dy3m;
	}
	public String getDy6m() {
		return dy6m;
	}
	public void setDy6m(String dy6m) {
		this.dy6m = dy6m;
	}
	public String getDy12m() {
		return dy12m;
	}
	public void setDy12m(String dy12m) {
		this.dy12m = dy12m;
	}
	public String getDyAno() {
		return dyAno;
	}
	public void setDyAno(String dyAno) {
		this.dyAno = dyAno;
	}
	public String getVariacaoPreco() {
		return variacaoPreco;
	}
	public void setVariacaoPreco(String variacaoPreco) {
		this.variacaoPreco = variacaoPreco;
	}
	public String getRentPeriodo() {
		return rentPeriodo;
	}
	public void setRentPeriodo(String rentPeriodo) {
		this.rentPeriodo = rentPeriodo;
	}
	public String getRentAcumulada() {
		return rentAcumulada;
	}
	public void setRentAcumulada(String rentAcumulada) {
		this.rentAcumulada = rentAcumulada;
	}
	public String getPatLiquido() {
		return patLiquido;
	}
	public void setPatLiquido(String patLiquido) {
		this.patLiquido = patLiquido;
	}
	public String getVpa() {
		return vpa;
	}
	public void setVpa(String vpa) {
		this.vpa = vpa;
	}
	public String getPvpa() {
		return pvpa;
	}
	public void setPvpa(String pvpa) {
		this.pvpa = pvpa;
	}
	public String getDyPatrimonial() {
		return dyPatrimonial;
	}
	public void setDyPatrimonial(String dyPatrimonial) {
		this.dyPatrimonial = dyPatrimonial;
	}
	public String getVarPatrimonial() {
		return varPatrimonial;
	}
	public void setVarPatrimonial(String varPatrimonial) {
		this.varPatrimonial = varPatrimonial;
	}
	public String getRentPatPeriodo() {
		return rentPatPeriodo;
	}
	public void setRentPatPeriodo(String rentPatPeriodo) {
		this.rentPatPeriodo = rentPatPeriodo;
	}
	public String getRentPatAc() {
		return rentPatAc;
	}
	public void setRentPatAc(String rentPatAc) {
		this.rentPatAc = rentPatAc;
	}
	public String getVacanciaFisica() {
		return vacanciaFisica;
	}
	public void setVacanciaFisica(String vacanciaFisica) {
		this.vacanciaFisica = vacanciaFisica;
	}
	public String getVacanciaFinanceira() {
		return vacanciaFinanceira;
	}
	public void setVacanciaFinanceira(String vacanciaFinanceira) {
		this.vacanciaFinanceira = vacanciaFinanceira;
	}
	public String getQuantAtivos() {
		return quantAtivos;
	}
	public void setQuantAtivos(String quantAtivos) {
		this.quantAtivos = quantAtivos;
	}
}
