package metier;

import java.util.HashMap;
import java.util.Map.Entry;

import beans.Utilisateur;

public class GuestUsers {

	protected HashMap<String, Utilisateur> lesUtilisateurs;
	protected static GuestUsers instance;
	protected long idUser;

	private GuestUsers() {
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

	public static GuestUsers getInstance() {
		if (instance == null) {
			instance = new GuestUsers();
		}
		return instance;
	}

	public Utilisateur loadUser(String login, String pass)
	{
		Utilisateur findUtilisateur = null;
		
		for(Entry<String, Utilisateur> utilisateurEntry : lesUtilisateurs.entrySet())
		{	
			if(utilisateurEntry.getValue().getLogin().equals(login) && utilisateurEntry.getValue().getPass().equals(login))
			{
				findUtilisateur = utilisateurEntry.getValue();
			}
		}
		
		return findUtilisateur;
	}
	
	

}
