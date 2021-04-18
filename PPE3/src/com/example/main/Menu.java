package com.example.main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Menu {

	JFrame frmDepartementsDeVente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmDepartementsDeVente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDepartementsDeVente = new JFrame();
		frmDepartementsDeVente.setTitle("Departements de Vente");
		frmDepartementsDeVente.setBounds(100, 100, 1118,672);
		frmDepartementsDeVente.getContentPane().setBackground(new Color(128, 0, 0));
		frmDepartementsDeVente.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Voir les vente");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListDesVentes home = null;
				try {
					home = new ListDesVentes();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				home.frame.setVisible(true);
				frmDepartementsDeVente.setVisible(false); //you can't see me!
				frmDepartementsDeVente.dispose(); //Destroy the JFrame object
				
			}
		});
		btnNewButton.setBounds(480, 227, 144, 70);
		frmDepartementsDeVente.getContentPane().add(btnNewButton);
		frmDepartementsDeVente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon imgIcon = new ImageIcon(this.getClass().getResource("logo.png"));
		JLabel Label_img = new JLabel(imgIcon);
		Label_img.setBounds(359, 28, 375, 150);
		frmDepartementsDeVente.getContentPane().add(Label_img);
		
		JButton btnNewButton_1 = new JButton("Entrepot");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(480, 401, 144, 70);
		frmDepartementsDeVente.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Client");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(797, 227, 144, 70);
		frmDepartementsDeVente.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Stock");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(797, 401, 144, 70);
		frmDepartementsDeVente.getContentPane().add(btnNewButton_3);
		
		JButton btnModele = new JButton("Modele");
		btnModele.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnModele.setBounds(158, 227, 144, 70);
		frmDepartementsDeVente.getContentPane().add(btnModele);
		
		JButton btnMarque = new JButton("Marque");
		btnMarque.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMarque.setBounds(158, 401, 144, 70);
		frmDepartementsDeVente.getContentPane().add(btnMarque);
		
		JButton btnNewButton_4 = new JButton("Deconnecter!!!");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(480, 552, 144, 70);
		frmDepartementsDeVente.getContentPane().add(btnNewButton_4);
		
		
	}
}
