package persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modele.Compte;
import modele.CompteCourant;
import modele.CompteEpargne;

/**
 * Attributs et m�thodes permettant de cr�er et mettre � jour la base de donn�es
 * des comptes appartenant aux clients
 * 
 * @author Chlo� Spinnato & Maxime Melikian
 */
public class MemoryCompteDAO implements CompteDAO {

	// Attributs

	private static final Map<Integer, Compte> BDDCOMPTE = new HashMap<>();

	private static int pk = 0;

	// M�thodes : Cr�ation comptes, virements et suppression de comptes

	@Override
	public void creerCompteCourant(Compte compteCourant) {

		compteCourant.setIdCompte(pk);
		BDDCOMPTE.put(compteCourant.getIdCompte(), compteCourant);
		pk++;

	}

	@Override
	public void creerCompteEpargne(Compte compteEpargne) {

		compteEpargne.setIdCompte(pk);
		BDDCOMPTE.put(compteEpargne.getIdCompte(), compteEpargne);
		pk++;

	}

	@Override
	public Compte identifierCompteParID(int idCompte) {
		return BDDCOMPTE.get(idCompte);
	}

	// Supprimer comptes

	@Override
	public void supprimerCompte(int idCompte) {
		BDDCOMPTE.remove(idCompte);
	}

	// G�n�re liste des comptes

	@Override
	public List<Compte> trouverTousLesComptes() {
		return new ArrayList<>(BDDCOMPTE.values());
	}

}
