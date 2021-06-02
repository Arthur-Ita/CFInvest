package br.com.cfinvest.model;

import java.util.List;

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
	@OneToMany()
	private List<Fii> fundos;
}
