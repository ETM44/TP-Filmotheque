package fr.eni.tpFilmotheque.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true, length = 50)
	private String genre;
	//private ArrayList<Film> film = new ArrayList<Film>();
	
	public Genre() {
		super();
	}
	
	public Genre(String genre) {
		super();
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

//	public void addFilm(Film film) {
//		this.film.add(film);
//	}
//	
//	public void removeFilm(Film film) {
//		this.film.remove(film);
//	}
	
	@Override
	public String toString() {
		return "Genre [genre=" + genre + "]";
	}	
	
}
