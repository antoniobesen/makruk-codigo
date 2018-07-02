package makruk;

import javax.swing.JOptionPane;

public class Tabuleiro {
	
	protected Jogador jogador1, jogador2;
	protected Posicao[][] posicoes = new Posicao[8][8];
	protected boolean fim, emAndamento, primeiroClick, iniciandoContagem, contagemIniciada, empate;
	protected AtorJogador atorJogador;
	protected Peca pecaPrimeiroClick, pecaSegundoClick;
	protected int contagem, contagemMaxima;
	protected Posicao posicaoSegundoClick, posicaoPrimeiroClick;
	
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
		
		
		String nomeAdversario = atorJogador.getNomeAdversario(posicaoAdv);
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
	atorJogador.escondeBotaoIniciarPartida();
	atorJogador.mostraPlacar(this.jogador1.getNome(), this.jogador2.getNome());
	atorJogador.mostraMensagem("Você joga em "+posicao);

	}

	public void clickTabuleiro(int i, int j) {
		boolean daVez = jogador1.isJogadorDaVez();
		if(!daVez)
			atorJogador.mostraMensagem("Aguarde sua vez");
		else {
			if(this.primeiroClick) {
				boolean ocupada = posicoes[i][j].isOcupado();
				if(!ocupada) {
					atorJogador.mostraMensagem("Clique numa peca");
				}
				else {
					boolean donoLocal = posicoes[i][j].getPecaOcupante().isDonoLocal();
					if(donoLocal) {
						this.pecaPrimeiroClick = posicoes[i][j].getPecaOcupante();
						setPrimeiroClick(false);
					} else {
						atorJogador.mostraMensagem("Clique numa peca sua");
					}
				} 
			} else {
				boolean podeMover = pecaPrimeiroClick.podeMover(posicoes[i][j] , posicoes);
				if(!podeMover) {
					atorJogador.mostraMensagem("posicao invalida");
					this.setPrimeiroClick(true);
				} else {
					boolean ocupada = posicoes[i][j].isOcupado();
					if(ocupada) {
						Peca ocupante = posicoes[i][j].getPecaOcupante();
						boolean donoLocal = ocupante.isDonoLocal();
						if(donoLocal) {
							atorJogador.mostraMensagem("Posicao invalida");
						} else {
							this.posicaoPrimeiroClick=this.pecaPrimeiroClick.getPosicao();
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
								this.setPartidaEmpatada(true);
							} else {
								this.pecaSegundoClick.setCapturada(true);
								this.jogador1.adicionarPecaCapturada(pecaSegundoClick);
								boolean reiCapturado = this.pecaSegundoClick.isRei();
								if(reiCapturado) {
									this.jogador1.setVencedor(true);
									this.setPartidaEmAndamento(false);
									atorJogador.atualizaTabuleiroMovimentoSimples(this.posicaoPrimeiroClick.getLinha(),
											this.posicaoPrimeiroClick.getColuna(), i, j);
									atorJogador.mostraMensagem("Voce venceu!");
									this.prepararEnvioDeJogada(
											this.posicaoPrimeiroClick.getLinha(),
											this.posicaoPrimeiroClick.getColuna(),i,j);
								} else {
									
									this.jogador1.setJogadorDaVez(false);
									this.jogador2.setJogadorDaVez(true);
									this.setPrimeiroClick(true);
									atorJogador.atualizaTabuleiroMovimentoSimples(this.posicaoPrimeiroClick.getLinha(),
											this.posicaoPrimeiroClick.getColuna(), i, j);
									this.prepararEnvioDeJogada(
											this.posicaoPrimeiroClick.getLinha(),
											this.posicaoPrimeiroClick.getColuna(),i,j);
								}
								
							}
						}
					} else {
						if(this.contagemIniciada) {
							incrementarContagem();
							this.fim = verificarFimDaContagem();
						}
						if(fim) {
							atorJogador.mostraMensagem("Fim de jogo. Empate.");
							this.setPartidaEmAndamento(false);
							this.setPartidaEmpatada(true);
						} else {
						this.pecaPrimeiroClick.getPosicao().setOcupado(false);
						posicoes[i][j].setOcupado(true);
						posicoes[i][j].setPecaOcupante(this.pecaPrimeiroClick);
						this.posicaoPrimeiroClick=this.pecaPrimeiroClick.getPosicao();
						this.pecaPrimeiroClick.setPosicao(posicoes[i][j]);
						setPosicaoSegundoClick(posicoes[i][j]);
						
						
						this.jogador1.setJogadorDaVez(false);
						this.jogador2.setJogadorDaVez(true);
						this.setPrimeiroClick(true);
						atorJogador.atualizaTabuleiroMovimentoSimples(this.posicaoPrimeiroClick.getLinha(),
								this.posicaoPrimeiroClick.getColuna(), i, j);
						this.prepararEnvioDeJogada(
								this.posicaoPrimeiroClick.getLinha(),
								this.posicaoPrimeiroClick.getColuna(),i,j);
						
					}
					
					}
					refinamentoFinalDeJogada(1, this.pecaSegundoClick);
					this.pecaSegundoClick=null;
				
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
		this.contagem++;
	}
	
	
	
	public boolean verificarFimDaContagem() {
		if(this.contagem==this.contagemMaxima) {
			return true;
		}
		return false;
	}
	
	public void setPartidaEmAndamento(boolean emAndamento) {
		this.emAndamento=emAndamento;
	}
	
	public boolean isContagemIniciada() {
		return this.contagemIniciada;
	}
	
	public void prepararEnvioDeJogada(int i1, int j1, int i2, int j2) {
		Jogada jogada = new Jogada();
		jogada.inicializar(i1,j1,i2,j2,this.iniciandoContagem,this.contagemIniciada);
		atorJogador.enviarJogada(jogada);	
	}

	public void receberJogada(br.ufsc.inf.leobr.cliente.Jogada jogada) {
		Jogada jog = (Jogada) jogada;
		int j1 = jog.getColuna1();
		int i1 = jog.getLinha1();
		int i2 = jog.getLinha2();
		int j2 = jog.getColuna2();
		boolean cIniciando = jog.isIniciandoContagem();
		boolean cIniciada = jog.isContagemIniciada();
		
		if(cIniciada) {
			this.incrementarContagem();
			boolean fim = verificarFimDaContagem();
			atorJogador.atualizaContagemInterface(this.contagem);
			if(fim) {
				this.setPartidaEmAndamento(false);
				this.setPartidaEmpatada(true);
				atorJogador.mostraMensagem("Partida empatada");
			}
			
		} else {
			if(cIniciando) {
				this.setContagemMaxima(65);
				this.setContagemIniciada(true);
				this.incrementarContagem();
			}
		}
		Peca peca1 = posicoes[i1][j1].getPecaOcupante();
		Peca pecaCapturada=null;
		boolean ocupada = posicoes[i2][j2].isOcupado();
		if(!ocupada) {
			posicoes[i2][j2].setPecaOcupante(peca1);
			peca1.setPosicao(posicoes[i1][j1]);
			posicoes[i1][j1].setPecaOcupante(null);
			posicoes[i1][j1].setOcupado(false);
			posicoes[i2][j2].setOcupado(true);
		} else {
			pecaCapturada = posicoes[i2][j2].getPecaOcupante();
			posicoes[i2][j2].setPecaOcupante(peca1);
			peca1.setPosicao(posicoes[i1][j1]);
			posicoes[i1][j1].setPecaOcupante(null);
			posicoes[i1][j1].setOcupado(false);
			posicoes[i2][j2].setOcupado(true);
			this.jogador2.adicionarPecaCapturada(pecaCapturada);
			boolean fimDoJogo = pecaCapturada.isRei();
			if(fimDoJogo) {
				this.setPartidaEmAndamento(false);
				this.jogador2.setVencedor(true);
				this.atorJogador.mostraMensagem("Voce perdeu!");
			}
		}
		atorJogador.atualizaTabuleiroMovimentoSimples(i1,
				j1, i2, j2);
		this.jogador1.setJogadorDaVez(true);
		this.jogador2.setJogadorDaVez(false);
		this.refinamentoFinalDeJogada(2, pecaCapturada);
		
	}
	
	public void refinamentoFinalDeJogada(int i , Peca pecaCapturada) {
		boolean iniciada = isContagemIniciada();
		Peca[] pecas;
		if(iniciada) 
			atorJogador.atualizaContagemInterface(this.contagem);
		if(pecaCapturada!=null) {
			if(i==1) {
				pecas = this.jogador1.getPecasCapturadas();
			} else {
				pecas = this.jogador2.getPecasCapturadas();
			}
			atorJogador.atualizarInterfacePlacar(i, pecas);
			
		} 
	}
	
	public void setPartidaEmpatada(boolean empate) {
		this.empate=empate;
	}

	public void iniciarContagem() {
		boolean daVez = this.jogador1.isJogadorDaVez();
		if(!daVez) {
			this.atorJogador.mostraMensagem("Aguarde sua vez para iniciar a contagem");
		} else {
			this.setContagemMaxima(65);
			this.setIniciandoContagem(true);
			this.setContagemIniciada(true);
		}

		
	}

	public void setContagemIniciada(boolean iniciada) {
		this.contagemIniciada=iniciada;
		
	}

	public void setIniciandoContagem(boolean iniciandoContagem) {
		this.iniciandoContagem=iniciandoContagem;
		
	}

	public void setContagemMaxima(int i) {
		this.contagemMaxima=5;
	}
	
	
	
	
	
}


