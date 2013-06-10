package br.com.senacrs.alp.aulas;

public class Factory {
	
	private static final Factory instancia = new Factory();
	
	private Factory() {
	}
	
	public Configuracao criarConfiguracao(ArquivoConfiguracao config) {
	
		Configuracao resultado = null;
		
		resultado = new MeuArquivo(config);
		
		return resultado;
	}
	
	public static Factory getInstancia() {
		return instancia;
	}
}