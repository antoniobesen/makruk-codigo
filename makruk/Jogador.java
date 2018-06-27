package makruk;

public class Jogador {
	protected String nome;
	protected boolean vencedor, jogadorDaVez;
	protected Peca[] pecasCapturadas;
	
	
	public void inicializarJogador(int posicao, String nomeJogador) {
		if(posicao==1)
			this.jogadorDaVez=true;
		else
			this.jogadorDaVez=false;
		pecasCapturadas = new Peca[16];
		vencedor = false;
		setNome(nomeJogador);
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isVencedor() {
		return vencedor;
	}


	public void setVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}


	public boolean isJogadorDaVez() {
		return jogadorDaVez;
	}


	public void setJogadorDaVez(boolean jogadorDaVez) {
		this.jogadorDaVez = jogadorDaVez;
	}


	public Peca[] getPecasCapturadas() {
		return pecasCapturadas;
	}


	public void setPecasCapturadas(Peca[] pecasCapturadas) {
		this.pecasCapturadas = pecasCapturadas;
	}
}
