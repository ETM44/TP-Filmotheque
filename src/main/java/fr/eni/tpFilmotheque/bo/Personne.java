package fr.eni.tpFilmotheque.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String nom;
	
	@Column(nullable = false, length = 50)
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
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
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
