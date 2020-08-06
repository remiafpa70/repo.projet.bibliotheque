package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
	public class Livre {
	
	private int idlivre;
	private String titre;
	private String description;
	private Double isbn;
	private Double code;

}
