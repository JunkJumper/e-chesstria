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
		jn = new Joueur("Joueur Noir", "Noir");
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
		 
		 e.verificationMouvement(jb, "D4", "C3"); //d?placement bas / gauche
		 System.out.println(e.toString());
		 assertEquals(3, e.getFouB1().getPosition().getX());
		 assertEquals(3, e.getFouB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "C3", "g7"); //verif mangeage 
		 assertEquals(7, e.getFouB1().getPosition().getX());
		 assertEquals(7, e.getFouB1().getPosition().getY());
	 }
	 
	 @Test
	 void testCavalier()  {
		 e.verificationMouvement(jb, "B1", "C3"); //d?palcement haut / droit + saut par dessus autre pi?ce
		 assertEquals(3, e.getCavalierB1().getPosition().getX());
		 assertEquals(3, e.getCavalierB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "C3",  "B1"); //deplacement bas / gauche + saut
		 assertEquals(2, e.getCavalierB1().getPosition().getX());
		 assertEquals(1, e.getCavalierB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "B1", "A3"); //deplacement haut / gauche + saut
		 assertEquals(1, e.getCavalierB1().getPosition().getX());
		 assertEquals(3, e.getCavalierB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "A3", "B5");
		 e.verificationMouvement(jb, "B5", "C3"); //deplacement bas / droite
		 assertEquals(3, e.getCavalierB1().getPosition().getX());
		 assertEquals(3, e.getCavalierB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "C3", "D5");
		 e.verificationMouvement(jb, "D5", "E7");
		 assertEquals(5, e.getCavalierB1().getPosition().getX());
		 assertEquals(7, e.getCavalierB1().getPosition().getY());
	 }

	 @Test 
	 void testReine () {
		 e.verificationMouvement(jb, "d2", "d3");
		 e.verificationMouvement(jb, "d1", "d2");//haut
		 assertEquals(4, e.getReineB1().getPosition().getX());
		 assertEquals(2, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "d2", "f4");//haut droite
		 assertEquals(6, e.getReineB1().getPosition().getX());
		 assertEquals(4, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "f4", "d6");//haut gauche
		 assertEquals(4, e.getReineB1().getPosition().getX());
		 assertEquals(6, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "d6", "c5");//bas gauche
		 assertEquals(3, e.getReineB1().getPosition().getX());
		 assertEquals(5, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "c5", "b5");//gauche
		 assertEquals(2, e.getReineB1().getPosition().getX());
		 assertEquals(5, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "b5", "c6");//haut droite
		 assertEquals(3, e.getReineB1().getPosition().getX());
		 assertEquals(6, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "c6", "c4");//bas
		 assertEquals(3, e.getReineB1().getPosition().getX());
		 assertEquals(4, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "c4", "d4");//droite
		 assertEquals(4, e.getReineB1().getPosition().getX());
		 assertEquals(4, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "d4", "d7");//mangeage
		 assertEquals(4, e.getReineB1().getPosition().getX());
		 assertEquals(7, e.getReineB1().getPosition().getY());
	 }
	 
	 @Test 
	 void testRoi () {
		 e.verificationMouvement(jb, "d2", "d3");
		 e.verificationMouvement(jb, "d1", "d2");//haut
		 assertEquals(4, e.getReineB1().getPosition().getX());
		 assertEquals(2, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "d2", "e3");//haut droite
		 assertEquals(5, e.getReineB1().getPosition().getX());
		 assertEquals(3, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "e3", "d4");//haut gauche
		 assertEquals(4, e.getReineB1().getPosition().getX());
		 assertEquals(4, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "d4", "c3");//bas gauche
		 assertEquals(3, e.getReineB1().getPosition().getX());
		 assertEquals(3, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "c3", "b3");//gauche
		 assertEquals(2, e.getReineB1().getPosition().getX());
		 assertEquals(3, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "b3", "c4");//haut droite
		 assertEquals(3, e.getReineB1().getPosition().getX());
		 assertEquals(4, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "c4", "c3");//bas
		 assertEquals(3, e.getReineB1().getPosition().getX());
		 assertEquals(3, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jb, "c3", "b3");
		 e.verificationMouvement(jb, "b3", "c3");//droite
		 assertEquals(3, e.getReineB1().getPosition().getX());
		 assertEquals(3, e.getReineB1().getPosition().getY());
		 
		 e.verificationMouvement(jn, "c7","c5");
		 e.verificationMouvement(jn, "c5", "c4");
		 e.verificationMouvement(jb, "c3", "c4");//mangeage
		 assertEquals(3, e.getReineB1().getPosition().getX());
		 assertEquals(4, e.getReineB1().getPosition().getY());
	 }
}