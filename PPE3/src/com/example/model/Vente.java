/**
 * 
 */
package com.example.model;

/**
 * @author Azhar
 *
 */
public class Vente {

	private int No_vente;
	private int Quantite;
	private int NoVoiture;
	private int No_Emp;
	private int NoClient;
	
	public Vente() {
	}
	
	public Vente(int No_vente,  int Quantite, int NoVoiture, int No_Emp, int NoClient){
		this.No_vente = No_vente;
		this.Quantite = Quantite;
		this.NoVoiture = NoVoiture;
		this.No_Emp = No_Emp;
		this.NoClient = NoClient;
	}

	public int getNo_vente() {
		return No_vente;
	}

	public void setNo_vente(int no_vente) {
		No_vente = no_vente;
	}

	public int getQuantite() {
		return Quantite;
	}

	public void setQuantite(int quantite) {
		Quantite = quantite;
	}

	public int getNoVoiture() {
		return NoVoiture;
	}

	public void setNoVoiture(int noVoiture) {
		NoVoiture = noVoiture;
	}

	public int getNo_Emp() {
		return No_Emp;
	}

	public void setNo_Emp(int no_Emp) {
		No_Emp = no_Emp;
	}

	public int getNoClient() {
		return NoClient;
	}

	public void setNoClient(int noClient) {
		NoClient = noClient;
	}
	
	
}
