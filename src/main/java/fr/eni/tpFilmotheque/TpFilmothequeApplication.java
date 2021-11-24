package fr.eni.tpFilmotheque;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.eni.tpFilmotheque.bo.Film;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Personne;
import fr.eni.tpFilmotheque.dal.FilmRepository;
import fr.eni.tpFilmotheque.dal.GenreRepository;
import fr.eni.tpFilmotheque.dal.PersonneRepository;

@SpringBootApplication
public class TpFilmothequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpFilmothequeApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(GenreRepository genreRepo, PersonneRepository persRepo, FilmRepository filmRepo) {
		return (args) -> {
			
			Genre comedie = new Genre("Comédie");
			Genre horreur = new Genre("Horreur");
			Genre action = new Genre("Action");
			Genre sf = new Genre("Science fiction");
			
			genreRepo.save(comedie);
			genreRepo.save(horreur);
			genreRepo.save(action);
			genreRepo.save(sf);
			
			Personne tarantino = new Personne("Tarantino", "Quentin"); 
			persRepo.save(tarantino);
			Personne berberian = new Personne("Berberian", "Alain"); 
			persRepo.save(berberian); 
			Personne chabat = new Personne("Chabat", "Alain"); 
			persRepo.save(chabat);
			
			Film uneNuitEnEnfer = null;
			try {
				uneNuitEnEnfer = new Film("Une nuit en enfer",(new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE)).parse("1996/01/01"),90,horreur,tarantino);
				uneNuitEnEnfer.addActeur(tarantino);
				
				filmRepo.save(uneNuitEnEnfer);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			Film laCiteDeLaPeur = null;
			try {
				laCiteDeLaPeur = new Film("La cité de la peur",(new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE)).parse("1994/03/09"),90,comedie,berberian);
				laCiteDeLaPeur.addActeur(chabat);
				
				filmRepo.save(laCiteDeLaPeur);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		};
	}
	
}
