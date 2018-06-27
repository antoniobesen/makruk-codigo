package makruk;

public class Posicao {
	
	protected boolean ocupado;
	protected int linha, coluna;
	protected Peca pecaOcupante;
	
	public Posicao(boolean ocupado, int linha, int coluna) {
		this.ocupado=ocupado;
		this.linha=linha;
		this.coluna=coluna;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public Peca getPecaOcupante() {
		return pecaOcupante;
	}
	public void setPecaOcupante(Peca pecaOcupante) {
		this.pecaOcupante = pecaOcupante;
	}
	
}
