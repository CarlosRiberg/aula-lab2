package br.com.senacrs.alp.aulas;

public class MinhaLista<T> implements Lista<T> {
	
	private Nodo<T> nodo = new Nodo<T>();

	@Override
	public void adicionarFinal(T valor) {
		// TODO Auto-generated method stub
		nodo.conteudo = valor;
		nodo.proximo = (Integer) null;

	}

	@Override
	public void adicionarInicio(T valor) {
		// TODO Auto-generated method stub
		nodo.conteudo = valor;
		nodo.proximo = 0;
	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		// TODO Auto-generated method stub
		Nodo<T> novoNodo = new Nodo<T>();
		nodo.proximo = posicao;
		novoNodo.conteudo = valor;
	}

	@Override
	public T obterPrimeiro() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public T obterUltimo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T obterPosicao(int posicao) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public int obterTamanho() {
		// TODO Auto-generated method stub
		int result = 0;
		while(nodo.proximo != (Integer)null){
			result++;
		}
		
		return result;
	}

	@Override
	public T removerPosicao(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub
		
	}

}
