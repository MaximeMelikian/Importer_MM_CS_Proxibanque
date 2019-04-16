package modele;

/**
 * Attributs et méthodes relatifs aux Clients Particuliers de ProxiBanque
 * 
 * @author Chloé Spinnato & Maxime Melikian
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

	// Méthodes

	/**
	 * Méthode permettant d'auditer les comptes des clients particuliers : Affiche
	 * un message lorsque le débit est supérieur à 5000 €
	 */
	@Override
	public void auditerCompte(Compte compte) {
		if (compte.isCompteCourant() == true) {
			nomCompte = "courant";
		} else {
			nomCompte = "épargne";
		}
		if (compte.getSoldeCompte() < -5000) {
			System.out.println("Attention ! Le compte " + nomCompte + " Particulier de " + this.getPrenom() + " "
					+ this.getNomClient() + " est débiteur de " + compte.getSoldeCompte() + " €");
		}
	}

}
