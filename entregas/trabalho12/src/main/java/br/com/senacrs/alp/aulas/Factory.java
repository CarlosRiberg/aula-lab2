package br.com.senacrs.alp.aulas;

public class Factory {
	
	private static final Factory instancia = new Factory();
	
	private Factory() {
	}
	
	public Configuracao criarConfiguracao(ArquivoConfiguracao config) {
	
		Configuracao resultado = null;
		
		if(config == null){
			throw new IllegalArgumentException();
		}
		
		resultado = new MeuArquivoConf(config);
		
		return resultado;
	}
	
	public static Factory getInstancia() {
		return instancia;
	}
}
