package fr.afpa.bibliotheque.repository;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreRepository {
	
	int getNbLivreByCategory(String categoryName); 
	
	List<Livre> getAllBooks();
	
	CreaLivre

}
