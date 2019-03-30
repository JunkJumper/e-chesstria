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
		
		
		// joueurs APRES ON DEMANDERA NOM
		Joueur j1 = new Joueur("Manon","Blanc");
		Joueur j2 = new Joueur("Autre","Noir");
		
		
		// vars pour deplacer
		int x1;
		int y1;
		int x2;
		int y2;
		
		
		
		System.out.println("Bienvenue dans ce jeu d'echec sur console !\n");
		
		
		do {
			
			Echiquier e = new Echiquier();
			
			// AFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR1
				System.out.println("Tour de "+j1.getNom()+"\n");
				
				System.out.println("Quelle pièce voulez vous déplacer ? Donnez le numero de ligne puis de colonne.\n");
				
				//entrer  coordonnées piece a bouger APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
				x1 = sc.nextInt();
				y1 = sc.nextInt();
				
				System.out.println("A quel endroit la poser ? Donnez le numero de ligne puis de colonne.\n");
				//entrer  coordonnées endroit visé APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
				x2 = sc.nextInt();
				y2 = sc.nextInt();
				
				// DEPLACEMENT (prototype minimum juste pour voir)
				e.deplacer(x1-1,y1-1,x2-1,y2-1);
				
				//REAFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR2
				System.out.println("Tour de"+j2.getNom()+"\n");
				System.out.println("Quelle pièce voulez vous déplacer ? Donnez le numero de ligne puis de colonne.\n");
				x1 = sc.nextInt();
				y1 = sc.nextInt();
				System.out.println("A quel endroit la poser ? Donnez le numero de ligne puis de colonne.\n");
				x2 = sc.nextInt();
				y2 = sc.nextInt();
				e.deplacer(x1-1,y1-1,x2-1,y2-1);

			//jeu = false;
			 
		}while (jeu == true);	
		sc.close();
	}

}
