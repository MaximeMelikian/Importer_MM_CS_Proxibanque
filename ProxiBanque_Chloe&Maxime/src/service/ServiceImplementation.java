package service;

import java.util.List;

import modele.Client;
import modele.Compte;
import modele.CompteCourant;
import modele.CompteEpargne;
import persistance.ClientDAO;
import persistance.CompteDAO;
import persistance.MemoryClientDAO;
import persistance.MemoryCompteDAO;

/**
 * Attributs et méthodes permettant d'implémenter les règles métier relatives
 * aux clients et à leurs comptes, et fait la connexion entre les couches
 * presentation et persistance
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public class ServiceImplementation implements ClientService, CompteService/* , CarteService */ {

	// Attributs
	
	private ClientDAO daoClient = new MemoryClientDAO();
	private CompteDAO daoCompte = new MemoryCompteDAO();

	// Méthodes relatives au Client

	@Override
	public void ajouterClient(Client client) {
		if (client != null) {
			daoClient.enregistrerClient(client);
		}
	}

	@Override
	public Client trouverClientParID(int idClient) {
		return daoClient.identifierClientParID(idClient);
	}

	@Override
	public void modifierAdresse(int idClient, String adresse) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierAdresseClient(client, adresse);
	}

	@Override
	public void modifierCodePostalClient(int idClient, String codePostalClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierCodePostalClient(client, codePostalClient);
	}

	@Override
	public void modifierVilleClient(int idClient, String villeClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierVilleClient(client, villeClient);
	}

	@Override
	public void modifierTelClient(int idClient, String telClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierTelClient(client, telClient);
	}

	@Override
	public List<Client> listerLesClients() {
		return daoClient.trouverTousLesClients();
	}

	@Override
	public void supprimerClient(Client client) {
		// Supprimer client
		daoClient.supprimerClient(client.getIdClient());
		// Récupérer les comptes associés
		Compte compteCourantAssocie = client.getCompteC();
		Compte compteEpargneAssocie = client.getCompteE();
		// Supprimer comptes
		daoCompte.supprimerCompte(compteCourantAssocie.getIdCompte());
		daoCompte.supprimerCompte(compteEpargneAssocie.getIdCompte());
	}

	// Méthodes relatives au Compte

	@Override
	public void ajouterCompteCourant(Compte compteC) {
		if (compteC != null) {
			daoCompte.creerCompteCourant(compteC);
		}
	}

	@Override
	public void ajouterCompteEpargne(Compte compteE) {
		if (compteE != null) {
			daoCompte.creerCompteEpargne(compteE);
		}
	}

	@Override
	public Compte trouverCompteParID(int idCompte) {
		return daoCompte.identifierCompteParID(idCompte);
	}

	@Override
	public void passerVirement(double montant, Compte emetteur, Compte recepteur) {

		double nouveauMontantEmetteur = emetteur.getSoldeCompte() - montant;
		emetteur.setSoldeCompte(nouveauMontantEmetteur);

		double nouveauMontantRecepteur = recepteur.getSoldeCompte() + montant;
		recepteur.setSoldeCompte(nouveauMontantRecepteur);

	}

	@Override
	public List<Compte> obtenirTousLesComptes() {
		return daoCompte.trouverTousLesComptes();
	}

}
