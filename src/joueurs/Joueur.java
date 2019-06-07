package joueurs;

public class Joueur {
	private String nom;
	private String couleur;
	private boolean aGagne;
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

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", couleur=" + couleur + "]";
	}
	
	/**
	 * @return the aGagne
	 */
	public boolean isaGagne() {
		return aGagne;
	}

	/**
	 * @param aGagne the aGagne to set
	 */
	public void setaGagne(boolean aGagne) {
		this.aGagne = aGagne;
	}


}
