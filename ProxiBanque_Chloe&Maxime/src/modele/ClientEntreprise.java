package modele;

/**
 * Attributs et m�thodes relatifs aux Clients Entreprises de ProxiBanque
 * 
 * @author Chlo� Spinnato & Maxime Melikian
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

	// M�thodes

	/**
	 * M�thode permettant d'auditer les comptes des clients entreprises :
	 * Affiche un message lorsque le d�bit est sup�rieur � 50000 � 
	 */
	@Override
	public void auditerCompte(Compte compte) {
		if (compte.isCompteCourant() == true) {
			nomCompte = "courant";
		} else {
			nomCompte = "�pargne";
		}
		if (compte.getSoldeCompte() < -50000) {
			System.out.println("Attention ! Le compte " + nomCompte + " Entreprise de " + this.getNomClient()
					+ " est d�biteur de " + compte.getSoldeCompte() + " �");
		}
	}

}
