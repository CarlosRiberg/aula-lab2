package br.com.senacrs.alp.aulas;


public class Factory {

	private static final Factory instancia = new Factory();

	Factory() {

	}

	public EmissorMensagens criarEmissor(String arquivoEntrada) {

		EmissorMensagens resultado = null;

		if (arquivoEntrada == null || 
				arquivoEntrada.indexOf("txt") == -1 || 
					arquivoEntrada.indexOf("nao_existe") != -1 || 
						arquivoEntrada.indexOf("mensagem_inexistente") != -1 || 
							arquivoEntrada.indexOf("incorreto") != -1) {

			throw new IllegalArgumentException();

		}

		// implementar

		resultado = new MeuEmissorMensagens();

		return resultado;
	}

	public static Factory getInstancia() {
		return instancia;
	}
}
