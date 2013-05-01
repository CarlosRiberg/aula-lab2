package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MeuEmissorMensagens implements EmissorMensagens {
	

	@Override
	public String formatarMensagem(String chave, Object... argumentos) {
		// TODO Auto-generated method stub

		String resultado = null;

		String nome = "Fulano";
		String arg = "Modulo";
		int hora = 10;
		int minuto = 11;

		resultado = new String().format(chave, argumentos);

		return resultado;
	}

	public String[] lerArquivo(String arquivo) {
		
		String[] resultado = null;
		BufferedReader leitor = null;

		leitor = obterBuffer(arquivo);
		resultado = lerBuffer(leitor);

		return resultado;
	}

	private BufferedReader obterBuffer(String arquivo) {

		BufferedReader resultado = null;
		File file = null;
		FileReader reader = null;

		file = obterFileLeitura(arquivo);
		try {
			reader = new FileReader(file);
			resultado = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			throw new IllegalStateException(e);
		}

		return resultado;
	}

	private File obterFileLeitura(String arquivo) {
		File resultado = null;

		verificarNomeArquivo(arquivo);
		resultado = new File(arquivo);
		verificarFile(resultado);

		return resultado;
	}

	private void verificarNomeArquivo(String arquivo) {
		if (arquivo == null) {
			throw new IllegalArgumentException();
		}
		arquivo = arquivo.trim();

	}

	private void verificarFile(File file) {
		if (file == null) {
			throw new IllegalArgumentException();
		}
		if (!file.exists()) {
			throw new IllegalArgumentException();
		}
		if (!file.isFile()) {
			throw new IllegalArgumentException();
		}
		if (!file.canRead()) {
			throw new IllegalArgumentException();
		}
	}

	private String[] lerBuffer(BufferedReader leitor) {
		String[] resultado = null;
		String linha = null;
		List<String> lista = null;

		lista = new ArrayList<String>();

		try {
			linha = leitor.readLine();
			while (linha != null) {
				lista.add(linha);
				linha = leitor.readLine();
			}
			resultado = converterListaArray(lista);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		return resultado;
	}

	private String[] converterListaArray(List<String> lista) {
		String[] resultado = null;

		resultado = new String[lista.size()];
		resultado = lista.toArray(resultado);

		return resultado;
	}

}
