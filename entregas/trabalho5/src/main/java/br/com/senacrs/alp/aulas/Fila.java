package br.com.senacrs.alp.aulas;

public interface Fila<T extends Object> {

	void insercao(T valor);

	T obter();// não remove, só consulta

	T remocao(); // remove o ultimo
	
	boolean vazia(); // a fila esta vazia?

	int tamanho(); // quantidade de elementos
	
	void esvaziar(); // esvaziar fila
}
