package makruk;

import javax.swing.JOptionPane;

public class Tabuleiro {
	
	protected Jogador jogador1, jogador2;
	protected Posicao[][] posicoes = new Posicao[8][8];
	protected boolean emAndamento, primeiroClick, iniciandoContagem, contagemIniciada, empate;
	protected AtorJogador atorJogador;
	protected Peca pecaPrimeiroClick, pecaSegundoClick;
	protected int contagem, contagemMaxima;
	protected Posicao posicaoSegundoClick;
	
	public Tabuleiro(AtorJogador atorJogador) {
		this.atorJogador = atorJogador;
		
	}

	public void prepararTabuleiro(int posicao, String nomeJogador) {
		int posicaoAdv;
		if(posicao==1)
			posicaoAdv = 2;
		else
			posicaoAdv = 1;
		this.primeiroClick = true;
		this.iniciandoContagem=false;
		this.contagemIniciada=false;
		this.emAndamento=false;
		this.empate=false;
		
		this.jogador1 = new Jogador();
		this.jogador1.inicializarJogador(posicao,nomeJogador);
		
		
		String nomeAdversario = atorJogador.getNomeJogadorAdversario(posicaoAdv);
		this.jogador2 = new Jogador();
		this.jogador2.inicializarJogador(posicaoAdv, nomeAdversario);
		
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++) {
				
				if(i==0 && (j==2 || j==5)) { //bispos pretos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 3);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 3);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==7 && (j==2 || j==5)) { //bispos brancos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 3);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 3);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==0 && (j==1 || j==6)) { //cavalos pretos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 2);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 2);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==7 && (j==1 || j==6)) { //cavalos brancos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 2);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 2);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==0 && (j==0 || j==7)) { //torres pretas
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 1);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 1);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==7 && (j==0 || j==7)) { //torres brancas
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 1);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 1);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==2) { //peoes pretos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 0);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 0);
						posicoes[i][j].setPecaOcupante(peca);
					}
				}
				
				if(i==5) { //peoes brancos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 0);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 0);
						posicoes[i][j].setPecaOcupante(peca);
					}
				}
			}
		//rei e rainha pretos
		if(posicao==1) {
			posicoes[0][3] = new Posicao(true, 0,3);
			Peca peca = new Peca(false, posicoes[0][3], 4);
			posicoes[0][3].setPecaOcupante(peca);
			posicoes[0][4] = new Posicao(true, 0,4);
			Peca peca1 = new Peca(false, posicoes[0][4], 5);
			posicoes[0][4].setPecaOcupante(peca1);
		} else {
			posicoes[0][3] = new Posicao(true, 0,3);
			Peca peca = new Peca(true, posicoes[0][3], 4);
			posicoes[0][3].setPecaOcupante(peca);
			posicoes[0][4] = new Posicao(true, 0,4);
			Peca peca1 = new Peca(true, posicoes[0][4], 5);
			posicoes[0][4].setPecaOcupante(peca1);
	}
		//rei e rainha brancos
				if(posicao==1) {
					posicoes[7][3] = new Posicao(true, 7,3);
					Peca peca = new Peca(true, posicoes[7][3], 5);
					posicoes[7][3].setPecaOcupante(peca);
					posicoes[7][4] = new Posicao(true, 7,4);
					Peca peca1 = new Peca(true, posicoes[7][4], 4);
					posicoes[7][4].setPecaOcupante(peca1);
				} else {
					posicoes[7][3] = new Posicao(true, 7,3);
					Peca peca = new Peca(false, posicoes[7][3], 5);
					posicoes[7][3].setPecaOcupante(peca);
					posicoes[7][4] = new Posicao(true, 7,4);
					Peca peca1 = new Peca(false, posicoes[7][4], 4);
					posicoes[7][4].setPecaOcupante(peca1);
			}
		//criando posicoes sem pecas	
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++) {
				if(posicoes[i][j] == null) {
					posicoes[i][j] = new Posicao(false,i,j);
				}
			}
		
	atorJogador.posicionarPecasNaInterface();

	}
	
	
	
	
	
}


