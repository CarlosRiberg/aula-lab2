package br.com.senacrs.alp.aulas;

public class Somatorio {

	private static Somatorio instancia = new Somatorio();

	private Somatorio() {

		super();
	}

	public double somaTotal(double[] valores) {

		double resultado = 0.0;

		// Implementar

		if (valores == null) {

			resultado = Double.NaN;

		}

		valores = new double[10];
		for (int i = 0; i < valores.length; i++) {
			double val = Math.random();
			valores[i] = val;
			resultado += val;
		}
		
		resultado = valores[0];

		return resultado;
	}

	public static Somatorio getInstancia() {

		return Somatorio.instancia;
	}
}
