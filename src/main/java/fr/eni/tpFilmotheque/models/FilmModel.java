package fr.eni.tpFilmotheque.models;

import java.util.ArrayList;
import java.util.List;

import fr.eni.tpFilmotheque.bo.Film;

public class FilmModel {

	private Film film;
	private List<Film> films = new ArrayList<Film>();

	public FilmModel() {
		super();
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
	public void addFilm(Film film) {
		this.films.add(film);
	}
	
	public void removeFilm(Film film) {
		this.films.remove(film);
	}
	
}
