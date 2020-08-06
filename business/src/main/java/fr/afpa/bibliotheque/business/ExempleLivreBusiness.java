/**
 * 
 */
package fr.afpa.bibliotheque.business;

/**
 * @author bilonjea
 *
 */
public interface ExempleLivreBusiness {

	public int getLibreByCategory(String cat);
}

/*public int getNbAuthors() {
	String query = "Select count(*) from authors ";
	return jdbcTemplate.queryForObject(query, Integer.class);
}*/
