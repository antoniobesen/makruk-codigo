package makruk;

public class Peca {
	
	protected boolean capturada, donoLocal;
	protected Posicao posicao;
	protected int tipo;
	
	
	public Peca(boolean donoLocal, Posicao posicao, int tipo) {
		this.donoLocal=donoLocal;
		this.posicao=posicao;
		this.tipo=tipo;
		this.capturada=false;
	}

}
