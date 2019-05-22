package visuel;
// sert pour recup input clavier
import java.util.Scanner;

import joueurs.Joueur; 

import piecesEchiquier.Echiquier;

public class main {
	

	public static void main (String[] args) {
		
		
		//ouvre une porte pour input
		Scanner sc = new Scanner(System.in);
		
		// variable tempo pour tests
		boolean jeu = true;
		
		//déclaration d'une valeur pour la boucle while de configuration
		int choixPartie = 1;
		
		//déclaration boucle partie
		String choixRedem;
		
		// déclaration des joueurs
		System.out.println("Entrez le nom du joueur 1 : ");
		Joueur j1 = new Joueur(sc.nextLine(), null);
		
		System.out.println("Entrez le nom du joueur 2 : ");
		Joueur j2 = new Joueur(sc.nextLine(), null);
		
		if(j1.getNom().equalsIgnoreCase("") || j2.getNom().equalsIgnoreCase("") || j1.getNom().equalsIgnoreCase(null) || j2.getNom().equalsIgnoreCase(null)) {
			choixPartie = -1;
		}
		
		//déclaration des variables de déplacement
		String A; //coordonées de départ
		String B; //coordonées d'arrivée
		
		//déclaration de l'échiquier
		Echiquier e = new Echiquier();
		
			while (choixPartie >= 1) {

				while (choixPartie == 1) {

					System.out.println(
							"Choisissez la configuration de partie que vous désirez en tapant le numéro correspondant :");
					System.out.println("1 = Blanc : " + j1.getNom() + " - Noir : " + j2.getNom());
					System.out.println("2 = Blanc : " + j2.getNom() + " - Noir : " + j1.getNom());
					System.out.println("3 = Aléatoire");

					String choixP = sc.nextLine();

					if (choixP.equalsIgnoreCase("3")) {
						int random = (int) (Math.random() * 2 + 1);

						System.out.println("La configuration " + random + " a été choisie aléatoirement !");

						if (random <= 1) {
							choixP = "1";
						} else {
							choixP = "2";
						}
					}

					if (choixP.equalsIgnoreCase("1")) {
						j1.setCouleur("Blanc");
						j2.setCouleur("Noir");
						System.out.println("Le joueur " + j1.getNom() + " jouera les blancs et le joueur " + j2.getNom()
								+ " jouera les noirs.");
						choixPartie = 2;

					} else if (choixP.equalsIgnoreCase("2")) {
						j2.setCouleur("Blanc");
						j1.setCouleur("Noir");
						System.out.println("Le joueur " + j2.getNom() + " jouera les blancs et le joueur " + j1.getNom()
								+ " jouera les noirs.");
						choixPartie = 2;

					} else {
						System.err.println("Veuillez rentrer une valeur correcte");
					}
				}

				System.out.println("Bienvenue " + j1.getNom() + " et " + j2.getNom()
						+ " dans e-Chesstria  ! Le jeu d'echec équestrien sur console fait entièrement en java !\n");

				do {

					// AFFICHAGE ECHIQUIER
					System.out.println(e.toString());

					/*JOUEUR1*/

					System.out.println("Tour de " + j1.getNom() + "\n");

					do {
						System.out.println(
								"Quelle pièce voulez-vous déplacer ? Donnez le code correspondant de la pièce à déplacer(ex : A1).\n");
						A = sc.nextLine();
						System.out.println(
								"À quel endroit la poser ?  Donnez le code correspondant à l'endroit où poser la pièce.\n");
						B = sc.nextLine();

					} while (e.verificationMouvement(j1, A, B) != true); // Tant que le mouvement n'est pas faisable on demande 2 coordonnées
					/*if (e.getRoiN1().enEchec(e,j2) && e.getRoiN1().enEchecEtMat(e,j2))
					{
						System.out.println("Le joueur 2 est echec et mat, il a perdu !");
						jeu = false;
					}*/
					//REAFFICHAGE ECHIQUIER
					System.out.println(e.toString());

					// JOUEUR2
					System.out.println("Tour de " + j2.getNom() + "\n");

					if (jeu == true) {
						do {
							System.out.println(
									"Quelle piece voulez-vous deplacer ? Donnez le code correspondant de la pièce à déplacer(ex : A1).\n");
							A = sc.nextLine();

							System.out.println(
									"À quel endroit la poser ?  Donnez le code correspondant à l'endroit où la poser la pièce.\n");
							B = sc.nextLine();

						} while (e.verificationMouvement(j2, A, B) != true); // Tant que le mouvement n'est pas faisable on demande 2 coordonnées
					}

					/*if (e.getRoiB1().enEchec(e,j1) && e.getRoiN1().enEchecEtMat(e,j1))
					{
						System.out.println("Le joueur 1 est echec et mat, il a perdu !");
						jeu = false;
					}*/
					//jeu = false;

				} while (jeu == true);

				System.out.println("Voulez vous redémarrer une nouvelle partie ? (oui / non)");
				choixRedem = sc.nextLine();
				
				if(choixRedem.equalsIgnoreCase("oui")) {
					
					jeu = true;
					System.out.println("Voulez vous conserver les mêmes paramètres de partie ? (oui / non)");
					choixRedem = sc.nextLine();
					
					if(choixRedem.equalsIgnoreCase("oui")) {
						choixPartie = 2;
					} else if (choixRedem.equalsIgnoreCase("non")) {
						choixPartie = 1;
					}
					
				} else if(choixRedem.equalsIgnoreCase("non")) {
						System.out.println("Merci d'avoir joué à notre jeu d'échec - Team G00D3NOUGHT - CC BY !");
				} else {
					System.err.println("Une erreur s'est produite, les joueurs ont mal saisie des entrées lors de la fin du programme.");
				}
			}
		System.err.println("Une erreur s'est produite, les joueurs ont mal saisie des entrées lors du démarrage du programme. (nom de joueur vide OU un mauvais numéro de configuration par exemple)");
		sc.close();
	}
	
}
