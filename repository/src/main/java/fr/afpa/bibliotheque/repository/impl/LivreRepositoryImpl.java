package fr.afpa.bibliotheque.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepository;
import fr.afpa.bibliotheque.repository.mapper.LivreMapper;


@Repository
public class LivreRepositoryImpl implements LivreRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int getNbLivreByCategory(String categoryName) {
        //TODO Faire les requetes  faire une vraie requête sql
		return 15;
	}
public List<Livre> getAllBooks(){
	
	String query = "Select * from Livre ";
	
	return jdbcTemplate.query(query, new LivreMapper());
}
}
