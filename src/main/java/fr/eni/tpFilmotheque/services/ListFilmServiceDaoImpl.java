package fr.eni.tpFilmotheque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Film;
import fr.eni.tpFilmotheque.dal.FilmRepository;

@Profile( "DaoImpl")
@Service
public class ListFilmServiceDaoImpl implements ListeFilmService {
	private FilmRepository filmRepository;
	
	@Autowired
	public ListFilmServiceDaoImpl(FilmRepository filmRepository) {
		super();
		this.filmRepository = filmRepository;
	}

	@Override
	public List<Film> listeFilms() {
		return filmRepository.findAll();
	}

}
