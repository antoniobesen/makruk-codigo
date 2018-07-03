package makruk;

public class Peca {
	
	protected boolean capturada, donoLocal, preta;
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
	
	
	public Peca(boolean donoLocal, Posicao posicao, int tipo, boolean preta) {
		this.donoLocal=donoLocal;
		this.posicao=posicao;
		this.tipo=tipo;
		this.capturada=false;
		this.preta = preta;
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


	public boolean podeMover(Posicao pos, Posicao[][] posicoes) {
		if(this.tipo == 0) {
			if(this.preta==true) {
				if((pos.getLinha() == posicao.getLinha()+1) && pos.getColuna()==posicao.getColuna()
						&& !posicoes[pos.getLinha()][pos.getColuna()].isOcupado())
					return true;
				if(((pos.getLinha() == posicao.getLinha()+1) && pos.getColuna()==posicao.getColuna()+1
						&& posicoes[pos.getLinha()][pos.getColuna()].isOcupado())
						|| ((pos.getLinha() == posicao.getLinha()+1) && pos.getColuna()==posicao.getColuna()-1
								&& posicoes[pos.getLinha()][pos.getColuna()].isOcupado()))
					return true;
				return false;
			}
			else {
				if((pos.getLinha() == posicao.getLinha()-1) && pos.getColuna()==posicao.getColuna()
						&& !posicoes[pos.getLinha()][pos.getColuna()].isOcupado())
					return true;
				if(((pos.getLinha() == posicao.getLinha()-1) && pos.getColuna()==posicao.getColuna()+1
						&& posicoes[pos.getLinha()][pos.getColuna()].isOcupado())
						|| ((pos.getLinha() == posicao.getLinha()-1) && pos.getColuna()==posicao.getColuna()-1
								&& posicoes[pos.getLinha()][pos.getColuna()].isOcupado()))
					return true;
				return false;
			}
		} 
		if(this.tipo==1) {
			if(pos.getLinha()==posicao.getLinha() || pos.getColuna()==posicao.getColuna())
				return true;
		}
		if(this.tipo==2) {
			if((pos.getLinha()==posicao.getLinha()+2 && pos.getColuna()==posicao.getColuna()+1)
				|| (pos.getLinha()==posicao.getLinha()+2 && pos.getColuna()==posicao.getColuna()-1)
				|| (pos.getLinha()==posicao.getLinha()-2 && pos.getColuna()==posicao.getColuna()-1)
				|| (pos.getLinha()==posicao.getLinha()-2 && pos.getColuna()==posicao.getColuna()+1)
				|| (pos.getColuna()==posicao.getColuna()+2 && pos.getLinha()==posicao.getLinha()-1)
				|| (pos.getColuna()==posicao.getColuna()+2 && pos.getLinha()==posicao.getLinha()+1)
				|| (pos.getColuna()==posicao.getColuna()-2 && pos.getLinha()==posicao.getLinha()-1)
                || (pos.getColuna()==posicao.getColuna()-2 && pos.getLinha()==posicao.getLinha()+1))
					return true;
		}
		
		if(this.tipo==3) {
			if(this.preta==true) {
				if(pos.getLinha()==this.posicao.getLinha()+1)
					return true;
			} else {
				if(pos.getLinha()==this.posicao.getLinha()-1)
					return true;
			}
		}
		
		if(this.tipo==4) {
			if((pos.getLinha()==posicao.getLinha()+1 && pos.getColuna()==posicao.getColuna()+1)
					 || (pos.getLinha()==posicao.getLinha()-1 && pos.getColuna()==posicao.getColuna()-1)
					 || (pos.getLinha()==posicao.getLinha()+1 && pos.getColuna()==posicao.getColuna()-1)
					 || (pos.getLinha()==posicao.getLinha()-1 && pos.getColuna()==posicao.getColuna()+1))
						return true;
		}
		
		if(this.tipo==5) {
			if((pos.getLinha()==posicao.getLinha()+1 && (pos.getColuna()==posicao.getColuna()+1 || pos.getColuna()==posicao.getColuna()-1) || pos.getColuna()==posicao.getColuna()) 
					|| (pos.getLinha()==posicao.getLinha()-1 && (pos.getColuna()==posicao.getColuna()+1 || pos.getColuna()==posicao.getColuna()-1) || pos.getColuna()==posicao.getColuna())
					|| (pos.getColuna()==posicao.getColuna()+1 && pos.getLinha()==posicao.getLinha()) 
					|| (pos.getColuna()==posicao.getColuna()-1) && pos.getLinha()==posicao.getLinha())
						return true;
		}
		
		return false;
	}


	public boolean isRei() {
		if(this.tipo==5)
			return true;
		return false;
	}
	
	public String toString() {
		switch(this.tipo) {
		case 0: return "Peao";
		case 1: return "Torre";
		case 2: return "Cavalo";
		case 3: return "Bispo";
		case 4: return "Rainha";
		default: return "Rei";
		}
	}

}
