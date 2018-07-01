package makruk;

public class Jogada implements br.ufsc.inf.leobr.cliente.Jogada {
	public int getLinha1() {
		return linha1;
	}

	public int getColuna1() {
		return coluna1;
	}

	public int getLinha2() {
		return linha2;
	}

	public int getColuna2() {
		return coluna2;
	}

	public boolean isIniciandoContagem() {
		return iniciandoContagem;
	}

	public boolean isContagemIniciada() {
		return contagemIniciada;
	}

	protected int linha1,coluna1,linha2,coluna2;
	protected boolean iniciandoContagem, contagemIniciada;
	
	public Jogada(int linha1, int coluna1, int linha2, int coluna2, boolean iniciandoContagem,
			boolean contagemIniciada) {
		this.linha1 = linha1;
		this.coluna1 = coluna1;
		this.linha2 = linha2;
		this.coluna2 = coluna2;
		this.iniciandoContagem = iniciandoContagem;
		this.contagemIniciada = contagemIniciada;
	}

	public Jogada() {
		// TODO Auto-generated constructor stub
	}
	
	public void inicializar(int linha1, int coluna1, int linha2, int coluna2, boolean iniciandoContagem,
			boolean contagemIniciada) {
		this.linha1 = linha1;
		this.coluna1 = coluna1;
		this.linha2 = linha2;
		this.coluna2 = coluna2;
		this.iniciandoContagem = iniciandoContagem;
		this.contagemIniciada = contagemIniciada;
	}
	
}
