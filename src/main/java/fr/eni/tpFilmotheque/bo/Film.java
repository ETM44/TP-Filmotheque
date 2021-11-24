package fr.eni.tpFilmotheque.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Film implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique=true, length = 50)
	private String titre;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date anneeDeSortie;
	
	@Column(nullable = false)
	private Integer duree;
	
	@ManyToOne()
	private Genre genre;
	
	@ManyToOne()
	private Personne realisateur;
	
	@ManyToMany(fetch = FetchType.EAGER) 
	@JoinTable(name="acteur", 
	           joinColumns= {@JoinColumn(name="film_id")},
	           inverseJoinColumns= {@JoinColumn(name="personne_id")}
	)
	private List<Personne> acteur = new ArrayList<Personne>();
	
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

	public Film(Long id, String titre, Date anneeDeSortie, Integer duree, Genre genre, Personne realisateur,
			ArrayList<Personne> acteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.anneeDeSortie = anneeDeSortie;
		this.duree = duree;
		this.genre = genre;
		this.realisateur = realisateur;
		this.acteur = acteur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Personne> getActeur() {
		return acteur;
	}

	public void setActeur(List<Personne> acteur) {
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
		return "Film [id=" + id + ", titre=" + titre + ", anneeDeSortie=" + anneeDeSortie + ", duree=" + duree
				+ ", genre=" + genre + ", realisateur=" + realisateur + ", acteur=" + acteur + "]";
	}
	
}
