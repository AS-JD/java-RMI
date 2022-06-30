package Client;

import java.io.Serializable;

public class Produit implements Serializable{
	private int code;//identifiant
	private double prix;
	private String nom;//libellé
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Produit(int code, double prix, String nom) {
		this.code = code;
		this.prix = prix;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Produit [code=" + code + ", prix=" + prix + ", nom=" + nom + "]";
	}
	
	
	

}
