package makruk;

import javax.swing.JOptionPane;

import InterfaceGrafica.InterfaceTabuleiro;

public class AtorJogador {
	
	protected AtorNetGames rede;
	protected Tabuleiro tabuleiro;
	protected String idjogador;
	protected InterfaceTabuleiro interfaceTabuleiro;
	
	
	public AtorJogador(InterfaceTabuleiro interfaceTabuleiro) {
		this.interfaceTabuleiro = interfaceTabuleiro;
		rede = new AtorNetGames(this);
	}
	
	public void conectar() {
		String nome = null;
		if(rede.isConectado())
			interfaceTabuleiro.mostraMensagem("Já conectado");
		else {
			nome=interfaceTabuleiro.pedeNomeJogador();
			rede.conectar("localhost", nome);
			rede.setConectado(true);
			interfaceTabuleiro.mostraMensagem("Conectado com sucesso");
		}
	}
	
	public void iniciarPartida() {
		
		rede.iniciarPartida();
	}

	public void tratarInicio(int posicao, String nomeJogador) {
		
		this.tabuleiro = new Tabuleiro(this);
		tabuleiro.prepararTabuleiro(posicao, nomeJogador);
		
		
	}

	public String getNomeJogadorAdversario(int posicao) {
		return rede.getNomeJogadorAdversario(posicao);
	}

	public void posicionarPecasNaInterface() {
		interfaceTabuleiro.posicionarPecasNaInterface();
		
	}

	public void clickTabuleiro(int i, int j) {
		tabuleiro.clickTabuleiro(i,j);
		
	}

	public void mostraMensagem(String string) {
		interfaceTabuleiro.mostraMensagem(string);
		
	}

	public void atualizaTabuleiroMovimentoSimples(int i1, int j1, int i2,int j2) {
		interfaceTabuleiro.atualizaTabuleiroMovimentoSimples(i1,j1,i2,j2);
		
	}

	public void enviarJogada(Jogada jogada) {
		rede.enviarJogada(jogada);
		
	}

	public void receberJogada(br.ufsc.inf.leobr.cliente.Jogada jogada) {
		this.tabuleiro.receberJogada(jogada);
		
	}
}
