package br.com.senacrs.alp.aulas;

public class Factory {

	private static final Factory instancia = new Factory();

	Factory() {

	}

	public EmissorMensagens criarEmissor(String arquivoEntrada) {



		EmissorMensagens resultado = null;
		//recebe as informações do MeuEmissorMensagens e envia informações do arquivoEntrada
		resultado = new MeuEmissorMensagens(arquivoEntrada);

		return resultado;
	}

	public static Factory getInstancia() {
		return instancia;
	}
}
