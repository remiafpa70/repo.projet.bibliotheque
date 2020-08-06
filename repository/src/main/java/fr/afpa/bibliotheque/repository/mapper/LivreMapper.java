package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Livre;


public class LivreMapper implements RowMapper<Livre>{

	@Override
	public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
		Livre Livre = new Livre();
		
		Livre.setIdlivre(rs.getInt("idlivre"));
		Livre.setTitre(rs.getString("titre"));
		return Livre;
		
	}

}
