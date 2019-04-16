package modele;

/**
 * Attributs et méthodes relatifs aux Comptes courants des clients de
 * ProxiBanque
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public class CompteCourant extends Compte {

	// Attributs

	private String typeCarte; // Visa Electron ou Visa Premier
	private static final int AUTORISATIONDECOUVERT = 1000;

	// Constructeur
	
	public CompteCourant(long soldeCompte, String dateOuvertureCompte, boolean compteCourant, String typeCarte) {
		super(soldeCompte, dateOuvertureCompte, compteCourant);
		this.typeCarte = typeCarte;
	}

	// Getter

	public static int getAutorisationdecouvert() {
		return AUTORISATIONDECOUVERT;
	}

}
