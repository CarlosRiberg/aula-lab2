package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class MeuValidarRequisicaoGet implements ValidarRequisicaoGet {

	private static String GET = "GET / http/1.1";
	private static String HOST = "Host: www.google.com";

	@Override
	public boolean ehRequisicaoGetValida(Reader requisicao) {
		boolean resultado = false;

		if (requisicao == null) {
			throw new IllegalArgumentException();
		}

		BufferedReader br = new BufferedReader(requisicao);

		String linha;

		try {
			while ((linha = br.readLine()) != null) {
				String arry[] = linha.split(" ");

				if (arry.equals(GET) && arry.equals(HOST)) {
					resultado = true;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultado;

	}
}