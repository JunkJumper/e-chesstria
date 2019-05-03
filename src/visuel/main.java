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
		String A;
		String B;
		
		
		
		System.out.println("Bienvenue dans ce jeu d'echec sur console !\n");
		
		
		do {
			
			Echiquier e = new Echiquier();
			
			// AFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR1
				
				System.out.println("Tour de "+j1.getNom()+"\n");
				
				
				do {
					System.out.println("Quelle pièce voulez vous déplacer ? Donnez le code correspondant à la pièce à déplacer(ex : A1).\n");
					
					//entrer  coordonnées piece a bouger APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
					A = sc.nextLine();
					//if (A.equals("A1"))
					//	System.out.println("OK");
					System.out.println("A quel endroit la poser ?  Donnez le code correspondant à l'endroit où poser la pièce.\n");
					//entrer  coordonnées endroit visé APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
					B = sc.nextLine();
					
				}while (e.VerifFinale(j1, A,B) != true);
				
				//e.deplacer(A,B);
				
				//REAFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR2
				/*System.out.println("Tour de"+j2.getNom()+"\n");
				System.out.println("Quelle pièce voulez vous déplacer ? Donnez le numero de ligne puis de colonne.\n");
				x1 = sc.nextInt();
				y1 = sc.nextInt();
				System.out.println("A quel endroit la poser ? Donnez le numero de ligne puis de colonne.\n");
				x2 = sc.nextInt();
				y2 = sc.nextInt();
				e.deplacer(x1-1,y1-1,x2-1,y2-1);*/
				do {
					System.out.println("Quelle pièce voulez vous déplacer ? Donnez le code correspondant à la pièce à déplacer(ex : A1).\n");
					
					//entrer  coordonnées piece a bouger APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
					A = sc.nextLine();
					
					System.out.println("A quel endroit la poser ?  Donnez le code correspondant à l'endroit où poser la pièce.\n");
					//entrer  coordonnées endroit visé APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
					B = sc.nextLine();
					
				}while (e.VerifFinale(j2, A,B) != true);

			//jeu = false;
			 
		}while (jeu == true);	
		sc.close();
	}

}
