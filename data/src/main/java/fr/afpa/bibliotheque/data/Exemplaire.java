package fr.afpa.bibliotheque.data;

import lombok.Data;

@Data
public class Exemplaire {
	
	private int idexemplaire;
	private int diponibilite;
	private int fk_idlivre;

}
