package br.com.senacrs.alp.aulas;

public class Somatorio {

	private static Somatorio instancia = new Somatorio();

	private Somatorio() {

		super();
	}

	public double somaTotal(double[] valores) {

		double resultado = 0.0;

		if (valores == null) {
			resultado = Double.NaN;
		}

		/* 
		 * Não consegui fazer as duas condições não conflitarem com as outras! 
		 * 
		 * for (int j = 0; j < valores.length; j++) { 
		 * double val = Math.random();
		 * valores[j] = val;
		 * resultado += val;
		 * 
		 * }
		 * 
		 * resultado = valores[0];
		 * 
		 */

		return resultado;
	}

	public static Somatorio getInstancia() {

		return Somatorio.instancia;
	}
}
