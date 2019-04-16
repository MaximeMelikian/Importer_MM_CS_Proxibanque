package modele;

/**
 * Attributs et méthodes relatifs aux Clients Entreprises de ProxiBanque
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public class ClientEntreprise extends Client {

	// Attributs

	private String nomCompte;

	// Constructeur

	public ClientEntreprise(String nomClient, String adresseClient, String codePostalClient, String villeClient,
			String telephoneClient) {
		super(nomClient, adresseClient, codePostalClient, villeClient, telephoneClient);
	}

	// Méthodes

	/**
	 * Méthode permettant d'auditer les comptes des clients entreprises :
	 * Affiche un message lorsque le débit est supérieur à 50000 € 
	 */
	@Override
	public void auditerCompte(Compte compte) {
		if (compte.isCompteCourant() == true) {
			nomCompte = "courant";
		} else {
			nomCompte = "épargne";
		}
		if (compte.getSoldeCompte() < -50000) {
			System.out.println("Attention ! Le compte " + nomCompte + " Entreprise de " + this.getNomClient()
					+ " est débiteur de " + compte.getSoldeCompte() + " €");
		}
	}

}
