import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import joueurs.Joueur;
import piecesEchiquier.*;

/*
 * @AfterEach is used to signal that the annotated method should beexecuted after each @Test, @RepeatedTest, @ParameterizedTest, @TestFactory,and @TestTemplate method in the current test class. 
 * org.junit.jupiter.api.AfterEach;
 * 
 * @BeforeEach is used to signal that the annotated method should beexecuted before each @Test, @RepeatedTest, @ParameterizedTest, @TestFactory,and @TestTemplate method in the current test class. 
 * org.junit.jupiter.api.BeforeEach;
 *
 * @Test is used to signal that the annotated method is a test method. 
 * @Test methods must not be private or staticand must not return a value.
 * @Test methods may optionally declare parameters to beresolved by ParameterResolvers.
 * @Test may also be used as a meta-annotation in order to createa custom composed annotation that inherits the semantics of @Test. 
 * org.junit.jupiter.api.Test;
 * */

class testGeneraux {
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
		
		e.verificationMouvement(jb, "e2", "e4");
		Position p1 = new Position (5, 4);
		assertFalse(e.estVide(p1));
		Position p2 = new Position (5, 2);
		assertTrue(e.estVide(p2));
	}
	
	@Test
	public void testePiece () {
		//aBouge
		e.verificationMouvement(jb, "C2", "c3");
		assertTrue(e.getPionB3().aBouge());
		
		assertFalse(e.getCavalierB1().aBouge());
	}
	
	/*@Test
	public void testEchec () {
		e.verificationMouvement(jb, "e2", "e4");
		e.verificationMouvement(jn, "e7", "e5");
		e.verificationMouvement(jb, "d1", "g4");
		e.verificationMouvement(jn, "f7", "f5");
		e.verificationMouvement(jb, "g4", "g6");
		assertTrue(e.getRoiN1().metEnEchec(e, e.getReineB1()));
	}
	
	@Test
	public void testEchecEtMat () {
		System.out.println("prout");
		e.verificationMouvement(jb, "e2", "e4");
		e.verificationMouvement(jn, "e7", "e5");
		e.verificationMouvement(jb, "g1", "h3");
		e.verificationMouvement(jn, "b8", "c6");
		e.verificationMouvement(jb, "e1", "c4");
		e.verificationMouvement(jn, "d7", "d6");
		e.verificationMouvement(jb, "b1", "c3");
		e.verificationMouvement(jn, "c8", "g4");
		e.verificationMouvement(jb, "e3", "d5");
		e.verificationMouvement(jn, "g4", "d1");
		e.verificationMouvement(jb, "c4", "e7");
		e.verificationMouvement(jn, "e8", "e7");
		e.verificationMouvement(jb, "c3", "d5");
		assertTrue(e.getRoiN1().enEchecEtMat(e, e.getCavalierB1()));
	}*/
}
