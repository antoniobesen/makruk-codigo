package makruk;

import javax.swing.JOptionPane;

public class Tabuleiro {
	
	protected Jogador jogador1, jogador2;
	protected Posicao[][] posicoes = new Posicao[8][8];
	protected boolean fim, emAndamento, primeiroClick, iniciandoContagem, contagemIniciada, empate;
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
		this.fim = false;
		this.contagem = 0;
		
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
						Peca peca = new Peca(false, posicoes[i][j], 3, true);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 3, true);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==7 && (j==2 || j==5)) { //bispos brancos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 3, false);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 3, false);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==0 && (j==1 || j==6)) { //cavalos pretos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 2, true);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 2, true);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==7 && (j==1 || j==6)) { //cavalos brancos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 2, false);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 2, false);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==0 && (j==0 || j==7)) { //torres pretas
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 1, true);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 1, true);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==7 && (j==0 || j==7)) { //torres brancas
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 1, false);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 1, false);
						posicoes[i][j].setPecaOcupante(peca);
				}
				}
				if(i==2) { //peoes pretos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 0, true);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 0, true);
						posicoes[i][j].setPecaOcupante(peca);
					}
				}
				
				if(i==5) { //peoes brancos
					if(posicao==1) {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(true, posicoes[i][j], 0, false);
						posicoes[i][j].setPecaOcupante(peca);
					} else {
						posicoes[i][j] = new Posicao(true, i,j);
						Peca peca = new Peca(false, posicoes[i][j], 0, false);
						posicoes[i][j].setPecaOcupante(peca);
					}
				}
			}
		//rei e rainha pretos
		if(posicao==1) {
			posicoes[0][3] = new Posicao(true, 0,3);
			Peca peca = new Peca(false, posicoes[0][3], 4, true);
			posicoes[0][3].setPecaOcupante(peca);
			posicoes[0][4] = new Posicao(true, 0,4);
			Peca peca1 = new Peca(false, posicoes[0][4], 5, true);
			posicoes[0][4].setPecaOcupante(peca1);
		} else {
			posicoes[0][3] = new Posicao(true, 0,3);
			Peca peca = new Peca(true, posicoes[0][3], 4, true);
			posicoes[0][3].setPecaOcupante(peca);
			posicoes[0][4] = new Posicao(true, 0,4);
			Peca peca1 = new Peca(true, posicoes[0][4], 5, true);
			posicoes[0][4].setPecaOcupante(peca1);
	}
		//rei e rainha brancos
				if(posicao==1) {
					posicoes[7][3] = new Posicao(true, 7,3);
					Peca peca = new Peca(true, posicoes[7][3], 5, false);
					posicoes[7][3].setPecaOcupante(peca);
					posicoes[7][4] = new Posicao(true, 7,4);
					Peca peca1 = new Peca(true, posicoes[7][4], 4, false);
					posicoes[7][4].setPecaOcupante(peca1);
				} else {
					posicoes[7][3] = new Posicao(true, 7,3);
					Peca peca = new Peca(false, posicoes[7][3], 5, false);
					posicoes[7][3].setPecaOcupante(peca);
					posicoes[7][4] = new Posicao(true, 7,4);
					Peca peca1 = new Peca(false, posicoes[7][4], 4, false);
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
	atorJogador.mostraMensagem("Você joga em "+posicao);

	}

	public void clickTabuleiro(int i, int j) {
		if(!jogador1.isJogadorDaVez())
			atorJogador.mostraMensagem("Aguarde sua vez");
		else {
			if(primeiroClick) {
				if(!posicoes[i][j].isOcupado()) {
					atorJogador.mostraMensagem("Clique numa peca");
				}
				else {
					if(posicoes[i][j].getPecaOcupante().isDonoLocal()) {
						this.pecaPrimeiroClick = posicoes[i][j].getPecaOcupante();
						setPrimeiroClick(false);
					} else {
						atorJogador.mostraMensagem("Clique numa peca sua");
					}
				}
			} else {
				boolean podeMover = pecaPrimeiroClick.podeMover(posicoes[i][j]);
				if(!podeMover) {
					atorJogador.mostraMensagem("posicao invalida");
				} else {
					boolean ocupada = posicoes[i][j].isOcupado();
					if(ocupada) {
						Peca ocupante = posicoes[i][j].getPecaOcupante();
						if(ocupante.isDonoLocal()) {
							atorJogador.mostraMensagem("Posicao invalida");
						} else {
							salvaPecaSegundoClick(ocupante);
							pecaPrimeiroClick.getPosicao().setOcupado(false);
							posicoes[i][j].setPecaOcupante(pecaPrimeiroClick);
							pecaPrimeiroClick.setPosicao(posicoes[i][j]);
							if(this.contagemIniciada) {
								incrementarContagem();
								this.fim = verificarFimDaContagem();
							}
							if(fim) {
								atorJogador.mostraMensagem("Fim de jogo. Empate.");
								this.setPartidaEmAndamento(false);
								this.empate=true;
							} else {
								this.pecaSegundoClick.setCapturada(true);
								boolean reiCapturado = this.pecaSegundoClick.isRei();
								if(reiCapturado) {
									this.jogador1.setVencedor(true);
									this.setPartidaEmAndamento(false);
									atorJogador.mostraMensagem("Voce venceu!");
									this.prepararEnvioDeJogada(this.pecaPrimeiroClick,i,j);
								} else {
									
									this.jogador1.setJogadorDaVez(false);
									this.jogador2.setJogadorDaVez(true);
									this.setPrimeiroClick(true);
									atorJogador.atualizaTabuleiroMovimentoSimples(this.pecaPrimeiroClick.getPosicao().getLinha(),
											this.pecaPrimeiroClick.getPosicao().getColuna(), i, j);
									this.prepararEnvioDeJogada(this.pecaPrimeiroClick, i, j);
								}
								
							}
						}
					} else {
						this.pecaPrimeiroClick.getPosicao().setOcupado(false);
						posicoes[i][j].setOcupado(true);
						posicoes[i][j].setPecaOcupante(this.pecaPrimeiroClick);
						this.pecaPrimeiroClick.setPosicao(posicoes[i][j]);
						setPosicaoSegundoClick(posicoes[i][j]);
						
						
						this.jogador1.setJogadorDaVez(false);
						this.jogador2.setJogadorDaVez(true);
						this.setPrimeiroClick(true);
						atorJogador.atualizaTabuleiroMovimentoSimples(this.pecaPrimeiroClick.getPosicao().getLinha(),
								this.pecaPrimeiroClick.getPosicao().getColuna(), i, j);
						this.prepararEnvioDeJogada(this.pecaPrimeiroClick, i, j);
					}
				
				}
			} 
		}
		
	}
	
	public void setPrimeiroClick(boolean primeiro) {
		this.primeiroClick=primeiro;
	}
	
	public void setPosicaoSegundoClick(Posicao pos) {
		this.posicaoSegundoClick=pos;
	}
	
	public void salvaPecaSegundoClick(Peca peca) {
		this.pecaSegundoClick = peca;
	}
	
	public void incrementarContagem() {
		this.contagem=this.contagem+1;
	}
	
	
	//falta implementar
	public boolean verificarFimDaContagem() {
		return false;
	}
	
	public void setPartidaEmAndamento(boolean emAndamento) {
		this.emAndamento=emAndamento;
	}
	
	public void prepararEnvioDeJogada(Peca peca, int i, int j) {
		
	}
	
	
	
	
	
}


