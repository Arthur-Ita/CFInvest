package br.com.cfinvest.junit;

import java.util.List;

import org.junit.Test;

import br.com.cfinvest.controller.CotacaoController;
import br.com.cfinvest.model.Fii;

public class CotacaoControllerTest {

	@Test
	public void buscarCotacaoTest() {
		CotacaoController cc = new CotacaoController();
		List<Fii> fiis = cc.buscarCotacao();
		for(Fii f:fiis) {
			System.out.println(f.getCodigo());
		}
	}
}
