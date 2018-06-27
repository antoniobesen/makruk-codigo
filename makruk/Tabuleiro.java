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
		
		inicializaPosicoes();
		

	}
	
	private void inicializaPosicoes() {
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++) {
				if(i==2) {
					posicoes[i][j] = new Posicao();
				}
			}
	}

	
	
	
	
}


