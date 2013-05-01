package br.com.senacrs.alp.aulas;

public class Factory {
	
	private static final Factory instancia = new Factory();
	
	Factory() {
		
	}
	
	public EmissorMensagens criarEmissor(String arquivoEntrada) {
	
		String arquivo = arquivoEntrada;
		
		EmissorMensagens resultado = null;
		
		//implementar
		
		resultado = new MeuEmissorMensagens();
		
		return resultado;
	}
	
	public static Factory getInstancia() {
		return instancia;
	}
}
