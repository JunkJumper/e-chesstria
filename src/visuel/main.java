package visuel;
// sert pour recup input clavier
import java.util.Scanner; //a voir si on fait une classe 'leScan' pour gérer le scan du clavier plus simplement

import joueurs.Joueur;

import piecesEchiquier.Echiquier;

public class main {

	//	public main (String[] args) { //EVENTUELLEMENT SOLUTION POSSIBLE AVEC FORCE RETURN
	public static void main (String[] args) {
		
		
		//ouvre une porte pour input
		Scanner sc = new Scanner(System.in);
		
		// variable tempo pour tests
		boolean jeu = true;
		
		
		// joueurs APRES ON DEMANDERA NOM
		Joueur j1 = new Joueur("Personne A","Blanc");
		Joueur j2 = new Joueur("Personne B","Noir");
		
		
		// vars pour deplacer
		String A;
		String B;
		
		
		
		System.out.println("Bienvenue dans le jeu e-Chesstria ! Le jeu d'echec sur console fait en java !\n");
		
		Echiquier e = new Echiquier();
		do {
			
			// AFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR1
				
				System.out.println("Tour de "+j1.getNom()+"\n");
				
				
				do {
					System.out.println("Quelle pièce voulez vous déplacer ? Donnez le code correspondant de la pièce à déplacer(ex : A1).\n");
					A = sc.nextLine();
					System.out.println("A quel endroit la poser ?  Donnez le code correspondant de l'endroit où poser la pièce.\n");
					B = sc.nextLine();
					
				}while (e.VerifFinale(j1, A,B) != true);
				
				//e.deplacer(A,B);
				
				//REAFFICHAGE ECHIQUIER
				System.out.println(e.toString());
				
				// JOUEUR2
				System.out.println("Tour de "+j2.getNom()+"\n");

				do {
					System.out.println("Quelle pièce voulez vous déplacer ? Donnez le code correspondant de la pièce à déplacer(ex : A1).\n");
					
					//entrer  coordonn�es piece a bouger APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
					A = sc.nextLine();
					
					System.out.println("A quel endroit la poser ?  Donnez le code correspondant de l'endroit où poser la pièce.\n");
					//entrer  coordonn�es endroit vis� APRES ON PASSERA PAR DIRECT COMBINAISON LETTRE-CHIFFRE
					B = sc.nextLine();
					
				}while (e.VerifFinale(j2, A,B) != true);

			//jeu = false;
			 
		}while (jeu == true);	
		sc.close();
	}

}
