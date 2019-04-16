package modele;

/**
 * Attributs et méthodes relatifs aux Comptes des clients de ProxiBanque
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public class Compte {

	// Attributs

	private int idCompte;
	private double soldeCompte;
	private String dateOuvertureCompte;
	private Client clientAssocie;
	private boolean compteCourant;

	// Constructeurs

	public Compte(Client clientAssocie) {
		super();
		this.clientAssocie = clientAssocie;
	}

	public Compte(int idCompte) {
		super();
		this.idCompte = idCompte;
	}

	public Compte(double soldeCompte, String dateOuvertureCompte, boolean compteCourant) {
		super();
		this.soldeCompte = soldeCompte;
		this.dateOuvertureCompte = dateOuvertureCompte;
		this.compteCourant = true;
	}

	public Compte(boolean compteCourant, double soldeCompte, String dateOuvertureCompte) {
		super();
		this.compteCourant = compteCourant;
		this.soldeCompte = soldeCompte;
		this.dateOuvertureCompte = dateOuvertureCompte;
		this.compteCourant = false;
	}

	// Getters & Setters

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public String getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}

	public void setDateOuvertureCompte(String dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}

	public Client getClientAssocie() {
		return clientAssocie;
	}

	public void setClientAssocie(Client clientAssocie) {
		this.clientAssocie = clientAssocie;
	}

	public boolean isCompteCourant() {
		return compteCourant;
	}

	// Méthodes

	/**
	 * Affiche les valeurs des attributs d'un compte
	 */
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", soldeCompte=" + soldeCompte + ", dateOuvertureCompte="
				+ dateOuvertureCompte + "]";
	}

}
