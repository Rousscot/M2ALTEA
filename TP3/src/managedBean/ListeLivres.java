package managedBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Livre;
import metier.MetierCatalogue;

@ManagedBean(name = "listeLivres")
@SessionScoped
public class ListeLivres {

	protected List<Livre> livres;
	protected Map<Long, Boolean> checkedElements;
	protected String login;

	public String emprunterLivres() {
		for (Livre livre : getLivresNonEmpruntes()) {
			if (checkedElements.get(livre.getId()) != null && checkedElements.get(livre.getId())) {
				livre.setEmprunteur(login);
			}
		}
		return "listeLivres.jsf";
	}

	public ListeLivres() {
		livres = getLivresNonEmpruntes();
		checkedElements = new HashMap<>();
	}

	public List<Livre> getLivresNonEmpruntes() {
		return MetierCatalogue.getLivreNonEmprunte();
	}

	public List<Livre> getLivres() {
		return getLivresNonEmpruntes();
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	public Map<Long, Boolean> getCheckedElements() {
		return checkedElements;
	}

	public void setCheckedElements(Map<Long, Boolean> checkedElements) {
		this.checkedElements = checkedElements;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
