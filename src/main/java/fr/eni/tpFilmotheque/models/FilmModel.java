package fr.eni.tpFilmotheque.models;

import java.util.ArrayList;

import fr.eni.tpFilmotheque.bo.Film;

public class FilmModel {

	private Film film;
	private ArrayList<Film> films = new ArrayList<Film>();

	public FilmModel() {
		super();
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public ArrayList<Film> getFilms() {
		return films;
	}

	public void setFilms(ArrayList<Film> films) {
		this.films = films;
	}
	
	public void addFilm(Film film) {
		this.films.add(film);
	}
	
	public void removeFilm(Film film) {
		this.films.remove(film);
	}
	
}
