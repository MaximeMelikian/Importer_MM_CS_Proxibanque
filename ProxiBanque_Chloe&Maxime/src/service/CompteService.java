package service;

import java.util.List;

import modele.Compte;
import modele.CompteCourant;
import modele.CompteEpargne;

/**
 * Interface permettant d'impl�menter les r�gles m�tier relatives
 * aux comptes
 * 
 * @author Chlo� Spinnato & Maxime Melikian
 *
 */
public interface CompteService {

	public void ajouterCompteCourant(Compte compteC);

	public void ajouterCompteEpargne(Compte compteE);

	public Compte trouverCompteParID(int idCompte);

	public List<Compte> obtenirTousLesComptes();

	public void passerVirement(double montant, Compte emetteur, Compte recepteur);

}
