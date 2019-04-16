package persistance;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import persistance.*;

import modele.Client;

/**
 * Attributs et méthodes permettant de créer et mettre à jour la base de données
 * des clients
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public class MemoryClientDAO implements ClientDAO {

	// Attributs
	
	private static final Map<Integer, Client> BDDCLIENT = new HashMap<>();

	private static int pk = 0;

	// Méthodes : Création, récupération et suppression d'un client

	@Override
	public void enregistrerClient(Client client) {

		client.setIdClient(pk);
		BDDCLIENT.put(client.getIdClient(), client);
		pk++;

	}

	@Override
	public Client identifierClientParID(int idClient) {
		return BDDCLIENT.get(idClient);
	}

	@Override
	public void supprimerClient(int idClient) {
		BDDCLIENT.remove(idClient);
	}

	// Méthodes : modification des informations d'un client

	@Override
	public void modifierAdresseClient(Client client, String nouvelleAdresse) {
		client.setAdresseClient(nouvelleAdresse);
	}

	@Override
	public void modifierCodePostalClient(Client client, String nouveauCodePostalClient) {
		client.setCodePostalClient(nouveauCodePostalClient);
	}

	@Override
	public void modifierVilleClient(Client client, String nouvelleVilleClient) {
		client.setVilleClient(nouvelleVilleClient);
	}

	@Override
	public void modifierTelClient(Client client, String nouveauTelClient) {
		client.setTelephoneClient(nouveauTelClient);
	}
	
	// Génère la liste des clients
	
	@Override
	public List<Client> trouverTousLesClients() {
		return new ArrayList<>(BDDCLIENT.values());
	}

}
