package persistance;

import java.util.List;
import modele.Client;

/**
 * Interface permettant d'enregistrer et de modifier les informations relatives
 * aux clients dans la base de données
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public interface ClientDAO {

	// Contrats : Création, récupération et suppression d'un client

	public void enregistrerClient(Client client);

	public Client identifierClientParID(int idClient);

	public void supprimerClient(int idClient);

	// Contrats : modification des informations d'un client

	public void modifierAdresseClient(Client client, String nouvelleAdresse);

	public void modifierCodePostalClient(Client client, String codePostalClient);

	public void modifierVilleClient(Client client, String villeClient);

	public void modifierTelClient(Client client, String telClient);

	// Contrat : Afficher liste des clients

	public List<Client> trouverTousLesClients();

}
