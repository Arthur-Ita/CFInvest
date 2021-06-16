package br.com.cfinvest.junit;

import java.util.ArrayList;

import org.junit.Test;

import br.com.cfinvest.dao.UsuarioDao;
import br.com.cfinvest.model.Carteira;
import br.com.cfinvest.model.Fii;
import br.com.cfinvest.model.Usuario;

public class UsuarioDaoTest {

	@Test
	public void createTest() {
		UsuarioDao usrDao = new UsuarioDao();
		Usuario usr = new Usuario();
		usr.setUsername("Teste2");
		usr.setPassword("321");
		usr.setCarteira(new Carteira());
		usr.getCarteira().setFundos(new ArrayList<Fii>());
		usrDao.create(usr);
	}
}
