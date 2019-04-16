package persistance;

import java.util.List;

import modele.Compte;
import modele.CompteCourant;
import modele.CompteEpargne;

/**
 * Interface permettant d'enregistrer et de modifier les informations relatives
 * aux comptes dans la base de donn�es
 * 
 * @author Chlo� Spinnato & Maxime Melikian
 *
 */
public interface CompteDAO {

	// Contrats : Cr�ation comptes, virements et suppression de comptes

	public void creerCompteCourant(Compte compteCourant);

	public void creerCompteEpargne(Compte compteEpargne);

	public Compte identifierCompteParID(int idCompte);

	public void supprimerCompte(int idCompte);

	// Contrat : Afficher liste des comptes

	public List<Compte> trouverTousLesComptes();
}
