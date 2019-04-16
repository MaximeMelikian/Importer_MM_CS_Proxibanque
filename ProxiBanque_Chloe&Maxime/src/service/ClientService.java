package service;

import java.util.List;

import modele.Client;

/**
 * Interface permettant d'impl�menter les r�gles m�tier relatives
 * aux clients
 * 
 * @author Chlo� Spinnato & Maxime Melikian
 *
 */
public interface ClientService {

	public void ajouterClient(Client client);

	public Client trouverClientParID(int idClient);

	public void modifierAdresse(int idClient, String adresse);

	public void modifierCodePostalClient(int idClient, String codePostalClient);

	public void modifierVilleClient(int idClient, String villeClient);

	public void modifierTelClient(int idClient, String telClient);

	public List<Client> listerLesClients();

	public void supprimerClient(Client client);

}
