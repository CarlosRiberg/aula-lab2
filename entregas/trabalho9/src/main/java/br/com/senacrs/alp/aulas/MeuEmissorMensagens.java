package br.com.senacrs.alp.aulas;

public class MeuEmissorMensagens implements EmissorMensagens {

	@Override
	public String formatarMensagem(String chave, Object... argumentos) {
		// TODO Auto-generated method stub
		
		String resultado = null;
		
		resultado = new String().format(chave, argumentos);
		
		
		return resultado;
	}

}
