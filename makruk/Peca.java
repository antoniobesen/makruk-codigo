package makruk;

public class Peca {
	
	protected boolean capturada, donoLocal;
	protected Posicao posicao;
	protected int tipo;
	/*
	 * tipo 0 = peao
	 * tipo 1 = torre
	 * tipo 2 = cavalo
	 * tipo 3 = bispo
	 * 4=rainha
	 * 5=rei
	 * 6=peao promovido
	 * 
	 */
	
	
	public Peca(boolean donoLocal, Posicao posicao, int tipo) {
		this.donoLocal=donoLocal;
		this.posicao=posicao;
		this.tipo=tipo;
		this.capturada=false;
	}


	public boolean isCapturada() {
		return capturada;
	}


	public void setCapturada(boolean capturada) {
		this.capturada = capturada;
	}


	public boolean isDonoLocal() {
		return donoLocal;
	}


	public void setDonoLocal(boolean donoLocal) {
		this.donoLocal = donoLocal;
	}


	public Posicao getPosicao() {
		return posicao;
	}


	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
