package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;

public class MeuLeitorArquivos implements LeitorArquivos {

	@Override
	public String[] lerArquivo(String arquivo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] lerArquivoComSubstituicao(String arquivo, String busca,
			String substituicao) {
		// TODO Auto-generated method stub

		String[] resultado = null;
		BufferedReader leitor = null;
		leitor = obterBufferedReader(arquivo);
		resultado = lerBufferedReader(leitor);

		return null;
	}

	private String[] lerBufferedReader(BufferedReader leitor) {
		// TODO Auto-generated method stub
		return null;
	}

	private BufferedReader obterBufferedReader(String arquivo) {
		// TODO Auto-generated method stub
		return null;
	}

}
