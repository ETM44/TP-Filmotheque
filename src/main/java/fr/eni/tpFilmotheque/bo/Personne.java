package fr.eni.tpFilmotheque.bo;

public class Personne {

	private String nom;
	private String prenom;
//	private ArrayList<Film> filmRealise = new ArrayList<Film>();
//	private ArrayList<Film> filmJoue = new ArrayList<Film>();
	
	public Personne() {
		super();
	}
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
//	public void addFilmRealise(Film film) {
//		this.filmRealise.add(film);
//	}
//	
//	public void removeFilmRealise(Film film) {
//		this.filmRealise.remove(film);
//	}
//	
//	public void addFilmJoue(Film film) {
//		this.filmJoue.add(film);
//	}
//	
//	public void removeFilmJoue(Film film) {
//		this.filmJoue.remove(film);
//	}
	
		
	
}
