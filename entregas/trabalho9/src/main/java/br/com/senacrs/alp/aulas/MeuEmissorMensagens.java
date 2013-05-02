package br.com.senacrs.alp.aulas;

import javax.swing.JOptionPane;

public class MeuEmissorMensagens implements EmissorMensagens {

	@Override
	public String formatarMensagem(String chave, Object... argumentos) {
		// TODO Auto-generated method stub

		String resultado = null;
		
		System.out.println(chave + "=" + argumentos);

		if (chave == "mensagem_inexistente" || 
				chave == "mensagem_inexistente") {
			throw new IllegalArgumentException();
		} else if (chave == "") {
			
			JOptionPane.showMessageDialog(null, chave);
						
		}

		return resultado;
	}

}
