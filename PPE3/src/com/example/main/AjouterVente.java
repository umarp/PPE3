package com.example.main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AjouterVente {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterVente window = new AjouterVente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AjouterVente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1118,672);
		frame.getContentPane().setBackground(new Color(140, 0, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblAjouter = new JLabel("Ajouter une vente");
		lblAjouter.setForeground(Color.LIGHT_GRAY);
		lblAjouter.setBackground(Color.LIGHT_GRAY);
		lblAjouter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblAjouter.setBounds(456, 0, 196, 30);
		frame.getContentPane().add(lblAjouter);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(21, 48, 125, 45);
		frame.getContentPane().add(btnRetour);
		
		JButton btnSoumettre = new JButton("Soumettre");
		btnSoumettre.setBounds(502, 472, 150, 45);
		frame.getContentPane().add(btnSoumettre);
		
		textField = new JTextField();
		textField.setBounds(576, 177, 120, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(576, 245, 120, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(576, 311, 120, 30);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(576, 376, 120, 30);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero Client");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(378, 175, 155, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNumeroEmploye = new JLabel("Numero employe\u00E9");
		lblNumeroEmploye.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroEmploye.setForeground(Color.LIGHT_GRAY);
		lblNumeroEmploye.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumeroEmploye.setBounds(366, 243, 155, 30);
		frame.getContentPane().add(lblNumeroEmploye);
		
		JLabel lblNumeroVoiture = new JLabel("Numero voiture");
		lblNumeroVoiture.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroVoiture.setForeground(Color.LIGHT_GRAY);
		lblNumeroVoiture.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumeroVoiture.setBounds(366, 374, 155, 30);
		frame.getContentPane().add(lblNumeroVoiture);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantit.setForeground(Color.LIGHT_GRAY);
		lblQuantit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantit.setBounds(366, 309, 155, 30);
		frame.getContentPane().add(lblQuantit);
		
		JLabel lblRemplireLeFormulaire = new JLabel("Remplissez le formulaire pour effectuer une vente");
		lblRemplireLeFormulaire.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemplireLeFormulaire.setForeground(Color.LIGHT_GRAY);
		lblRemplireLeFormulaire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRemplireLeFormulaire.setBounds(305, 106, 469, 38);
		frame.getContentPane().add(lblRemplireLeFormulaire);
		frame.setTitle("Ajouter une Vente");
		frame.setSize(1118,672);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
