package com.vaccinationCentre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HomePage extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		getContentPane().setBackground(new Color(0, 191, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(10, 10, 580, 96);
		getContentPane().add(panel);
		
		JLabel homePage = new JLabel("Home Page");
		homePage.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(homePage);
		
		JButton login = new JButton("Login");
		login.setForeground(new Color(0, 0, 128));
		login.setBorderPainted(false);
		login.setBackground(new Color(0, 255, 0));
		login.setFont(new Font("Tahoma", Font.PLAIN, 20));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		login.setBounds(204, 201, 160, 48);
		getContentPane().add(login);
		
		JButton signUp = new JButton("Sign Up");
		signUp.setForeground(new Color(255, 228, 181));
		signUp.setActionCommand("Sign Up");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage hp = new RegistrationPage();
				hp.setVisible(true);
				setVisible(false);
				
			}
		});
		signUp.setBorderPainted(false);
		signUp.setBackground(new Color(147, 112, 219));
		signUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signUp.setBounds(204, 308, 160, 48);
		getContentPane().add(signUp);
	}
}
