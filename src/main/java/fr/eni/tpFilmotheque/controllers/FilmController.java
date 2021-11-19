package fr.eni.tpFilmotheque.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.tpFilmotheque.bo.Film;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Personne;

@Controller
@RequestMapping({"/film"})
public class FilmController {

	@RequestMapping({"/detail"})
	public String detailFilm() {
		
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
		
		ArrayList<Film> listFilm = new ArrayList<Film>();
		listFilm.add(uneNuitEnEnfer);		
		
		
		return "pages/detail-film";
	}
	
}
