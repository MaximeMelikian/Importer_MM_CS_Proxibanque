package modele;

/**
 * Attributs et m�thodes relatifs aux Clients Particuliers de ProxiBanque
 * 
 * @author Chlo� Spinnato & Maxime Melikian
 *
 */
public class ClientParticulier extends Client {

	// Attributs

	private String nomCompte;

	// Constructeurs

	public ClientParticulier(String prenom, String nomClient, String adresseClient, String codePostalClient,
			String villeClient, String telephoneClient) {
		super(prenom, nomClient, adresseClient, codePostalClient, villeClient, telephoneClient);
	}

	// M�thodes

	/**
	 * M�thode permettant d'auditer les comptes des clients particuliers : Affiche
	 * un message lorsque le d�bit est sup�rieur � 5000 �
	 */
	@Override
	public void auditerCompte(Compte compte) {
		if (compte.isCompteCourant() == true) {
			nomCompte = "courant";
		} else {
			nomCompte = "�pargne";
		}
		if (compte.getSoldeCompte() < -5000) {
			System.out.println("Attention ! Le compte " + nomCompte + " Particulier de " + this.getPrenom() + " "
					+ this.getNomClient() + " est d�biteur de " + compte.getSoldeCompte() + " �");
		}
	}

}
