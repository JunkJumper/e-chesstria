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
		if(j1.getNom().isEmpty()) {
			j1.setNom("Joueur Par défaut 1");
		}
		
		System.out.println("Entrez le nom du joueur 2 : ");
		Joueur j2 = new Joueur(sc.nextLine(), null);
		if(j2.getNom().isEmpty()) {
			j2.setNom("Joueur Par défaut 2");
		}
		
		Joueur jTemp = new Joueur(null, null); //  ce joueur sert de mémoire pour le choix de l'odre de jeu

		if(j1.getNom().equalsIgnoreCase("") || j2.getNom().equalsIgnoreCase("") || j1.getNom().equalsIgnoreCase(null) || j2.getNom().equalsIgnoreCase(null)) {
			choixPartie = -1;
		}
		
		//déclaration des variables de déplacement
		String A; //coordonées de départ
		String B; //coordonées d'arrivée
		
		char cA = 'y';//pour recup le premier char
		char pA = '8';//pour recup le 2e char
		String sA;//pour concatener
		
		
		//déclaration de l'échiquier
			while (choixPartie >= 1) {
				Echiquier e = new Echiquier();
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
						/*
						 * Alors ici on utilise un joueur temporaire pour faire passe le deuxième joueur en joueur numéro 1
						 */
						jTemp.setNom(j1.getNom());
						jTemp.setCouleur(j1.getCouleur());
						
						j1.setCouleur(j2.getCouleur());
						j1.setNom(j2.getNom());
						
						j2.setNom(jTemp.getNom());
						j2.setCouleur(jTemp.getCouleur());
						
						choixPartie = 2;

					} else {
						System.err.println("Veuillez rentrer une valeur correcte");
					}
				}

				System.out.println("Bienvenue " + j1.getNom() + " et " + j2.getNom()
						+ " dans e-Chesstria  ! Le jeu d'echec sur console fait entièrement en java !\n");

				do {

					// AFFICHAGE ECHIQUIER
					System.out.println(e.toString());

					/*JOUEUR1*/

					System.out.println("\n" + "Tour de " + j1.getNom() + "(" + j1.getCouleur() + ")\n");

					//do {
						if (e.getRoiB1().isRoiEchec() == true)
						{
							do
							{
								System.out.println(
										"Comme votre roi est en echec la piece a bouger est forcement cette derniere. Ou voulez vous la poser ?\n");
								A = e.getCodes()[8-e.getRoiB1().getPosition().getY()][e.getRoiB1().getPosition().getX()-1];
								B = sc.nextLine();
								
							}while(e.verificationMouvement(j1, A, B) != true );
							
						}
						else if (e.getRoiB1().enEchecEtMat(e,e.getEchiquier()[8-e.getRoiB1().getPosition().getY()][e.getRoiB1().getPosition().getX()-1]) == true)
						{
							do
							{
								System.out.println(
										"Votre roi est en echec et mat temporaire. Bougez une piece pour le sauver si vous pouvez. Sinon bougez une piece au hasard.\n");
								System.out.println(
										"Quelle pièce voulez-vous déplacer ? Donnez le code correspondant de la pièce à déplacer(ex : A1).\n");
								A = sc.nextLine();
								System.out.println(
										"À quel endroit la poser ?  Donnez le code correspondant à l'endroit où poser la pièce.\n");
								B = sc.nextLine();
							}while(e.verificationMouvement(j1, A, B) != true  && e.getRoiB1().enEchecEtMat(e,e.getEchiquier()[8-e.getRoiB1().getPosition().getY()][e.getRoiB1().getPosition().getX()-1]) == true);
						}
						else {
							do {
								System.out.println(
										"Quelle pièce voulez-vous déplacer ? Donnez le code correspondant de la pièce à déplacer(ex : A1).\n");
								A = sc.nextLine();
								if(A.isEmpty()) {
									A = "Z99";
								}
								
								cA = A.charAt(0);//ici on récupère le premier caractère du String
								pA = A.charAt(1);//ici on récupère le second caratère
								char cAl = Character.toLowerCase(cA); //ici on convertis un 'A' en 'a'
								sA = "" + cAl + pA; //ici on concatène dans un nouveau string le a transformé avec le chiffre récupéré.
								
								System.out.println(
										"À quel endroit la poser ?  Donnez le code correspondant à l'endroit où poser la pièce.\n");
								B = sc.nextLine();
								if(B.isEmpty()) {
									B = "Z99";
								}

							
							}while(e.verificationMouvement(j1, sA, B) != true );
						}
							
						

					//} while (e.verificationMouvement(j1, A, B) != true ); // Tant que le mouvement n'est pas faisable on demande 2 coordonnées
					
					
					if (e.getRoiB1().enEchecEtMat(e,e.getEchiquier()[8-e.getRoiB1().getPosition().getY()][e.getRoiB1().getPosition().getX()-1]) == true) // si roi blanc en echec etmat
					{
						if (e.getRoiB1().enEchecEtMat(e,e.getEchiquier()[8-e.getRoiB1().getPosition().getY()][e.getRoiB1().getPosition().getX()-1]) == true ) //si cest le roi blanc
								{
									System.out.println("Le joueur 1 "+ j1.getNom() +" est echec et mat, il a perdu !");
								}
						jeu = false;
					}			
					if(jeu == true)
					{
					//REAFFICHAGE ECHIQUIER
					System.out.println(e.toString());

					// JOUEUR2
					
					System.out.println("Tour de " + j2.getNom() + "(" + j2.getCouleur() + ")\n");

						//do {
							if (e.getRoiN1().isRoiEchec())
							{
								do {
								System.out.println(
										"Comme votre roi est en echec la piece a bouger est forcement cette derniere. Ou voulez vous la poser ?\n");
								A = e.getCodes()[8-e.getRoiN1().getPosition().getY()][e.getRoiN1().getPosition().getX()-1];
								B = sc.nextLine();
							}while(e.verificationMouvement(j2, A, B) != true );
							}
							
							else if (e.getRoiN1().enEchecEtMat(e,e.getEchiquier()[8-e.getRoiN1().getPosition().getY()][e.getRoiN1().getPosition().getX()-1]) == true)
							{
								do
								{
									System.out.println(
											"Votre roi est en echec et mat temporaire. Bougez une piece pour le sauver si vous pouvez. Sinon bougez une piece au hasard.\n");
									System.out.println(
											"Quelle pièce voulez-vous déplacer ? Donnez le code correspondant de la pièce à déplacer(ex : A1).\n");
									A = sc.nextLine();
									System.out.println(
											"À quel endroit la poser ?  Donnez le code correspondant à l'endroit où poser la pièce.\n");
									B = sc.nextLine();
								}while(e.verificationMouvement(j2, A, B) != true  && e.getRoiN1().enEchecEtMat(e,e.getEchiquier()[8-e.getRoiN1().getPosition().getY()][e.getRoiN1().getPosition().getX()-1]) == true);
							}
							else {
								do {
									System.out.println(
											"Quelle pièce voulez-vous déplacer ? Donnez le code correspondant de la pièce à déplacer(ex : A1).\n");
									A = sc.nextLine();
									
									cA = A.charAt(0);//ici on récupère le premier caractère du String
									pA = A.charAt(1);//ici on récupère le second caratère
									char cAl = Character.toLowerCase(cA); //ici on convertis un 'A' en 'a'
									sA = "" + cAl + pA; //ici on concatène dans un nouveau string le a transformé avec le chiffre récupéré.
									
									System.out.println(
											"À quel endroit la poser ?  Donnez le code correspondant à l'endroit où poser la pièce.\n");
									B = sc.nextLine();
									

							}while(e.verificationMouvement(j2, sA, B) != true );
							} // Tant que le mouvement n'est pas faisable on demande 2 coordonnées
					
					
					// VERIF ECHECMAT
					if (e.getRoiN1().enEchecEtMat(e,e.getEchiquier()[8-e.getRoiN1().getPosition().getY()][e.getRoiN1().getPosition().getX()-1]) == true) // si roi noir en echec et mat
					{
						if (e.getRoiN1().enEchecEtMat(e,e.getEchiquier()[8-e.getRoiN1().getPosition().getY()][e.getRoiN1().getPosition().getX()-1]) == true )//si c'est le roi noir
								{
									System.out.println("Le joueur 2 " + j2.getNom() +" est echec et mat, il a perdu !");
								}
						jeu = false;
					}
					}
				}while(jeu == true);
				System.out.println("Voulez vous redémarrer une nouvelle partie ? (oui / non)");
				choixRedem = sc.nextLine();
				
				if(choixRedem.equalsIgnoreCase("oui")) 
				{
					
					jeu = true;
					System.out.println("Voulez vous conserver les mêmes paramètres de partie ? (oui / non)");
					choixRedem = sc.nextLine();
					
					if(choixRedem.equalsIgnoreCase("oui")) {
						choixPartie = 2;
					} else if (choixRedem.equalsIgnoreCase("non")) {
						choixPartie = 1;
					}
					
				} 
				else if(choixRedem.equalsIgnoreCase("non")) {
						System.out.println("Merci d'avoir joué à notre jeu d'échec - Team G00D3NOUGHT - CC BY !");
						choixPartie = 0;
						sc.close();
						System.exit (0);
				} 
				else {
					System.err.println("Une erreur s'est produite, les joueurs ont mal saisie des entrées lors de la fin du programme.");
				}
			}	
	}
}
