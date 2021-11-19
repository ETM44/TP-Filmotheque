package fr.eni.tpFilmotheque.bo;

import java.util.ArrayList;
import java.util.Date;

public class Film {
	
	private String titre;
	private Date anneeDeSortie;
	private Integer duree;
	private Genre genre;
	private Personne realisateur;
	private ArrayList<Personne> acteur = new ArrayList<Personne>();
	
	public Film() {
		super();
	}

	public Film(String titre, Date anneeDeSortie, Integer duree, Genre genre, Personne realisateur) {
		super();
		this.titre = titre;
		this.anneeDeSortie = anneeDeSortie;
		this.duree = duree;
		this.genre = genre;
		this.realisateur = realisateur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getAnneeDeSortie() {
		return anneeDeSortie;
	}

	public void setAnneeDeSortie(Date anneeDeSortie) {
		this.anneeDeSortie = anneeDeSortie;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}

	public ArrayList<Personne> getActeur() {
		return acteur;
	}

	public void setActeur(ArrayList<Personne> acteur) {
		this.acteur = acteur;
	}

	public void addActeur(Personne personne) {
		this.acteur.add(personne);
	}
	
	public void removeActeur(Personne personne) {
		this.acteur.remove(personne);
	}

	@Override
	public String toString() {
		return "Film [titre=" + titre + ", anneeDeSortie=" + anneeDeSortie + ", duree=" + duree + ", realisateur="
				+ realisateur + ", acteur=" + acteur + "]";
	}
	
}
