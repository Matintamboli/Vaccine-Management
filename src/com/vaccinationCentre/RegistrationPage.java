package com.vaccinationCentre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(10, 10, 780, 98);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel rregistrationPage = new JLabel("Registration Page");
		rregistrationPage.setBackground(new Color(139, 0, 139));
		rregistrationPage.setHorizontalAlignment(SwingConstants.CENTER);
		rregistrationPage.setFont(new Font("Tahoma", Font.BOLD, 25));
		rregistrationPage.setBounds(217, 5, 266, 83);
		panel.add(rregistrationPage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(329, 177, 179, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel firstNm = new JLabel("First Name:");
		firstNm.setFont(new Font("Tahoma", Font.BOLD, 15));
		firstNm.setHorizontalAlignment(SwingConstants.RIGHT);
		firstNm.setBounds(204, 177, 115, 40);
		contentPane.add(firstNm);
		
		JLabel middleNm = new JLabel("Middle  Name:");
		middleNm.setHorizontalAlignment(SwingConstants.RIGHT);
		middleNm.setFont(new Font("Tahoma", Font.BOLD, 15));
		middleNm.setBounds(204, 242, 115, 40);
		contentPane.add(middleNm);
		
		JLabel lastNm = new JLabel("Last Name:");
		lastNm.setHorizontalAlignment(SwingConstants.RIGHT);
		lastNm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lastNm.setBounds(204, 311, 115, 40);
		contentPane.add(lastNm);
		
		JLabel phone = new JLabel("Phone No:");
		phone.setHorizontalAlignment(SwingConstants.RIGHT);
		phone.setFont(new Font("Tahoma", Font.BOLD, 15));
		phone.setBounds(204, 377, 115, 40);
		contentPane.add(phone);
		
		JLabel email = new JLabel("Email Id:");
		email.setHorizontalAlignment(SwingConstants.RIGHT);
		email.setFont(new Font("Tahoma", Font.BOLD, 15));
		email.setBounds(204, 436, 115, 40);
		contentPane.add(email);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Agency FB", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(329, 513, 107, 40);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Agency FB", Font.BOLD, 16));
		rdbtnFemale.setBounds(456, 513, 107, 40);
		contentPane.add(rdbtnFemale);
		
		JLabel gender = new JLabel("Gender:");
		gender.setHorizontalAlignment(SwingConstants.RIGHT);
		gender.setFont(new Font("Tahoma", Font.BOLD, 15));
		gender.setBounds(204, 513, 115, 40);
		contentPane.add(gender);
		
		JLabel addrress = new JLabel("Addrress:");
		addrress.setHorizontalAlignment(SwingConstants.RIGHT);
		addrress.setFont(new Font("Tahoma", Font.BOLD, 15));
		addrress.setBounds(204, 579, 115, 40);
		contentPane.add(addrress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(329, 589, 348, 90);
		contentPane.add(textArea);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		submit.setForeground(new Color(0, 0, 0));
		submit.setFont(new Font("Tahoma", Font.BOLD, 23));
		submit.setBackground(new Color(0, 255, 0));
		submit.setBounds(369, 713, 121, 40);
		contentPane.add(submit);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reset.setForeground(Color.BLACK);
		reset.setFont(new Font("Tahoma", Font.BOLD, 23));
		reset.setBackground(Color.GREEN);
		reset.setBounds(513, 713, 121, 40);
		contentPane.add(reset);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(329, 314, 173, 40);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(329, 377, 173, 40);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(329, 436, 173, 40);
		contentPane.add(textField_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(329, 242, 173, 40);
		contentPane.add(textField);
		setUndecorated(true);
	}
}
