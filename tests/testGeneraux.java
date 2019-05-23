import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import piecesEchiquier.*;

class testGeneraux {
	private Echiquier e;
	
	@BeforeEach
	public void initialisation() {
		e = new Echiquier();
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
		for (int i = 3; i < 6; i++) {
			for (int j = 1; i < 9; i++) {
				Position p = new Position(j, i);
				assertTrue(e.estVide(p));
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 1; i < 9; i++) {
				Position p = new Position(j, i);
				assertFalse(e.estVide(p));
			}
		}
		for (int i = 7; i < 9; i++) {
			for (int j = 1; i < 9; i++) {
				Position p = new Position(j, i);
				assertFalse(e.estVide(p));
			}
		}
	}

}
