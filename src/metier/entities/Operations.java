package metier.entities;

import java.io.Serializable;


public class Operations implements Serializable {
	
	private Long id;
	private String dateOperation;
	private double montant;
	private Compte compte;
	
	
	public Operations() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Operations(String dateOperation, double montant, Compte compte) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.compte = compte;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDateOperation() {
		return dateOperation;
	}



	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}



	public double getMontant() {
		return montant;
	}



	public void setMontant(double montant) {
		this.montant = montant;
	}



	public Compte getCompte() {
		return compte;
	}



	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	


}
