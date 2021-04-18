package com.example.utilities;

/*
 * @author Bryan Bataluna
 * @edited-by Sam Ong
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.example.constants.QueryStatement;
import com.example.db.ConnectionFactory;
import com.example.model.Vente;


public class DBUtil {
	private static final Vente vente = null;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet = null;
	private static List<Vente> venteList = new ArrayList<Vente>();

	public static void addVente(Vente vente) throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.ADD_VENTE);

		setPreparedStatementProperties(vente.getNo_vente(), 
				vente.getQuantite(),
				vente.getNoVoiture(), 
				vente.getNo_Emp(), 
				vente.getNoClient());
		preparedStatement.executeUpdate();

		closeConnections();
	}

	public static void updateVente(Vente vente) throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.UPDATE);

		setPreparedStatementProperties(vente.getNo_vente(), 
				vente.getQuantite(),
				vente.getNoVoiture(), 
				vente.getNo_Emp(), 
				vente.getNoClient(),
				vente.getNo_vente());
		preparedStatement.executeUpdate();

		closeConnections();
	}

	public static void deleteStudent(Vente vente) throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.DELETE);

		setPreparedStatementProperties(vente.getNo_vente() );
		preparedStatement.executeUpdate();

		closeConnections();
	}

	public void getVente(JTable table) throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.LIST);

		resultSet = preparedStatement.executeQuery();

		venteList.clear();
		DefaultTableModel tableModel = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"No Vente", "Numero Client","Nom Client","Numero Employeé","Nom Employeé","Quantite","Numero voiture", "Marque", "Modele"
				});
		while (resultSet.next()) {
			Vente vente = new Vente();
			String idVente = Integer.toString(resultSet.getInt("No_vente"));
			String idClient = Integer.toString(resultSet.getInt("NoClient"));
			String nomClient = (resultSet.getString("clients.Nom"));
			String idEmp = Integer.toString(resultSet.getInt("vente.No_Emp"));
			String nomEmp = (resultSet.getString("employes.Nom"));
			String quantite= Integer.toString(resultSet.getInt("Quantite"));
			String voiture = Integer.toString(resultSet.getInt("NoVoiture"));
			String marque = (resultSet.getString("voitures.Marque"));
			String modele = (resultSet.getString("voitures.Modele"));

			venteList.add(vente);


			String[] data = {idVente, idClient, nomClient, idEmp, nomEmp,quantite,voiture,marque,modele};
System.out.println("working?");

			// and add this row of data into the table model
			tableModel.addRow(data);



		}

		table.setModel(tableModel);
	}




	public static Vente selStudent() throws SQLException {
		connection = ConnectionFactory.getConnection();
		preparedStatement = connection.prepareStatement(QueryStatement.SELECT);

		preparedStatement.execute();
		venteList.clear();


		Vente vente = new Vente();
		vente.getNo_vente();
		vente.getQuantite();
		vente.getNoVoiture();
		vente.getNo_Emp();
		vente.getNoClient();


		return vente;

	}
	private static void closeConnections() throws SQLException {
		if (resultSet != null) {
			resultSet.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}

	// @param variable length array of strings as student properties
	private static void setPreparedStatementProperties(int... strArgs) throws SQLException {
		for (int i = 0; i < strArgs.length; i++) {
			preparedStatement.setInt(i + 1, strArgs[i]);
		}
	}


}