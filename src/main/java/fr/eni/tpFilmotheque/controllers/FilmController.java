package fr.eni.tpFilmotheque.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.tpFilmotheque.bo.Film;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Personne;
import fr.eni.tpFilmotheque.models.FilmModel;
import fr.eni.tpFilmotheque.services.ListeFilmService;

@Controller
@RequestMapping({"/film"})
public class FilmController {

	private ListeFilmService listeFilmService;
	
	public FilmController(ListeFilmService listeFilmService) {
		super();
		this.listeFilmService = listeFilmService;
	}

	@RequestMapping({"/detail"})
	public String detailFilm(@ModelAttribute FilmModel filmModel) {
				
		filmModel.setFilm(listeFilmService.listeFilms().get(0));			
		
		return "pages/detail-film";
	}
	
	@RequestMapping({"/liste"})
	public String listeFilm(@ModelAttribute FilmModel filmModel) {
		
		filmModel.setFilms(listeFilmService.listeFilms());			
		
		return "pages/liste-film";
	}
	
	@GetMapping({"/ajout"})
	public String afficherFormulaireFilm(Model model) {
		
		model.addAttribute("film", new Film("",new Date(),90,new Genre(),new Personne()));
		
		return "pages/ajout-film";
	}
	
	@PostMapping({"/ajout"})
	public String ajoutFilm(@ModelAttribute("film") Film film) {
		
		System.out.println(film);
		
		return "redirect:/film/liste";
	}
	
}
