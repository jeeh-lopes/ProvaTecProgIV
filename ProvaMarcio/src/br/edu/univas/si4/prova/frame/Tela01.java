package br.edu.univas.si4.prova.frame;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela01 extends JFrame {

	private static final long serialVersionUID = -8580846796969412541L;
	
	private JPanel panel = null;
	
	public Tela01(){
		this.setSize(500, 400);
		this.setTitle("Prova");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContentPane();
		addComponents();
	}

	private void setContentPane(){
		panel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		panel.setLayout(gridBagLayout);
		this.setContentPane(panel);
	}
	
	private void addComponents(){
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nameLabel= new JLabel();
		nameLabel.setText("Nome: ");
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.LINE_END;
		gbc.insets= new Insets(15,15,10,15);
		panel.add(nameLabel,gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.weightx=1.0;
		gbc.insets= new Insets(15, 0, 10, 15);
		gbc.anchor= GridBagConstraints.CENTER;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		panel.add(nameTextField,gbc);
		
		JLabel emailLabel= new JLabel();
		emailLabel.setText("E-mail: ");
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.weightx=0;
		gbc.insets= new Insets(15, 15, 10, 15);
		gbc.anchor= GridBagConstraints.LINE_END;
		panel.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.weightx=1.0;
		gbc.insets= new Insets(15, 0, 10, 15);
		gbc.anchor=GridBagConstraints.LINE_START;
		panel.add(emailTextField, gbc);
		
		
		
		

	}
}