package modele;

/**
 * Attributs et méthodes relatifs aux Clients de ProxiBanque
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public class Client implements AuditComptes {

	// Attributs

	private int idClient;
	private String prenom;
	private String nomClient;
	private String adresseClient;
	private String codePostalClient;
	private String villeClient;
	private String telephoneClient;
	private Compte compteC;
	private Compte compteE;

	// Constructeur(s)

	public Client(String nomClient, String adresseClient, String codePostalClient, String villeClient,
			String telephoneClient) {
		super();
		this.nomClient = nomClient;
		this.adresseClient = adresseClient;
		this.codePostalClient = codePostalClient;
		this.villeClient = villeClient;
		this.telephoneClient = telephoneClient;
	}

	public Client(String prenom, String nomClient, String adresseClient, String codePostalClient, String villeClient,
			String telephoneClient) {
		super();
		this.prenom = prenom;
		this.nomClient = nomClient;
		this.adresseClient = adresseClient;
		this.codePostalClient = codePostalClient;
		this.villeClient = villeClient;
		this.telephoneClient = telephoneClient;
	}

	// Getters & Setters

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public String getCodePostalClient() {
		return codePostalClient;
	}

	public void setCodePostalClient(String codePostalClient) {
		this.codePostalClient = codePostalClient;
	}

	public String getVilleClient() {
		return villeClient;
	}

	public void setVilleClient(String villeClient) {
		this.villeClient = villeClient;
	}

	public String getTelephoneClient() {
		return telephoneClient;
	}

	public void setTelephoneClient(String telephoneClient) {
		this.telephoneClient = telephoneClient;
	}

	public Compte getCompteC() {
		return compteC;
	}

	public void setCompteC(Compte compteC) {
		this.compteC = compteC;
	}

	public Compte getCompteE() {
		return compteE;
	}

	public void setCompteE(Compte compteE) {
		this.compteE = compteE;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// Méthodes

	
	/**
	 * Affiche l'identifiant et le nom du client
	 */
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + "]";
	}

	/**
	 * Contrat : audit des comptes entreprises ou particuliers
	 */
	@Override
	public void auditerCompte(Compte compte) {
	}

}
