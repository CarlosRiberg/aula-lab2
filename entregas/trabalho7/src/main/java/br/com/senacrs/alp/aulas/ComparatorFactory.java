package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class ComparatorFactory {
	
	private static final ComparatorFactory instancia = new ComparatorFactory();
	
	private ComparatorFactory() {
	}
	
	public Comparator<Integer> criarComparatorParesAntesDeImparesCrescente() {
		
		Comparator<Integer> resultado = null;
		
		//implementar

		resultado = new MinhaComparatorIntegre<Integer>();
		
		return resultado;
	}
	
	public Comparator<String> criarComparatorOrdemAlfabeticaReversa() {
		
		Comparator<String> resultado = null;
		
		//implementar
		
		resultado = new MinhaComparatorString<String>();
		
		return resultado;
	}
	
	public static ComparatorFactory getInstancia() {
		return instancia;
	}
}
