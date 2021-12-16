package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.sun.source.tree.IfTree;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogoRepository;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FrameGestaoJogos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValorEstimado;
	private int posicao;

	public FrameGestaoJogos() {
		setTitle("Cole\u00E7\u00E3o de Jogos");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 478);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 232, 232));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("JOGOS");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel.setBounds(236, 11, 142, 53);
		contentPane.add(lblNewLabel);

		JLabel icone = new JLabel();
		// status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		icone.setBounds(163, 10, 70, 54);
		icone.setIcon(new ImageIcon("../gestaoJogos/src/br/senai/sp/jandira/images/videogame.png"));
		contentPane.add(icone);

		JLabel icone1 = new JLabel();
		// status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		icone1.setBounds(387, 11, 70, 54);
		icone1.setIcon(new ImageIcon("../gestaoJogos/src/br/senai/sp/jandira/images/videogame.png"));
		contentPane.add(icone1);

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

		DefaultComboBoxModel<String> modelFabricantes = new DefaultComboBoxModel<String>();

		FabricanteRepository fabricantes = new FabricanteRepository();

		for (Fabricante fabricante : fabricantes.getFabricantes()) {
			modelFabricantes.addElement(fabricante.getNome());
		}

		comboBoxFabricante.setModel(modelFabricantes);
		contentPane.add(comboBoxFabricante);

		JCheckBox checkBoxZerado = new JCheckBox("Zerado");
		checkBoxZerado.setFont(new Font("Arial", Font.PLAIN, 14));
		checkBoxZerado.setBounds(127, 146, 106, 26);
		checkBoxZerado.setBackground(new Color(232, 232, 232));
		contentPane.add(checkBoxZerado);

		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setFont(new Font("Arial", Font.PLAIN, 14));
		lblConsole.setBounds(67, 178, 56, 26);
		contentPane.add(lblConsole);

		JComboBox comboBoxConsole = new JComboBox();
		comboBoxConsole.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxConsole.setBounds(127, 179, 203, 26);

		DefaultComboBoxModel<String> modelConsoles = new DefaultComboBoxModel<String>();

		for (Console console : Console.values()) {
			modelConsoles.addElement(console.getDescrição());
		}

		comboBoxConsole.setModel(modelConsoles);
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

		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setFont(new Font("Arial", Font.PLAIN, 14));
		lblObservacoes.setBounds(34, 255, 89, 26);
		contentPane.add(lblObservacoes);

		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMeusJogos.setBounds(381, 74, 93, 26);
		contentPane.add(lblMeusJogos);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(381, 98, 266, 285);
		contentPane.add(scrollPane);

		DefaultListModel<String> listModel = new DefaultListModel<String>();
		JList listJogos = new JList(listModel);
		scrollPane.setViewportView(listJogos);

		JButton btnSubir = new JButton("\u2191");
		btnSubir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubir.setBackground(new Color(0, 191, 255));
		btnSubir.setForeground(Color.WHITE);
		btnSubir.setBounds(411, 388, 100, 41);
		contentPane.add(btnSubir);
		btnSubir.setEnabled(false);

		JButton btnDescer = new JButton("\u2193");
		btnDescer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDescer.setBackground(new Color(0, 191, 255));
		btnDescer.setForeground(new Color(255, 255, 255));
		btnDescer.setBounds(521, 388, 99, 41);
		contentPane.add(btnDescer);
		btnDescer.setEnabled(false);
		

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBackground(new Color(0, 191, 255));
		btnSalvar.setBounds(163, 385, 125, 46);
		contentPane.add(btnSalvar);
		
		JTextArea txtObservacoes = new JTextArea();
		txtObservacoes.setLineWrap(true);
		txtObservacoes.setBounds(127, 257, 203, 109);
		contentPane.add(txtObservacoes);

		JogoRepository colecao = new JogoRepository();
		
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Jogo jogo = new Jogo();
			
				jogo.setTitulo(txtTitulo.getText());
				jogo.setFabricante(fabricantes.listarFabricante(comboBoxFabricante.getSelectedIndex()));
				jogo.setZerado(checkBoxZerado.isSelected());
				jogo.setConsole(Console.values()[comboBoxConsole.getSelectedIndex()]);
				jogo.setValor(txtValorEstimado.getText());
				jogo.setObservacao(txtObservacoes.getText());

				colecao.gravar(jogo, posicao);
				posicao++;

				listModel.addElement(jogo.getTitulo());

			}
		});
		
		listJogos.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Jogo jogo = colecao.listarJogo(listJogos.getSelectedIndex());
				txtTitulo.setText(jogo.getTitulo());
				comboBoxFabricante.setSelectedIndex(Arrays.asList(fabricantes.getFabricantes()).indexOf(jogo.getFabricante()));
				checkBoxZerado.setSelected(jogo.isZerado());
				comboBoxConsole.setSelectedIndex(jogo.getConsole().ordinal());
				txtValorEstimado.setText(jogo.getValor());;
				txtObservacoes.setText(jogo.getObservacao());

				
				btnSubir.setEnabled(true);
				btnDescer.setEnabled(true);
				
			}
		});
		
		

		btnSubir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int posicaoList = listJogos.getSelectedIndex();
				
				if(posicaoList == listJogos.getFirstVisibleIndex()) {
					listJogos.setSelectedIndex(listJogos.getLastVisibleIndex());
				}
				
				else {
					listJogos.setSelectedIndex(posicaoList-1);
				}
			}
		});
		
		btnDescer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int posicaoList = listJogos.getSelectedIndex();
				
				if(posicaoList == listJogos.getLastVisibleIndex()) {
					listJogos.setSelectedIndex(listJogos.getFirstVisibleIndex());
				}
				
				else {
					listJogos.setSelectedIndex(posicaoList+1);
				}
			}
		});
	}
}
