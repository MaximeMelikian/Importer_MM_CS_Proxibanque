package service;

import java.util.List;

import modele.Compte;
import modele.CompteCourant;
import modele.CompteEpargne;

/**
 * Interface permettant d'implémenter les règles métier relatives
 * aux comptes
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public interface CompteService {

	public void ajouterCompteCourant(Compte compteC);

	public void ajouterCompteEpargne(Compte compteE);

	public Compte trouverCompteParID(int idCompte);

	public List<Compte> obtenirTousLesComptes();

	public void passerVirement(double montant, Compte emetteur, Compte recepteur);

}
