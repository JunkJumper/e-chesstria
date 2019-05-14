package visuel;
// sert pour recup input clavier
import java.util.Scanner; //a voir si on fait une classe 'leScan' pour gerer le scan du clavier plus simplement

import joueurs.Joueur;

import piecesEchiquier.Echiquier;

public class main {

	public static void main (String[] args) {
		
		//ouvre une porte pour input
		Scanner sc = new Scanner(System.in);
		
		// variable tempo pour tests
		boolean jeu = true;
		
		
		// joueurs APRES ON DEMANDERA NOM
		Joueur j1 = new Joueur("Marion la Stagiaire","Blanc");
		Joueur j2 = new Joueur("Autre","Noir");
		
		
		// vars pour deplacer
		String A;
		String B;
		
		
		
		System.out.println("Bienvenue dans ce jeu d'echec sur console !\n");
		
		Echiquier e = new Echiquier();
		do {
			
			// AFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR1
				
				System.out.println("Tour de "+j1.getNom()+"\n");
				
				
				do {
					System.out.println("Quelle piece voulez vous deplacer ? Donnez le code correspondant de la piece a  deplacer(ex : A1).\n");
					A = sc.nextLine();
					System.out.println("A quel endroit la poser ?  Donnez le code correspondant a l'endroit ou poser la piece.\n");
					B = sc.nextLine();
					
				}while (e.verificationMouvement(j1, A,B) != true);  // Tant que le mouvement n'est pas faisable on demande 2 coordonnées
				if (e.getRoiN1().enEchec(e,j2) && e.getRoiN1().enEchecEtMat(e,j2))
				{
					System.out.println("Le joueur 2 est echec et mat, il a perdu !");
					jeu = false;
				}
				//REAFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR2
				System.out.println("Tour de "+j2.getNom()+"\n");

				if (jeu == true)
				{
					do {
						System.out.println("Quelle piece voulez vous deplacer ? Donnez le code correspondant de la piece a  deplacer(ex : A1).\n");
						A = sc.nextLine();
						
						System.out.println("A quel endroit la poser ?  Donnez le code correspondant de l'endroit la poser la piece.\n");
						B = sc.nextLine();
						
					}while (e.verificationMouvement(j2, A,B) != true);  // Tant que le mouvement n'est pas faisable on demande 2 coordonnées
				}
				
				if (e.getRoiB1().enEchec(e,j1) && e.getRoiN1().enEchecEtMat(e,j1))
				{
					System.out.println("Le joueur 1 est echec et mat, il a perdu !");
					jeu = false;
				}
			//jeu = false;
			 
		}while (jeu == true);	
		sc.close();
	}
	
}
