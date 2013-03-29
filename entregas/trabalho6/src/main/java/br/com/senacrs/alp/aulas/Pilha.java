package br.com.senacrs.alp.aulas;

public interface Pilha<T extends Object> {

	void insercao(T valor);// entrada
	
	T obter();//entrada
	
	T remocao();//inicio
	
	boolean vazia();//esta vazia?

	int tamanho();// quantos elentos tem?
	
	void esvaziar();// esvaziar pilha
}
