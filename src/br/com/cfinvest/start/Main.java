package br.com.cfinvest.start;

import java.util.List;

import br.com.cfinvest.controller.CotacaoController;
import br.com.cfinvest.model.Fii;

public class Main {

	public static void main(String[] args) {
		CotacaoController cc = new CotacaoController();
		List<Fii> fiis = cc.buscarCotacao();
		for(Fii f:fiis) {
			System.out.println(f.getCodigo());
		}
	}

}
