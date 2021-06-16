package br.com.cfinvest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import br.com.cfinvest.model.Cotacao;
import br.com.cfinvest.model.Fii;

public class CotacaoController {

	public List<Fii> buscarCotacao() {
		List<Fii> fiis = new ArrayList<Fii>();
		
		try {
			Document doc = Jsoup.connect("https://www.fundsexplorer.com.br/ranking").get();
			Elements table = doc.body().getElementsByTag("td");
			Iterator<Element> it = table.iterator();
			fiis = new ArrayList<Fii>();
			while(it.hasNext()) {
				Fii fii = new Fii();
				Element element = (Element) it.next();
				fii.setCodigo(element.text());
				element = (Element) it.next();
				fii.setSetor(element.text());
				element = (Element) it.next();
				fii.setCotacao(new ArrayList<Cotacao>());
				Cotacao cotacao = new Cotacao();
				cotacao.setData(new Date());
				cotacao.setPrecoAtual(element.text());
				element = (Element) it.next();
				cotacao.setLiquidezDiaria(element.text());
				element = (Element) it.next();
				cotacao.setDividendo(element.text());
				element = (Element) it.next();
				cotacao.setDividendYield(element.text());
				element = (Element) it.next();
				cotacao.setDy3ac(element.text());
				element = (Element) it.next();
				cotacao.setDy6ac(element.text());
				element = (Element) it.next();
				cotacao.setDy12ac(element.text());
				element = (Element) it.next();
				cotacao.setDy3m(element.text());
				element = (Element) it.next();
				cotacao.setDy6m(element.text());
				element = (Element) it.next();
				cotacao.setDy12m(element.text());
				element = (Element) it.next();
				cotacao.setDyAno(element.text());
				element = (Element) it.next();
				cotacao.setVariacaoPreco(element.text());
				element = (Element) it.next();
				cotacao.setRentPeriodo(element.text());
				element = (Element) it.next();
				cotacao.setRentAcumulada(element.text());
				element = (Element) it.next();
				cotacao.setPatLiquido(element.text());
				element = (Element) it.next();
				cotacao.setVpa(element.text());
				element = (Element) it.next();
				cotacao.setPvpa(element.text());
				element = (Element) it.next();
				cotacao.setDyPatrimonial(element.text());
				element = (Element) it.next();
				cotacao.setVarPatrimonial(element.text());
				element = (Element) it.next();
				cotacao.setRentPatPeriodo(element.text());
				element = (Element) it.next();
				cotacao.setRentPatAc(element.text());
				element = (Element) it.next();
				cotacao.setVacanciaFisica(element.text());
				element = (Element) it.next();
				cotacao.setVacanciaFinanceira(element.text());
				element = (Element) it.next();
				cotacao.setQuantAtivos(element.text());
				fii.getCotacao().add(cotacao);
				fiis.add(fii);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível atualizar a cotação!\n"+e.getMessage());
		}
		return fiis;
	}
}
