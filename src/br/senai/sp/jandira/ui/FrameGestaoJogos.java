package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class FrameGestaoJogos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValorEstimado;
	private JTextField txtObservacoes;

	public FrameGestaoJogos() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo do Jogo:");
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTitulo.setBounds(30, 74, 93, 26);
		contentPane.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTitulo.setBounds(127, 75, 203, 26);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Arial", Font.PLAIN, 14));
		lblFabricante.setBounds(51, 111, 72, 26);
		contentPane.add(lblFabricante);
		
		JComboBox comboBoxFabricante = new JComboBox();
		comboBoxFabricante.setFont(new Font("Arial", Font.BOLD, 12));
		comboBoxFabricante.setBounds(127, 111, 203, 26);
		contentPane.add(comboBoxFabricante);
		
		JCheckBox CheckBoxZerado = new JCheckBox("Zerado");
		CheckBoxZerado.setFont(new Font("Arial", Font.PLAIN, 14));
		CheckBoxZerado.setBounds(127, 146, 106, 26);
		contentPane.add(CheckBoxZerado);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setFont(new Font("Arial", Font.PLAIN, 14));
		lblConsole.setBounds(67, 178, 56, 26);
		contentPane.add(lblConsole);
		
		JComboBox comboBoxConsole = new JComboBox();
		comboBoxConsole.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxConsole.setBounds(127, 179, 203, 26);
		contentPane.add(comboBoxConsole);
		
		JLabel lblValorEstimado = new JLabel("Valor Estimado:");
		lblValorEstimado.setFont(new Font("Arial", Font.PLAIN, 14));
		lblValorEstimado.setBounds(24, 218, 99, 26);
		contentPane.add(lblValorEstimado);
		
		txtValorEstimado = new JTextField();
		txtValorEstimado.setFont(new Font("Arial", Font.PLAIN, 14));
		txtValorEstimado.setColumns(10);
		txtValorEstimado.setBounds(127, 219, 117, 26);
		contentPane.add(txtValorEstimado);
		
		txtObservacoes = new JTextField();
		txtObservacoes.setFont(new Font("Arial", Font.PLAIN, 14));
		txtObservacoes.setColumns(10);
		txtObservacoes.setBounds(127, 255, 203, 99);
		contentPane.add(txtObservacoes);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setFont(new Font("Arial", Font.PLAIN, 14));
		lblObservacoes.setBounds(34, 255, 89, 26);
		contentPane.add(lblObservacoes);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBackground(new Color(0, 191, 255));
		btnSalvar.setBounds(163, 385, 125, 46);
		contentPane.add(btnSalvar);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMeusJogos.setBounds(381, 74, 93, 26);
		contentPane.add(lblMeusJogos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(381, 98, 266, 285);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnSubir = new JButton("\u2191");
		btnSubir.setBackground(new Color(0, 191, 255));
		btnSubir.setForeground(new Color(255, 255, 255));
		btnSubir.setBounds(411, 388, 100, 41);
		contentPane.add(btnSubir);
		
		JButton btnDescer = new JButton("\u2193");
		btnDescer.setBackground(new Color(0, 191, 255));
		btnDescer.setForeground(new Color(255, 255, 255));
		btnDescer.setBounds(521, 388, 99, 41);
		contentPane.add(btnDescer);
		
	}
}
