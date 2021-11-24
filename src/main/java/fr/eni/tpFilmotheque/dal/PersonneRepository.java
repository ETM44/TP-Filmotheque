package fr.eni.tpFilmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tpFilmotheque.bo.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
