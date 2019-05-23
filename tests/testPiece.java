import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import joueurs.Joueur;
import piecesEchiquier.*;

class testPiece {
	private Echiquier e;
	private Joueur jb;
	private Joueur jn;
	
	@BeforeEach
	public void initialisation() {
		e = new Echiquier();
		jb = new Joueur("Joueur Blanc","Blanc");
		jn = new Joueur("JOueur Noir", "Noir");
		
		System.out.println();
		System.out.println("nouveau test : ");
		System.out.println();
	}
	
	@AfterEach
	public void netoyage () {
		e = null;
		jb = null;
		jn = null;
	}
	
	@Test
	void testVerif() {
		assertFalse(e.verificationMouvement(jb, "A4", "A5")); //choix de case vide
		assertFalse(e.verificationMouvement(jb, "A7", "A8")); //mauvais choix de pion
		assertFalse(e.verificationMouvement(jb, "A1", "A2")); //manger pion allier
		assertFalse(e.verificationMouvement(jb, "A2", "B5")); //mauvais deplacement
	}
	
	@Test 
	void testPion () {
		e.verificationMouvement(jb, "A2", "A3"); //deplacement haut de un 
		assertEquals(1, e.getPionB1().getPosition().getX());
		assertEquals(3, e.getPionB1().getPosition().getY());
		
		e.verificationMouvement(jb, "E2", "E4");//deplacement de depart de deux
		assertEquals(5, e.getPionB5().getPosition().getX());
		assertEquals(4, e.getPionB5().getPosition().getY());
		
		e.verificationMouvement(jn, "D7", "D5");
		e.verificationMouvement(jb, "E4", "D5"); //depalcement diagonale pour mangeage
		assertEquals(4, e.getPionB5().getPosition().getX());
		assertEquals(5, e.getPionB5().getPosition().getY());
		
		assertFalse(e.verificationMouvement(jb, "A3", "A5")); //verif erreure de deplacement de deux alors que pas premier mouvement
		assertFalse(e.verificationMouvement(jb, "A3", "B4")); //verif erreure deplacement diagonale alors que pas de possibilit? de manger
		assertFalse(e.verificationMouvement(jb, "D5", "D4")); //verif d?palcement impossible dans l'autre sens pour blanc
		e.verificationMouvement(jb, "B7", "B6");
		assertFalse(e.verificationMouvement(jb, "B6", "B7")); //verif d?palcement impossible dans l'autre sens pour noirs
		
	}
	
	@Test
	void testTour() {
		 e.verificationMouvement(jb, "A2", "a4");
		 e.verificationMouvement(jb, "a4", "a5");
		 
		 e.verificationMouvement(jb, "A1", "A4"); //d?placement haut
		 assertEquals(1, e.getTourB1().getPosition().getX());
		 assertEquals(4, e.getTourB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "A4", "A3"); //d?placement bas
		 assertEquals(1, e.getTourB1().getPosition().getX());
		 assertEquals(3, e.getTourB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "A3", "F3"); //deplacement droite
		 assertEquals(6, e.getTourB1().getPosition().getX());
		 assertEquals(3, e.getTourB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "F3", "C3"); //d?placement gauche
		 assertEquals(3, e.getTourB1().getPosition().getX());
		 assertEquals(3, e.getTourB1().getPosition().getY());

		 e.verificationMouvement(jb, "c3", "C7"); //verification mangeage
		 assertEquals(3, e.getTourB1().getPosition().getX());
		 assertEquals(7, e.getTourB1().getPosition().getY());
	 }
	 
	@Test
	 void testFou() {
		 e.verificationMouvement(jb, "D2", "d3");
		 
		 e.verificationMouvement(jb, "C1", "E3"); //d?palcement haut / droit
		 assertEquals(5, e.getFouB1().getPosition().getX());
		 assertEquals(3, e.getFouB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "E3", "C5"); //d?placement haut / gauche
		 assertEquals(3, e.getFouB1().getPosition().getX());
		 assertEquals(5, e.getFouB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "C5", "D4"); //?placment bas / droite
		 assertEquals(4, e.getFouB1().getPosition().getX());
		 assertEquals(4, e.getFouB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "D4", "B3"); //d?placement bas / gauche
		 assertEquals(2, e.getFouB1().getPosition().getX());
		 assertEquals(3, e.getFouB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "B3", "f7"); //verif mangeage 
		 assertEquals(6, e.getFouB1().getPosition().getX());
		 assertEquals(7, e.getFouB1().getPosition().getY());
	 }
	 
	 /*@Test
	 void testCavalier()  {
		 e.verificationMouvement(j, "B1", "C3"); //d?palcement haut / droit + saut par dessus autre pi?ce
		 assertEquals(5, e.getCavalierB1().getPosition().getX());
		 assertEquals(2, e.getCavalierB1().getPosition().getY());
		 
		 e.verificationMouvement(j, "C3",  "B1"); //deplacement bas / gauche + saut
		 assertEquals(7, e.getCavalierB1().getPosition().getX());
		 assertEquals(1, e.getCavalierB1().getPosition().getY());
		 
		 e.verificationMouvement(j, "B1", "A3"); //deplacement haut / gauche + saut
		 assertEquals(5, e.getCavalierB1().getPosition().getX());
		 assertEquals(0, e.getCavalierB1().getPosition().getY());
		 
		 e.verificationMouvement(j, "A3", "B5");
		 e.verificationMouvement(j, "B5", "C3"); //deplacement bas / droite
		 assertEquals(5, e.getCavalierB1().getPosition().getX());
		 assertEquals(2, e.getCavalierB1().getPosition().getY());
		 
		 e.verificationMouvement(j, "C3", "D5");
		 e.verificationMouvement(j, "D5", "E7");
		 assertFalse(e.getPionN5().isEnVie());
	 }
*/
}