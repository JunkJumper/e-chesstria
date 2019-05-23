import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import joueurs.Joueur;
import piecesEchiquier.*;

class testGeneraux {
	private Echiquier e;
	private Joueur jb;
	
	@BeforeEach
	public void initialisation() {
		e = new Echiquier();
		jb = new Joueur("Joueur Blanc","Blanc");
	}
	
	@Test
	void testEchiquier() {
		//toString
		assertEquals("8 TN CN FN QN KN FN CN TN \n"
				+ "7 PN PN PN PN PN PN PN PN \n"
				+ "6 .. .. .. .. .. .. .. .. \n"
				+ "5 .. .. .. .. .. .. .. .. \n"
				+ "4 .. .. .. .. .. .. .. .. \n"
				+ "3 .. .. .. .. .. .. .. .. \n"
				+ "2 PB PB PB PB PB PB PB PB \n"
				+ "1 TB CB FB QB KB FB CB TB \n"
				+ "  A  B  C  D  E  F  G  H", e.toString());

		//verificationMouvement fait dans test piece
		
		//estVide
		/*Position p = new Position(3, 6);
		assertTrue(e.estVide(p));*/
		for (int x = 1; x < 9; x++) {
			for (int y = 3; y < 7; y++) {
				Position p = new Position(x, y);
				assertTrue(e.estVide(p));
			}
		}
		
		for (int x = 1; x < 9; x++) {
			for (int y = 1; y < 3; y++) {
				Position p = new Position(x, y);
				assertFalse(e.estVide(p));
			}
		}
		for (int x = 1; x < 9; x++) {
			for (int y = 7; y < 9; y++) {
				Position p = new Position(x, y);
				assertFalse(e.estVide(p));
			}
		}
	}
	
	@Test
	public void testePiece () {
		//aBouge
		e.verificationMouvement(jb, "C2", "c3");
		assertTrue(e.getPionB3().aBouge());
		
		assertFalse(e.getCavalierB1().aBouge());
	}
}
