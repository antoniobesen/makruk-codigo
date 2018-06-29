package makruk;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;

public class AtorNetGames implements OuvidorProxy {
	Proxy proxy;
	AtorJogador atorJogador;
	boolean conectado;
	boolean iniciando;
	
	public AtorNetGames(AtorJogador atorJogador) {
		this.atorJogador = atorJogador;
		proxy=Proxy.getInstance();
		proxy.addOuvinte(this);
		conectado = false;
		iniciando = false;
	}

	

	public boolean isConectado() {
		return conectado;
	}



	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}



	public boolean isIniciando() {
		return iniciando;
	}



	public void setIniciando(boolean iniciando) {
		this.iniciando = iniciando;
	}



	public void conectar(String servidor , String nome) {
		try {
			proxy.conectar("localhost", nome);
		} catch (JahConectadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NaoPossivelConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArquivoMultiplayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void iniciarNovaPartida(Integer posicao) {
		atorJogador.tratarInicio(posicao.intValue(), proxy.getNomeJogador());
		
	}
	@Override
	public void finalizarPartidaComErro(String message) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void receberMensagem(String msg) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void receberJogada(Jogada jogada) {
		this.atorJogador.receberJogada(jogada);
		
	}
	@Override
	public void tratarConexaoPerdida() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void tratarPartidaNaoIniciada(String message) {
		// TODO Auto-generated method stub
		
	}

	public void iniciarPartida() {
		try {
			proxy.iniciarPartida(2);
		} catch (NaoConectadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getNomeJogadorAdversario(int posicao) {
		return proxy.obterNomeAdversario(posicao);
	}



	public void enviarJogada(Jogada jogada) {
		try {
			proxy.enviaJogada(jogada);
		} catch (NaoJogandoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
