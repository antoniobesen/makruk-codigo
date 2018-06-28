package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import makruk.AtorJogador;

import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceTabuleiro extends JFrame {

	private JPanel contentPane;
	private AtorJogador atorJogador;

	private JLabel vPosicao11 = null;
	private JLabel vPosicao12 = null;
	private JLabel vPosicao13 = null;	
	private JLabel vPosicao14 = null;
	private JLabel vPosicao15 = null;
	private JLabel vPosicao16 = null;
	private JLabel vPosicao17 = null;
	private JLabel vPosicao18 = null;

	private JLabel vPosicao21 = null;
	private JLabel vPosicao22 = null;
	private JLabel vPosicao23 = null;	
	private JLabel vPosicao24 = null;
	private JLabel vPosicao25 = null;
	private JLabel vPosicao26 = null;
	private JLabel vPosicao27 = null;
	private JLabel vPosicao28 = null;
	
	private JLabel vPosicao31 = null;
	private JLabel vPosicao32 = null;
	private JLabel vPosicao33 = null;	
	private JLabel vPosicao34 = null;
	private JLabel vPosicao35 = null;
	private JLabel vPosicao36 = null;
	private JLabel vPosicao37 = null;
	private JLabel vPosicao38 = null;
	
	private JLabel vPosicao41 = null;
	private JLabel vPosicao42 = null;
	private JLabel vPosicao43 = null;	
	private JLabel vPosicao44 = null;
	private JLabel vPosicao45 = null;
	private JLabel vPosicao46 = null;
	private JLabel vPosicao47 = null;
	private JLabel vPosicao48 = null;
	
	private JLabel vPosicao51 = null;
	private JLabel vPosicao52 = null;
	private JLabel vPosicao53 = null;	
	private JLabel vPosicao54 = null;
	private JLabel vPosicao55 = null;
	private JLabel vPosicao56 = null;
	private JLabel vPosicao57 = null;
	private JLabel vPosicao58 = null;
	
	private JLabel vPosicao61 = null;
	private JLabel vPosicao62 = null;
	private JLabel vPosicao63 = null;	
	private JLabel vPosicao64 = null;
	private JLabel vPosicao65 = null;
	private JLabel vPosicao66 = null;
	private JLabel vPosicao67 = null;
	private JLabel vPosicao68 = null;
	
	private JLabel vPosicao71 = null;
	private JLabel vPosicao72 = null;
	private JLabel vPosicao73 = null;	
	private JLabel vPosicao74 = null;
	private JLabel vPosicao75 = null;
	private JLabel vPosicao76 = null;
	private JLabel vPosicao77 = null;
	private JLabel vPosicao78 = null;
	
	private JLabel vPosicao81 = null;
	private JLabel vPosicao82 = null;
	private JLabel vPosicao83 = null;	
	private JLabel vPosicao84 = null;
	private JLabel vPosicao85 = null;
	private JLabel vPosicao86 = null;
	private JLabel vPosicao87 = null;
	private JLabel vPosicao88 = null;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceTabuleiro frame = new InterfaceTabuleiro();
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
	public InterfaceTabuleiro() {
		atorJogador = new AtorJogador(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(800,750));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMakruk = new JLabel("MAKRUK");
		lblMakruk.setBounds(202, 12, 66, 15);
		contentPane.add(lblMakruk);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conectar();
			}
		});
		btnConectar.setBounds(29, 98, 114, 25);
		contentPane.add(btnConectar);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iniciarPartida();
			}

		});
		btnIniciar.setBounds(29, 138, 114, 25);
		contentPane.add(btnIniciar);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(29, 175, 114, 25);
		contentPane.add(btnNewButton);
		
		vPosicao11 = new JLabel();
		vPosicao11.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao11.setBounds(new Rectangle(220, 80, 70, 70));
		vPosicao11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(0,0);
			}
		});
		contentPane.add(vPosicao11);
		
		vPosicao21 = new JLabel();
		vPosicao21.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao21.setBounds(new Rectangle(220, 150, 70, 70));
		vPosicao21.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(1,0);
			}
		});
		contentPane.add(vPosicao21);
		
		vPosicao31 = new JLabel();
		vPosicao31.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao31.setBounds(new Rectangle(220, 220, 70, 70));
		vPosicao31.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(2,0);
			}
		});
		contentPane.add(vPosicao31);
		
		vPosicao41 = new JLabel();
		vPosicao41.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao41.setBounds(new Rectangle(220, 290, 70, 70));
		vPosicao41.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(3,0);
			}
		});
		contentPane.add(vPosicao41);
		
		vPosicao51 = new JLabel();
		vPosicao51.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao51.setBounds(new Rectangle(220, 360, 70, 70));
		vPosicao51.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(4,0);
			}
		});
		contentPane.add(vPosicao51);
		
		vPosicao61 = new JLabel();
		vPosicao61.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao61.setBounds(new Rectangle(220, 430, 70, 70));
		vPosicao61.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(5,0);
			}
		});
		contentPane.add(vPosicao61);
		
		vPosicao71 = new JLabel();
		vPosicao71.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao71.setBounds(new Rectangle(220, 500, 70, 70));
		vPosicao71.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(6,0);
			}
		});
		contentPane.add(vPosicao71);
		
		vPosicao81 = new JLabel();
		vPosicao81.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao81.setBounds(new Rectangle(220, 570, 70, 70));
		vPosicao81.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(7,0);
			}
		});
		contentPane.add(vPosicao81);
		
		vPosicao12 = new JLabel();
		vPosicao12.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao12.setBounds(new Rectangle(290, 80, 70, 70));
		vPosicao12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(0,1);
			}
		});
		contentPane.add(vPosicao12);
		
		vPosicao22 = new JLabel();
		vPosicao22.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao22.setBounds(new Rectangle(290, 150, 70, 70));
		vPosicao22.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(1,1);
			}
		});
		contentPane.add(vPosicao22);
		
		vPosicao32 = new JLabel();
		vPosicao32.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao32.setBounds(new Rectangle(290, 220, 70, 70));
		vPosicao32.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(2,1);
			}
		});
		contentPane.add(vPosicao32);
		
		vPosicao42 = new JLabel();
		vPosicao42.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao42.setBounds(new Rectangle(290, 290, 70, 70));
		vPosicao42.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(3,1);
			}
		});
		contentPane.add(vPosicao42);
		
		vPosicao52 = new JLabel();
		vPosicao52.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao52.setBounds(new Rectangle(290, 360, 70, 70));
		vPosicao52.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(4,1);
			}
		});
		contentPane.add(vPosicao52);
		
		vPosicao62 = new JLabel();
		vPosicao62.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao62.setBounds(new Rectangle(290, 430, 70, 70));
		vPosicao62.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(5,1);
			}
		});
		contentPane.add(vPosicao62);
		
		vPosicao72 = new JLabel();
		vPosicao72.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao72.setBounds(new Rectangle(290, 500, 70, 70));
		vPosicao72.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(6,1);
			}
		});
		contentPane.add(vPosicao72);
		
		vPosicao82 = new JLabel();
		vPosicao82.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao82.setBounds(new Rectangle(290, 570, 70, 70));
		vPosicao82.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(7,1);
			}
		});
		contentPane.add(vPosicao82);
		
		vPosicao13 = new JLabel();
		vPosicao13.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao13.setBounds(new Rectangle(360, 80, 70, 70));
		vPosicao13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(0,2);
			}
		});
		contentPane.add(vPosicao13);
		
		vPosicao23 = new JLabel();
		vPosicao23.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao23.setBounds(new Rectangle(360, 150, 70, 70));
		vPosicao23.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(1,2);
			}
		});
		contentPane.add(vPosicao23);
		
		vPosicao33 = new JLabel();
		vPosicao33.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao33.setBounds(new Rectangle(360, 220, 70, 70));
		vPosicao33.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(2,2);
			}
		});
		contentPane.add(vPosicao33);
		
		vPosicao43 = new JLabel();
		vPosicao43.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao43.setBounds(new Rectangle(360, 290, 70, 70));
		vPosicao43.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(3,2);
			}
		});
		contentPane.add(vPosicao43);
		
		vPosicao53 = new JLabel();
		vPosicao53.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao53.setBounds(new Rectangle(360, 360, 70, 70));
		vPosicao53.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(4,2);
			}
		});
		contentPane.add(vPosicao53);
		
		vPosicao63 = new JLabel();
		vPosicao63.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao63.setBounds(new Rectangle(360, 430, 70, 70));
		vPosicao63.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(5,2);
			}
		});
		contentPane.add(vPosicao63);
		
		vPosicao73 = new JLabel();
		vPosicao73.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao73.setBounds(new Rectangle(360, 500, 70, 70));
		vPosicao73.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(6,2);
			}
		});
		contentPane.add(vPosicao73);
		
		vPosicao83 = new JLabel();
		vPosicao83.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao83.setBounds(new Rectangle(360, 570, 70, 70));
		vPosicao83.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(7,2);
			}
		});
		contentPane.add(vPosicao83);
		
		vPosicao14 = new JLabel();
		vPosicao14.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao14.setBounds(new Rectangle(430, 80, 70, 70));
		vPosicao14.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(0,3);
			}
		});
		contentPane.add(vPosicao14);
		
		vPosicao24 = new JLabel();
		vPosicao24.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao24.setBounds(new Rectangle(430, 150, 70, 70));
		vPosicao24.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(1,3);
			}
		});
		contentPane.add(vPosicao24);
		
		vPosicao34 = new JLabel();
		vPosicao34.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao34.setBounds(new Rectangle(430, 220, 70, 70));
		vPosicao34.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(2,3);
			}
		});
		contentPane.add(vPosicao34);
		
		vPosicao44 = new JLabel();
		vPosicao44.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao44.setBounds(new Rectangle(430, 290, 70, 70));
		vPosicao44.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(3,3);
			}
		});
		contentPane.add(vPosicao44);
		
		vPosicao54 = new JLabel();
		vPosicao54.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao54.setBounds(new Rectangle(430, 360, 70, 70));
		vPosicao54.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(4,3);
			}
		});
		contentPane.add(vPosicao54);
		
		vPosicao64 = new JLabel();
		vPosicao64.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao64.setBounds(new Rectangle(430, 430, 70, 70));
		vPosicao64.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(5,3);
			}
		});
		contentPane.add(vPosicao64);
		
		vPosicao74 = new JLabel();
		vPosicao74.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao74.setBounds(new Rectangle(430, 500, 70, 70));
		vPosicao74.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(6,3);
			}
		});
		contentPane.add(vPosicao74);
		
		vPosicao84 = new JLabel();
		vPosicao84.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao84.setBounds(new Rectangle(430, 570, 70, 70));
		vPosicao84.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(7,3);
			}
		});
		contentPane.add(vPosicao84);
		
		vPosicao15 = new JLabel();
		vPosicao15.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao15.setBounds(new Rectangle(500, 80, 70, 70));
		vPosicao15.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(0,4);
			}
		});
		contentPane.add(vPosicao15);
		
		vPosicao25 = new JLabel();
		vPosicao25.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao25.setBounds(new Rectangle(500, 150, 70, 70));
		vPosicao25.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(1,4);
			}
		});
		contentPane.add(vPosicao25);
		
		vPosicao35 = new JLabel();
		vPosicao35.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao35.setBounds(new Rectangle(500,220, 70, 70));
		vPosicao35.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(2,4);
			}
		});
		contentPane.add(vPosicao35);
		
		vPosicao45 = new JLabel();
		vPosicao45.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao45.setBounds(new Rectangle(500, 290, 70, 70));
		vPosicao45.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(3,4);
			}
		});
		contentPane.add(vPosicao45);
		
		vPosicao55 = new JLabel();
		vPosicao55.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao55.setBounds(new Rectangle(500, 360, 70, 70));
		vPosicao55.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(4,4);
			}
		});
		contentPane.add(vPosicao55);
		
		vPosicao65 = new JLabel();
		vPosicao65.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao65.setBounds(new Rectangle(500, 430, 70, 70));
		vPosicao65.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(5,4);
			}
		});
		contentPane.add(vPosicao65);
		
		vPosicao75 = new JLabel();
		vPosicao75.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao75.setBounds(new Rectangle(500, 500, 70, 70));
		vPosicao75.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(6,4);
			}
		});
		contentPane.add(vPosicao75);
		
		vPosicao85 = new JLabel();
		vPosicao85.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao85.setBounds(new Rectangle(500, 570, 70, 70));
		vPosicao85.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(7,4);
			}
		});
		contentPane.add(vPosicao85);
		
		vPosicao16 = new JLabel();
		vPosicao16.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao16.setBounds(new Rectangle(570, 80, 70, 70));
		vPosicao16.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(0,5);
			}
		});
		contentPane.add(vPosicao16);
		
		vPosicao26 = new JLabel();
		vPosicao26.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao26.setBounds(new Rectangle(570, 150, 70, 70));
		vPosicao26.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(1,5);
			}
		});
		contentPane.add(vPosicao26);
		
		vPosicao36 = new JLabel();
		vPosicao36.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao36.setBounds(new Rectangle(570, 220, 70, 70));
		vPosicao36.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(2,5);
			}
		});
		contentPane.add(vPosicao36);
		
		vPosicao46 = new JLabel();
		vPosicao46.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao46.setBounds(new Rectangle(570, 290, 70, 70));
		vPosicao46.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(3,5);
			}
		});
		contentPane.add(vPosicao46);
		
		vPosicao56 = new JLabel();
		vPosicao56.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao56.setBounds(new Rectangle(570, 360, 70, 70));
		vPosicao56.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(4,5);
			}
		});
		contentPane.add(vPosicao56);
		
		vPosicao66 = new JLabel();
		vPosicao66.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao66.setBounds(new Rectangle(570, 430, 70, 70));
		vPosicao66.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(5,5);
			}
		});
		contentPane.add(vPosicao66);
		
		vPosicao76 = new JLabel();
		vPosicao76.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao76.setBounds(new Rectangle(570, 500, 70, 70));
		vPosicao76.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(6,5);
			}
		});
		contentPane.add(vPosicao76);
		
		vPosicao86 = new JLabel();
		vPosicao86.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao86.setBounds(new Rectangle(570, 570, 70, 70));
		vPosicao86.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(7,5);
			}
		});
		contentPane.add(vPosicao86);
		
		vPosicao17 = new JLabel();
		vPosicao17.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao17.setBounds(new Rectangle(640, 80, 70, 70));
		vPosicao17.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(0,6);
			}
		});
		contentPane.add(vPosicao17);
		
		vPosicao27 = new JLabel();
		vPosicao27.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao27.setBounds(new Rectangle(640, 150, 70, 70));
		vPosicao27.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(1,6);
			}
		});
		contentPane.add(vPosicao27);
		
		vPosicao37 = new JLabel();
		vPosicao37.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao37.setBounds(new Rectangle(640, 220, 70, 70));
		vPosicao37.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(2,6);
			}
		});
		contentPane.add(vPosicao37);
		
		vPosicao47 = new JLabel();
		vPosicao47.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao47.setBounds(new Rectangle(640, 290, 70, 70));
		vPosicao47.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(3,6);
			}
		});
		contentPane.add(vPosicao47);
		
		vPosicao57 = new JLabel();
		vPosicao57.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao57.setBounds(new Rectangle(640, 360, 70, 70));
		vPosicao57.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(4,6);
			}
		});
		contentPane.add(vPosicao57);
		
		vPosicao67 = new JLabel();
		vPosicao67.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao67.setBounds(new Rectangle(640, 430, 70, 70));
		vPosicao67.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(5,6);
			}
		});
		contentPane.add(vPosicao67);
		
		vPosicao77 = new JLabel();
		vPosicao77.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao77.setBounds(new Rectangle(640, 500, 70, 70));
		vPosicao77.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(6,6);
			}
		});
		contentPane.add(vPosicao77);
		
		vPosicao87 = new JLabel();
		vPosicao87.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao87.setBounds(new Rectangle(640, 570, 70, 70));
		vPosicao87.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(7,6);
			}
		});
		contentPane.add(vPosicao87);
		
		vPosicao18 = new JLabel();
		vPosicao18.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao18.setBounds(new Rectangle(710, 80, 70, 70));
		vPosicao18.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(0,7);
			}
		});
		contentPane.add(vPosicao18);
		
		vPosicao28 = new JLabel();
		vPosicao28.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao28.setBounds(new Rectangle(710, 150, 70, 70));
		vPosicao28.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(1,7);
			}
		});
		contentPane.add(vPosicao28);
		
		vPosicao38 = new JLabel();
		vPosicao38.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao38.setBounds(new Rectangle(710, 220, 70, 70));
		vPosicao38.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(2,7);
			}
		});
		contentPane.add(vPosicao38);
		
		vPosicao48 = new JLabel();
		vPosicao48.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao48.setBounds(new Rectangle(710, 290, 70, 70));
		vPosicao48.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(3,7);
			}
		});
		contentPane.add(vPosicao48);
		
		vPosicao58 = new JLabel();
		vPosicao58.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao58.setBounds(new Rectangle(710, 360, 70, 70));
		vPosicao58.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(4,7);
			}
		});
		contentPane.add(vPosicao58);
		
		vPosicao68 = new JLabel();
		vPosicao68.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao68.setBounds(new Rectangle(710, 430, 70, 70));
		vPosicao68.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(5,7);
			}
		});
		contentPane.add(vPosicao68);
		
		vPosicao78 = new JLabel();
		vPosicao78.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao78.setBounds(new Rectangle(710, 500, 70, 70));
		vPosicao78.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(6,7);
			}
		});
		contentPane.add(vPosicao78);
		
		vPosicao88 = new JLabel();
		vPosicao88.setIcon(new ImageIcon("images/vazio.jpeg"));
		vPosicao88.setBounds(new Rectangle(710, 570, 70, 70));
		vPosicao88.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				clickTabuleiro(7,7);
			}
		});
		contentPane.add(vPosicao88);
		
		
		
		
	}
	
	public void conectar() {
		atorJogador.conectar();
	}
	
	public void iniciarPartida() {
		atorJogador.iniciarPartida();
	}

	public void mostraMensagem(String msg) {
		JOptionPane.showMessageDialog(contentPane, msg);
		
	}

	public String pedeNomeJogador() {
		return JOptionPane.showInputDialog(contentPane, "Qual seu nome?");
	}

	public void posicionarPecasNaInterface() {
		vPosicao61.setIcon(new ImageIcon("images/p_branco.jpeg"));
		vPosicao62.setIcon(new ImageIcon("images/p_branco.jpeg"));
		vPosicao63.setIcon(new ImageIcon("images/p_branco.jpeg"));
		vPosicao64.setIcon(new ImageIcon("images/p_branco.jpeg"));
		vPosicao65.setIcon(new ImageIcon("images/p_branco.jpeg"));
		vPosicao66.setIcon(new ImageIcon("images/p_branco.jpeg"));
		vPosicao67.setIcon(new ImageIcon("images/p_branco.jpeg"));
		vPosicao68.setIcon(new ImageIcon("images/p_branco.jpeg"));
		
		vPosicao81.setIcon(new ImageIcon("images/torre_branca.jpeg"));
		vPosicao82.setIcon(new ImageIcon("images/cavalo_branco.jpeg"));
		vPosicao83.setIcon(new ImageIcon("images/bispo_branco.jpeg"));
		vPosicao84.setIcon(new ImageIcon("images/rei_branco.jpeg"));
		vPosicao85.setIcon(new ImageIcon("images/rainha_branca.jpeg"));
		vPosicao86.setIcon(new ImageIcon("images/bispo_branco.jpeg"));
		vPosicao87.setIcon(new ImageIcon("images/cavalo_branco.jpeg"));
		vPosicao88.setIcon(new ImageIcon("images/torre_branca.jpeg"));
		
		vPosicao31.setIcon(new ImageIcon("images/p_preto.jpeg"));
		vPosicao32.setIcon(new ImageIcon("images/p_preto.jpeg"));
		vPosicao33.setIcon(new ImageIcon("images/p_preto.jpeg"));
		vPosicao34.setIcon(new ImageIcon("images/p_preto.jpeg"));
		vPosicao35.setIcon(new ImageIcon("images/p_preto.jpeg"));
		vPosicao36.setIcon(new ImageIcon("images/p_preto.jpeg"));
		vPosicao37.setIcon(new ImageIcon("images/p_preto.jpeg"));
		vPosicao38.setIcon(new ImageIcon("images/p_preto.jpeg"));
		
		vPosicao11.setIcon(new ImageIcon("images/torre_preta.jpeg"));
		vPosicao12.setIcon(new ImageIcon("images/cavalo_preto.jpeg"));
		vPosicao13.setIcon(new ImageIcon("images/bispo_preto.jpeg"));
		vPosicao14.setIcon(new ImageIcon("images/rainha_preta.jpeg"));
		vPosicao15.setIcon(new ImageIcon("images/rei_preto.jpeg"));
		vPosicao16.setIcon(new ImageIcon("images/bispo_preto.jpeg"));
		vPosicao17.setIcon(new ImageIcon("images/cavalo_preto.jpeg"));
		vPosicao18.setIcon(new ImageIcon("images/torre_preta.jpeg"));
		
	}
	
	public void clickTabuleiro(int i , int j) {
		//atorJogador.clickTabuleiro(i,j);
		JOptionPane.showMessageDialog(contentPane, ""+i+""+j);
	}
}