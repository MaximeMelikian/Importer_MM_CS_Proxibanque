package presentation;

import java.util.Scanner;

import modele.Client;
import modele.ClientParticulier;
import service.ClientService;
import service.CompteService;
import service.ServiceImplementation;

/**
 * 
 * Attributs et méthodes permettant l'interaction du programme avec
 * l'utilisateur
 * 
 * @author Chloé Spinnato & Maxime Melikian
 *
 */
public class Scenarii {

	// Initialisation

	Scanner scan = new Scanner(System.in); // génère le scanner
	ClientService clientservice = new ServiceImplementation();
	CompteService compteservice = new ServiceImplementation();

	// Dire bonjour au client

	public void direBonjour() {

		System.out.println("Bienvenue sur www.proxibanque.com");
		System.out.println("La banque qui vous aime mais surtout qui aime votre argent.");
	}

	// Accède au menu principal

	public void menuPrincipal() {

		System.out.println("");
		System.out.println("Que pouvons nous faire pous vous aidez ?");
		System.out.println("Menu Principal. Vous êtes :");
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
			System.out.println("Application entreprise en cours de développement");
			System.out.println("Désolé : Bientôt disponible");
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
		System.out.println("1. Créer un compte 2. Effectuer un virement");
		System.out.println("3. Retour au menu principal 4. Quitter");
		System.out.println("");

		int reponse = scan.nextInt();

		// Accède au choix de l'utilisateur

		switch (reponse) {
		case 1:
			Scenarii Scenario1 = new Scenarii();
			Scenario1.creerCompteClient(); // Crée un compte
			Scenario1.menuPrincipalClientParticulier(); // Retour menu
			break;

		case 2:
			Scenarii Scenario2 = new Scenarii();
			Scenario2.effectuerVirement(); // Méthode à créer
			System.out.println("Application en cours de développement");
			Scenario2.menuPrincipalClientParticulier();
			break;

		case 3:
			Scenarii Scenario3 = new Scenarii();
			Scenario3.menuPrincipal();
			break;

		case 4:
			System.out.println("Au revoir cher client(e), à bientôt chez www.proxibanque.com");
			System.out.println("Parlez de nous en bien à tous vos amis !");
			break;

		default:
			Scenarii Scenario4 = new Scenarii();
			Scenario4.menuPrincipal();
			break;

		}

	}

	// Création d'un compte client

	public void creerCompteClient() {

		// Renseignement infos client

		System.out.println("Renseignez votre prénom");
		String prenomInput = scan.nextLine();
		System.out.println("Renseignez votre nom");
		String nomInput = scan.nextLine();
		System.out.println("Renseignez votre adresse");
		String adresseInput = scan.nextLine();
		System.out.println("Renseignez votre code postal");
		String codeInput = scan.nextLine();
		System.out.println("Renseignez votre ville");
		String villeInput = scan.nextLine();
		System.out.println("Renseignez votre numéro de téléphone");
		String telInput = scan.nextLine();

		Client client0 = new ClientParticulier(prenomInput, nomInput, adresseInput, codeInput, villeInput, telInput);

		// Ajout client dans base de données

		clientservice.ajouterClient(client0);

		String adresseClient0 = client0.getAdresseClient();
		int numClient0 = client0.getIdClient();
		System.out.println(adresseClient0);
		System.out.println("Félicitation vous avez été inscrit avec succès !");
		System.out.println("Bienvenue parmi nous chez Proxibanque !!!");
		System.out.println("Votre numéro de client est le : " + numClient0);
		System.out.println("Retenez-le bien sinon vous perdrez votre argent !");
		System.out.println("");

	}

	// Méthode à compléter

	public void effectuerVirement() {
	}

	// Menu principal administrateur : en cours de développement

	public void menuPrincipalAdministrateur() {
		System.out.println("1. Effectuer un audit 2. Retour au menu principal");
		System.out.println("3. Quitter");
		System.out.println("");

		int reponse = scan.nextInt();

		switch (reponse) {
		case 1:
			Scenarii Scenario1 = new Scenarii();
			System.out.println("Application en cours de développement.");
			System.out.println("Désolé : Bientôt disponible");
			Scenario1.menuPrincipalAdministrateur(); // Retour menu

		case 2:
			Scenarii Scenario2 = new Scenarii();
			Scenario2.menuPrincipal();
			break;

		case 3:
			System.out.println("Au revoir cher client(e), à bientôt chez www.proxibanque.com");
			System.out.println("Parlez de nous en bien à tous vos amis !");
			break;

		default:
			Scenarii Scenario4 = new Scenarii();
			Scenario4.menuPrincipal();
			break;

		}
	}

}