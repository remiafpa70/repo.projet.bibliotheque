/**
 * 
 */
package fr.afpa.bibliotheque.business;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

/**
 * @author bilonjea
 *
 */
public interface LivreBusiness {

	public int getLibreByCategory(String cat);
	List<Livre> getAllBooks();
}

/*public int getNbAuthors() {
	String query = "Select count(*) from authors ";
	return jdbcTemplate.queryForObject(query, Integer.class);
}*/
