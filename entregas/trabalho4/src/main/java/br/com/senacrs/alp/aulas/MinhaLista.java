package br.com.senacrs.alp.aulas;

public class MinhaLista<T> implements Lista<T> {

	// com base na logica do meu colega eu tentei fazer o trabalho 4
	// desculpe por não ter me empenhado mais!

	Nodo nodo = new Nodo();
	Nodo nodoNovo = new Nodo();
	Nodo nodoAnterior = new Nodo();
	Nodo<T> inicio = null;

	@Override
	public void adicionarFinal(T valor) {
		// TODO Auto-generated method stub
		adicionarPosicao((Integer) obterPosicao((Integer) null), valor);

	}

	@Override
	public void adicionarInicio(T valor) {
		// TODO Auto-generated method stub
		adicionarPosicao(0, valor);

	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		// TODO Auto-generated method stub
		inicio = (Nodo<T>) obterPosicao(posicao);
		inicio.conteudo = valor;
		nodoNovo = inicio;

	}

	@Override
	public T obterPrimeiro() {
		// TODO Auto-generated method stub
		inicio = (Nodo<T>) obterPosicao(0);
		return inicio.conteudo;

	}

	@Override
	public T obterUltimo() {
		// TODO Auto-generated method stub
		int tamanho = obterTamanho();
		T resultado = obterPosicao(tamanho - 1);
		return resultado;

	}

	@Override
	public T obterPosicao(int posicao) {
		// TODO Auto-generated method stub
		int indice = -1;
		while (posicao != indice) {
			nodo = nodo.proximo;
		}

		return (T) nodo.conteudo;

	}

	@Override
	public int obterTamanho() {
		// TODO Auto-generated method stub
		int resultado = 0;
		while (obterPosicao(resultado) != null) {
			resultado++;
		}

		return resultado;
	}

	@Override
	public T removerPosicao(int posicao) {
		// TODO Auto-generated method stub

		nodoAnterior.proximo = (Nodo) obterPosicao(posicao - 1);
		nodoNovo = (Nodo) obterPosicao(posicao + 1);
		nodoAnterior = nodoNovo;
		nodo = nodoAnterior;
		nodoNovo = (Nodo) obterPosicao(posicao);
		nodoNovo.proximo = null;

		return (T) nodo.conteudo;
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub

		inicio.proximo = null;

	}

}