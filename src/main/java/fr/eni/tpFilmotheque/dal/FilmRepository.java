package fr.eni.tpFilmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tpFilmotheque.bo.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {

}
