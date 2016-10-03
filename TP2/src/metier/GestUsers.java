package metier;

import java.util.HashMap;

import bean.Utilisateur;

public class GestUsers {

	protected HashMap<String, Utilisateur> lesUtilisateurs;

	protected static GestUsers current;

	protected Integer idUser;

	private GestUsers() {
		lesUtilisateurs = new HashMap<String, Utilisateur>();
		Utilisateur root = new Utilisateur();
		root.setIdUser(idUser++);
		root.setLogin("root");
		root.setPass("root");
		root.setEmail("root@yahoo.fr");
		root.setVille("marseille");

		Utilisateur guest = new Utilisateur();
		guest.setIdUser(idUser++);
		guest.setLogin("guest");
		guest.setPass("guest");
		guest.setEmail("guest@yahoo.fr");
		guest.setVille("lille");
		lesUtilisateurs.put(root.getLogin() + "¤" + root.getPass(), root);
		lesUtilisateurs.put(guest.getLogin() + "¤" + guest.getPass(), guest);
	}

	public static GestUsers getInstance() {
		if (current == null) {
			current = new GestUsers();
		}
		return current;
	}

	public HashMap<String, Utilisateur> getLesUtilisateurs() {
		return lesUtilisateurs;
	}

	public void setLesUtilisateurs(HashMap<String, Utilisateur> lesUtilisateurs) {
		this.lesUtilisateurs = lesUtilisateurs;
	}

	public GestUsers getCurrent() {
		return current;
	}

	public void setCurrent(GestUsers current) {
		GestUsers.current = current;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

}
