import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import joueurs.Joueur;
import piecesEchiquier.*;

class testPiece {
	private Echiquier e;
	private Joueur j;
	
	@BeforeEach
	public void initialisation() {
		Echiquier e = new Echiquier();
		Joueur j = new Joueur("Marion la Stagiaire","Blanc");
	}

	@Test
	void testVerif() {
		assertFalse(e.VerifFinale(j, "A4", "A5")); //choix de case vide
		assertFalse(e.VerifFinale(j, "A7", "A8")); //mauvais choix de pion
		assertFalse(e.VerifFinale(j, "A1", "A2")); //manger pion allier
		assertFalse(e.VerifFinale(j, "A2", "B5")); //mauvais deplacement
	}
	
	 @Test
	 void testTour() {
		 e.getPionB1().getPosition().setX(5);
		 e.getPionB1().getPosition().setY(4);
		 e.VerifFinale(j, "A1", "A4");
		 assertEquals(0, e.getPionB1().getPosition().getX());
		 assertEquals(4, e.getPionB1().getPosition().getY());
		 e.VerifFinale(j, "A4", "F4");
		 assertEquals(5, e.getPionB1().getPosition().getX());
		 assertEquals(4, e.getPionB1().getPosition().getY());

		 assertTrue(e.VerifFinale(j, "F4", "F7"));
	 }

}
