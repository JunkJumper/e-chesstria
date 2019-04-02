package joueurs;

public class Joueur {
	private String nom;
	private String couleur;
	//private boolean tour = false;
	
	public Joueur() {
	this.nom = null;
	this.couleur = null;
	}

	public Joueur(String n, String c) {
		nom = n;
		couleur = c;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


}
