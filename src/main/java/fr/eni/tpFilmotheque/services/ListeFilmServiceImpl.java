package fr.eni.tpFilmotheque.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Film;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Personne;

@Service
public class ListeFilmServiceImpl implements ListeFilmService {

	ArrayList<Film> films = new ArrayList<Film>();
		
	public ListeFilmServiceImpl() {
		super();
		Personne tarantino = new Personne("Tarantino", "Quentin");
		Genre horreur = new Genre("horreur");
		Film uneNuitEnEnfer = null;
		try {
			uneNuitEnEnfer = new Film("Une nuit en enfer",(new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE)).parse("1996/01/01"),60,horreur,tarantino);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uneNuitEnEnfer.addActeur(tarantino);
		
		this.films.add(uneNuitEnEnfer);
	}

	@Override
	public ArrayList<Film> listeFilms() {
		return this.films;
	}

}
