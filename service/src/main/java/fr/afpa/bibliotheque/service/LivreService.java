package fr.afpa.bibliotheque.service;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreService {
	
	int getNbLivre(String category);
	List<Livre> getAllBooks();

}
