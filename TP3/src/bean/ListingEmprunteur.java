package bean;

import java.util.HashMap;

public class ListingEmprunteur {

	// ATTRIBUTS /////////////////////////////////////////////
	protected HashMap<String, Personne> listePersonne;

	// GETTER & SETTER ///////////////////////////////////////
	public HashMap<String, Personne> getListePersonne() {
		return listePersonne;
	}

	public void setListePersonne(HashMap<String, Personne> listePersonne) {
		this.listePersonne = listePersonne;
	}

}
