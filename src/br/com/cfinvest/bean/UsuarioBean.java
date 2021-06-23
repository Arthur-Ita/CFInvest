package br.com.cfinvest.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.cfinvest.dao.UsuarioDao;
import br.com.cfinvest.model.Usuario;

@ManagedBean(name="usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usr;
	private String login;
	private String senha;
	private UsuarioDao usrDao = new UsuarioDao();
	
	public Usuario getUsr() {
		return usr;
	}
	public void setUsr(Usuario usr) {
		this.usr = usr;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public UsuarioDao getUsrDao() {
		return usrDao;
	}
	public void setUsrDao(UsuarioDao usrDao) {
		this.usrDao = usrDao;
	}
	
	public String logIn() {
		usr = usrDao.buscarPorUsername(login);
		if(usr == null) {
			return "erroLocalizaUsuario.jsf?faces-redirect=true";
		}else {
			if(usr.getPassword().equals(senha)) {
				return "main?faces-redirect=true";
			}else {
				return "erroLocalizaUsuario.jsf?faces-redirect=true";
			}
		}
	}
	
}
