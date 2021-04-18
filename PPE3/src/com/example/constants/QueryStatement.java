package com.example.constants;

/*
 * @author Sam Ong
 * 
 */

public class QueryStatement {
	
	public final static String ADD_VENTE = "INSERT INTO vente(No_vente,Quantite,NoVoiture,No_Emp,NoClient) VALUES(?,?,?,?,?)";
	public final static String UPDATE = "UPDATE vente SET No_vente=?, Quantite=?,NoVoiture=?,No_Emp=?,NoClient=? where No_vente=?";
	public final static String DELETE = "DELETE FROM vente WHERE No_vente=?";
	public final static String LIST = "SELECT distinct(No_vente),NoClient,clients.Nom,"
			+ "vente.No_Emp,employes.Nom,voitures.Modele,voitures.Marque,Quantite,NoVoiture"
			+ " FROM vente, clients,voitures,employes "
			+ "WHERE vente.No_Emp=employes.No_employe AND vente.NoVoiture=voitures.No_voiture AND vente.NoClient= clients.No_client";
	public final static String SELECT = "SELECT * FROM vente WHERE No_vente=?";
	

}	