package presentation;

import java.util.Scanner;

import modele.Client;
import modele.ClientEntreprise;
import modele.ClientParticulier;
import modele.Compte;
import modele.CompteCourant;
import modele.CompteEpargne;
import service.ClientService;
import service.CompteService;
import service.ServiceImplementation;

/**
 * Cr�ation de plusieurs objets clients particuliers et clients entreprises
 * Cr�ation de comptes courants et �pargnes associ�s Op�ration de virement d'un
 * compte �pargne � un compte courant Op�ration d'audit des comptes Simulation
 * d'une interface utilisateur (IHM) permettant d'ajouter un nouveau client
 * 
 * @author Chlo� Spinnato & Maxime Melikian
 *
 */
public class Presentation {

	public static void main(String[] args) {

		// Initialisations

		ClientService clientService = new ServiceImplementation();
		CompteService compteService = new ServiceImplementation();

		// Renseignement informations client

		// Clients particuliers : cr�ation des objets

		int i = 0;
		int n = 6; // On veut cr�er 6 clients particuliers (le 1er est renseign� par l'utilisateur)

		Scanner scan = new Scanner(System.in);
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

		Client clientPart0 = new ClientParticulier(prenomInput, nomInput, adresseInput, codeInput, villeInput,
				telInput);

		Client clientPart1 = new ClientParticulier("Myriam", "Dubourg", "8 rue des plantes", "64000", "Pau",
				"0658974125");

		Client clientPart2 = new ClientParticulier("Jean-Charles", "Duchmul", "35 rue Charlemagne", "75001", "Paris",
				"0785961425");

		Client clientPart3 = new ClientParticulier("Benoit", "De la roserie", "3 avenue des Champs Elysees", "75008",
				"Paris", "0689655852");

		Client clientPart4 = new ClientParticulier("Laure", "Andre", "4 impasse des fleurs batiment B", "75004",
				"Paris", "0678415245");

		Client clientPart5 = new ClientParticulier("Camille", "Dupont", "6 rue Camardou", "64320", "Biarritz",
				"0145632565");

		// Ajout des clients particuliers � la base de donn�es

		clientService.ajouterClient(clientPart0);
		clientService.ajouterClient(clientPart1);
		clientService.ajouterClient(clientPart2);
		clientService.ajouterClient(clientPart3);
		clientService.ajouterClient(clientPart4);
		clientService.ajouterClient(clientPart5);

		System.out.println("Merci " + clientPart0.getPrenom() + " " + clientPart0.getNomClient());

		// Cr�ation de 6 objets : 6 Comptes Courants & 6 Comptes Epargnes

		Compte compteCPart0 = new CompteCourant(-10000, "1er Janvier 2019", true, "Visa Electron");
		Compte compteEPart0 = new CompteEpargne(false, 3500, "3 Avril 2019");

		Compte compteCPart1 = new CompteCourant(-5500, "12 Juin 2018", true, "Visa Premier");
		Compte compteEPart1 = new CompteEpargne(false, 10000, "26 Aout 2018");

		Compte compteCPart2 = new CompteCourant(20003, "11 D�cembre 2001", true, "Visa Electron");
		Compte compteEPart2 = new CompteEpargne(false, 142350, "3 F�vrier 2010");

		Compte compteCPart3 = new CompteCourant(150, "1er Mars 2019", true, "Visa Electron");
		Compte compteEPart3 = new CompteEpargne(false, -6500, "2 Mars 2019");

		Compte compteCPart4 = new CompteCourant(-6200, "1er Janvier 2017", true, "Visa Premier");
		Compte compteEPart4 = new CompteEpargne(false, 5, "3 Janvier 2017");

		Compte compteCPart5 = new CompteCourant(-5001, "25 Octobre 2018", true, "Visa Electron");
		Compte compteEPart5 = new CompteEpargne(false, 3742, "11 D�cembre 2018");

		// Ajout des comptes courants � la BDD

		compteService.ajouterCompteCourant(compteCPart0);
		compteService.ajouterCompteCourant(compteCPart1);
		compteService.ajouterCompteCourant(compteCPart2);
		compteService.ajouterCompteCourant(compteCPart3);
		compteService.ajouterCompteCourant(compteCPart4);
		compteService.ajouterCompteCourant(compteCPart5);

		// Ajout des comptes �pargne � la BDD

		compteService.ajouterCompteEpargne(compteEPart0);
		compteService.ajouterCompteEpargne(compteEPart1);
		compteService.ajouterCompteEpargne(compteEPart2);
		compteService.ajouterCompteEpargne(compteEPart3);
		compteService.ajouterCompteEpargne(compteEPart4);
		compteService.ajouterCompteEpargne(compteEPart5);

		// Association des objets comptes aux objets clients correspondants

		clientPart0.setCompteC(compteCPart0);
		clientPart0.setCompteE(compteEPart0);

		clientPart1.setCompteC(compteCPart1);
		clientPart1.setCompteE(compteEPart1);

		clientPart2.setCompteC(compteCPart2);
		clientPart2.setCompteE(compteEPart2);

		clientPart3.setCompteC(compteCPart3);
		clientPart3.setCompteE(compteEPart3);

		clientPart4.setCompteC(compteCPart4);
		clientPart4.setCompteE(compteEPart4);

		clientPart5.setCompteC(compteCPart5);
		clientPart5.setCompteE(compteEPart5);

		// Virement

		System.out.println("");
		System.out.println("Virement de " + clientPart0.getPrenom() + " " + clientPart0.getNomClient()
				+ " de 1000 � de son compte �pargne vers son compte courant :");
		System.out.println("Soldes avant le virement :");

		// Affiche le montant des soldes avant le virement

		System.out.println("Le solde du compte courant de " + clientPart0.getPrenom() + " " + clientPart0.getNomClient()
				+ " est de " + compteCPart0.getSoldeCompte() + " �");
		System.out.println("Le solde du compte �pargne de " + clientPart0.getPrenom() + " " + clientPart0.getNomClient()
				+ " est de " + compteEPart0.getSoldeCompte() + " �");

		// Appel de la m�thode passerVirement

		compteService.passerVirement(1000, clientPart0.getCompteE(), clientPart0.getCompteC());

		// Affiche le montant des soldes apr�s le virement

		System.out.println("");
		System.out.println("Soldes apr�s le virement :");
		System.out.println("Le nouveau solde du compte courant de " + clientPart0.getPrenom() + " "
				+ clientPart0.getNomClient() + " est de " + compteCPart0.getSoldeCompte() + " �");
		System.out.println("Le nouveau solde du compte �pargne de " + clientPart0.getPrenom() + " "
				+ clientPart0.getNomClient() + " est de " + compteEPart0.getSoldeCompte() + " �");

		// Renseignement informations entreprise

		// Client entreprises : cr�ation des objets

		Client clientEnt0 = new ClientEntreprise("CARROUF", "6 rue des Champs", "75000", "Paris", "0125631452");
		Client clientEnt1 = new ClientEntreprise("MERLIN", "24 rue des Oliviers", "13000", "Marseille", "0424531452");
		Client clientEnt2 = new ClientEntreprise("BELLE MER", "54 rue de l'Ocean", "64100", "Biarritz", "0559631452");

		// Ajouter clients entreprises � la base de donn�es

		clientService.ajouterClient(clientEnt0);
		clientService.ajouterClient(clientEnt1);
		clientService.ajouterClient(clientEnt2);

		System.out.println("");

		// Cr�ation de 3 objets : 3 Comptes Courants & 3 Comptes Epargnes

		Compte compteCEnt0 = new CompteCourant(-64000, "1er F�vrier 2016", true, "Visa Premier");
		Compte compteEEnt0 = new CompteEpargne(false, 3500, "2 Mai 2017");

		Compte compteCEnt1 = new CompteCourant(10000, "1er Janvier 2012", true, "Visa Premier");
		Compte compteEEnt1 = new CompteEpargne(false, 500000, "29 Avril 2013");

		Compte compteCEnt2 = new CompteCourant(500, "1er D�cembre 2014", true, "Visa Premier");
		Compte compteEEnt2 = new CompteEpargne(false, -122000, "14 Janvier 2016");

		// Ajout des comptes courants � la BDD

		compteService.ajouterCompteCourant(compteCEnt0);
		compteService.ajouterCompteCourant(compteCEnt1);
		compteService.ajouterCompteCourant(compteCEnt2);

		// Ajout des comptes �pargne � la BDD

		compteService.ajouterCompteEpargne(compteEEnt0);
		compteService.ajouterCompteEpargne(compteEEnt1);
		compteService.ajouterCompteEpargne(compteEEnt2);

		// Association des objets comptes aux objets clients correspondants

		clientEnt0.setCompteC(compteCEnt0);
		clientEnt0.setCompteE(compteEEnt0);

		clientEnt1.setCompteC(compteCEnt1);
		clientEnt1.setCompteE(compteEEnt1);

		clientEnt2.setCompteC(compteCEnt2);
		clientEnt2.setCompteE(compteEEnt2);

		// Audit des comptes

		// Audit des comptes particuliers

		System.out.println("");
		System.out.println("Audit des comptes des particuliers :");
		clientPart0.auditerCompte(compteCPart0);
		clientPart0.auditerCompte(compteEPart0);

		clientPart1.auditerCompte(compteCPart1);
		clientPart1.auditerCompte(compteEPart1);

		clientPart2.auditerCompte(compteCPart2);
		clientPart2.auditerCompte(compteEPart2);

		clientPart3.auditerCompte(compteCPart3);
		clientPart3.auditerCompte(compteEPart3);

		clientPart4.auditerCompte(compteCPart4);
		clientPart4.auditerCompte(compteEPart4);

		clientPart5.auditerCompte(compteCPart5);
		clientPart5.auditerCompte(compteEPart5);
		System.out.println(" ");

		// Audit des comptes entreprises

		System.out.println("Audit des comptes des entreprises :");
		clientEnt0.auditerCompte(compteCEnt0);
		clientEnt0.auditerCompte(compteEEnt0);

		clientEnt1.auditerCompte(compteCEnt1);
		clientEnt1.auditerCompte(compteEEnt1);

		clientEnt2.auditerCompte(compteCEnt2);
		clientEnt2.auditerCompte(compteEEnt2);

		// Simulation interface utilisateur

		// Lancement de l'application

		Scenarii Scenario0 = new Scenarii();

		// Message de bienvenue (classe Scenarii)

		Scenario0.direBonjour();

		// Acc�s au menu principal (classe Scenarii)

		Scenario0.menuPrincipal();

	}

}
