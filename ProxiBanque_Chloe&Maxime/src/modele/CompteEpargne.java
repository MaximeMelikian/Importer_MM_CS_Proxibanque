package modele;

/**
 * Attributs et m�thodes relatifs aux Comptes �pargne des clients de
 * ProxiBanque
 * 
 * @author Chlo� Spinnato & Maxime Melikian
 *
 */
public class CompteEpargne extends Compte {

	// Attribut
	
	private static final double TAUXREMUNERATIONDEFAUT = 0.03;
	
	// Constructeur
	
	public CompteEpargne(boolean compteCourant,long soldeCompte, String dateOuvertureCompte) {
		super(false, soldeCompte, dateOuvertureCompte);
	}

	// Getter

	public static double getTauxremunerationdefaut() {
		return TAUXREMUNERATIONDEFAUT;
	}
	
}
