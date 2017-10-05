package br.edu.univas.si4.prova.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Tela01 extends JFrame {

	private static final long serialVersionUID = -8580846796969412541L;
	
	private JPanel panel = null;
	
	public Tela01(){
		this.setSize(500, 450);
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
		
		/*JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.gray);
		westPanel.setPreferredSize(new Dimension(100, 0));
		panel.add(westPanel, BorderLayout.WEST);
		
		JButton button1 = new JButton();
		button1.setText("Botão 1");
		panel.add(button1);
		}*/
		
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
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 15, 15, 15); 
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		panel.add(saveButton, gbc);

		Object[][] rowData = {
				{"João", "111.111.111-11", "joao@gmail.com"},
				{"Maria", "222.222.222-22", "maria@gmail.com"},
				{"José", "333.333.333-33", "jose@gmail.com"}
		};
		
		Object[] columnNames = {
			"Nome",
			"CPF",
			"E-mail"
		};
		
		JTable dataTable = new JTable(rowData, columnNames);
		dataTable.setFillsViewportHeight(true);
		JScrollPane tableScrollPane = new JScrollPane(dataTable);
		tableScrollPane.setMinimumSize(new Dimension(100, 100));
		tableScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		panel.add(tableScrollPane, gbc);

	}
}