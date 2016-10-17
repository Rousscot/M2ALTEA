package managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import metier.MetierPersonnes;

@ManagedBean(name = "login")
@SessionScoped
public class Login {

	// ATTRIBUTS ////////////////////////////////////
	protected String login;
	protected String password;

	// GETTER & SETTER //////////////////////////////
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// FONCTIONS ///////////////////////////////////
	public String validate() {
		return (MetierPersonnes.getPersonne(login, password) != null) ? "success" : "error";
	}

}
