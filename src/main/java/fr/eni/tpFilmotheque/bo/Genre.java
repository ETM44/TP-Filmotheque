package fr.eni.tpFilmotheque.bo;

import java.util.ArrayList;

public class Genre {

	private String genre;
	private ArrayList<Film> film = new ArrayList<Film>();
	
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

	public void addFilm(Film film) {
		this.film.add(film);
	}
	
	public void removeFilm(Film film) {
		this.film.remove(film);
	}
	
	@Override
	public String toString() {
		return "Genre [genre=" + genre + ", film=" + film + "]";
	}
	
	
	
}
