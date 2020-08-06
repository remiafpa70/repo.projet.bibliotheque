/**
 * 
 */
package fr.afpa.bibliotheque.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.service.LivreService;

/**
 * @author bilonjea
 *
 */
@Component
public class LivreBusinessImpl implements LivreBusiness{
	
	@Autowired
	LivreService serviceLivre;
	
	public int getLibreByCategory(String cat) {
		return serviceLivre.getNbLivre(cat);
	}
	@Override
	public List<Livre> getAllBooks() {
		
		return serviceLivre.getAllBooks();
	}
	

}
