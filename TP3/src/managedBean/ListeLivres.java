package managedBean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bean.Livre;
import metier.MetierCatalogue;

@ManagedBean(name = "listeLivres")
@SessionScoped
public class ListeLivres {

	public List<Livre> getLlivre(){
		return MetierCatalogue.getLivreNonEmprunte();
	}
	
}
