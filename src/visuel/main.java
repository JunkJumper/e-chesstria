package visuel;
// sert pour recup input clavier
import java.util.Scanner;

import joueurs.Joueur;

import piecesEchiquier.Echiquier;
import piecesEchiquier.Position;

public class main {

	public static void main (String[] args) {
		
		//ouvre une porte pour input
		Scanner sc = new Scanner(System.in);
		
		// variable tempo pour tests
		boolean jeu = true;
		
		//position de la piece choisie et l'emplacement ou la poser
		Position p1 = new Position();
		Position p2 = new Position();
		// joueurs APRES ON DEMANDERA NOM
		Joueur j1 = new Joueur("Manon","Blanc");
		Joueur j2 = new Joueur("Autre","Noir");
		
		
		// vars pour deplacer
		/*
		int x1;
		int y1;
		int x2;
		int y2;
		*/
		String dep;
		
		
		System.out.println("Bienvenue dans ce jeu d'echec sur console !\n");
		
		
		do {
			
			Echiquier e = new Echiquier();
			
			// AFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR1
				System.out.println("Tour de "+j1.getNom()+"\n");
				
				do
				{
				System.out.println("Quelle pièce voulez vous déplacer ? Donnez la combinaison lettre/chiffre.\n");
				String initial = sc.nextLine();
				p1 = e.traduction(initial);
				}while (p1 ==  null);
				
				do
				{
				System.out.println("A quel endroit la poser ? Donnez la combinaison lettre/chiffre.\\n");
				//entrer  coordonnées endroit visé APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
				
				String newemp = sc.nextLine();
				p2 = e.traduction(newemp);
				}while (p2 ==  null);
				
				// DEPLACEMENT (prototype minimum juste pour voir)
				e.deplacer(p1,p2);
				
				//REAFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR2
				/*
				System.out.println("Tour de"+j2.getNom()+"\n");
				System.out.println("Quelle pièce voulez vous déplacer ? Donnez le numero de ligne puis de colonne.\n");
				x1 = sc.nextInt();
				y1 = sc.nextInt();
				System.out.println("A quel endroit la poser ? Donnez le numero de ligne puis de colonne.\n");
				x2 = sc.nextInt();
				y2 = sc.nextInt();
				e.deplacer(x1-1,y1-1,x2-1,y2-1);
*/
			//jeu = false;
			 
		}while (jeu == true);	
		sc.close();
	}

}
