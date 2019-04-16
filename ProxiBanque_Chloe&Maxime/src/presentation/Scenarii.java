package presentation;

import java.util.Scanner;

import modele.Client;
import modele.ClientParticulier;
import service.ClientService;
import service.CompteService;
import service.ServiceImplementation;

/**
 * 
 * Attributs et m�thodes permettant l'interaction du programme avec
 * l'utilisateur
 * 
 * @author Chlo� Spinnato & Maxime Melikian
 *
 */
public class Scenarii {

	// Initialisation

	Scanner scan = new Scanner(System.in); // g�n�re le scanner
	ClientService clientservice = new ServiceImplementation();
	CompteService compteservice = new ServiceImplementation();

	// Dire bonjour au client

	public void direBonjour() {

		System.out.println("Bienvenue sur www.proxibanque.com");
		System.out.println("La banque qui vous aime mais surtout qui aime votre argent.");
	}

	// Acc�de au menu principal

	public void menuPrincipal() {

		System.out.println("");
		System.out.println("Que pouvons nous faire pous vous aidez ?");
		System.out.println("Menu Principal. Vous �tes :");
		System.out.println("A. Un particulier B. Une entreprise C. Un admnistrateur");

		String reponse = scan.nextLine();

		switch (reponse) {

		case "A":
			System.out.println("");
			System.out.println("Menu Client Particulier : que souhaitez vous faire ?");

			Scenarii Scenario0 = new Scenarii();
			Scenario0.menuPrincipalClientParticulier();
			break;

		case "B":
			System.out.println("Application entreprise en cours de d�veloppement");
			System.out.println("D�sol� : Bient�t disponible");
			Scenarii Scenario1 = new Scenarii();
			Scenario1.menuPrincipalAdministrateur();
			break;

		case "C":
			System.out.println("");
			System.out.println("Menu Administrateur : que souhaitez vous faire ?");
			Scenarii Scenario2 = new Scenarii();
			Scenario2.menuPrincipalAdministrateur();
			break;

		default:
			Scenarii Scenario3 = new Scenarii();
			Scenario3.menuPrincipal();
			break;
		}

	}

	// Menu principal pour un client particulier

	public void menuPrincipalClientParticulier() {
		System.out.println("1. Cr�er un compte 2. Effectuer un virement");
		System.out.println("3. Retour au menu principal 4. Quitter");
		System.out.println("");

		int reponse = scan.nextInt();

		// Acc�de au choix de l'utilisateur

		switch (reponse) {
		case 1:
			Scenarii Scenario1 = new Scenarii();
			Scenario1.creerCompteClient(); // Cr�e un compte
			Scenario1.menuPrincipalClientParticulier(); // Retour menu
			break;

		case 2:
			Scenarii Scenario2 = new Scenarii();
			Scenario2.effectuerVirement(); // M�thode � cr�er
			System.out.println("Application en cours de d�veloppement");
			Scenario2.menuPrincipalClientParticulier();
			break;

		case 3:
			Scenarii Scenario3 = new Scenarii();
			Scenario3.menuPrincipal();
			break;

		case 4:
			System.out.println("Au revoir cher client(e), � bient�t chez www.proxibanque.com");
			System.out.println("Parlez de nous en bien � tous vos amis !");
			break;

		default:
			Scenarii Scenario4 = new Scenarii();
			Scenario4.menuPrincipal();
			break;

		}

	}

	// Cr�ation d'un compte client

	public void creerCompteClient() {

		// Renseignement infos client

		System.out.println("Renseignez votre pr�nom");
		String prenomInput = scan.nextLine();
		System.out.println("Renseignez votre nom");
		String nomInput = scan.nextLine();
		System.out.println("Renseignez votre adresse");
		String adresseInput = scan.nextLine();
		System.out.println("Renseignez votre code postal");
		String codeInput = scan.nextLine();
		System.out.println("Renseignez votre ville");
		String villeInput = scan.nextLine();
		System.out.println("Renseignez votre num�ro de t�l�phone");
		String telInput = scan.nextLine();

		Client client0 = new ClientParticulier(prenomInput, nomInput, adresseInput, codeInput, villeInput, telInput);

		// Ajout client dans base de donn�es

		clientservice.ajouterClient(client0);

		String adresseClient0 = client0.getAdresseClient();
		int numClient0 = client0.getIdClient();
		System.out.println(adresseClient0);
		System.out.println("F�licitation vous avez �t� inscrit avec succ�s !");
		System.out.println("Bienvenue parmi nous chez Proxibanque !!!");
		System.out.println("Votre num�ro de client est le : " + numClient0);
		System.out.println("Retenez-le bien sinon vous perdrez votre argent !");
		System.out.println("");

	}

	// M�thode � compl�ter

	public void effectuerVirement() {
	}

	// Menu principal administrateur : en cours de d�veloppement

	public void menuPrincipalAdministrateur() {
		System.out.println("1. Effectuer un audit 2. Retour au menu principal");
		System.out.println("3. Quitter");
		System.out.println("");

		int reponse = scan.nextInt();

		switch (reponse) {
		case 1:
			Scenarii Scenario1 = new Scenarii();
			System.out.println("Application en cours de d�veloppement.");
			System.out.println("D�sol� : Bient�t disponible");
			Scenario1.menuPrincipalAdministrateur(); // Retour menu

		case 2:
			Scenarii Scenario2 = new Scenarii();
			Scenario2.menuPrincipal();
			break;

		case 3:
			System.out.println("Au revoir cher client(e), � bient�t chez www.proxibanque.com");
			System.out.println("Parlez de nous en bien � tous vos amis !");
			break;

		default:
			Scenarii Scenario4 = new Scenarii();
			Scenario4.menuPrincipal();
			break;

		}
	}

}