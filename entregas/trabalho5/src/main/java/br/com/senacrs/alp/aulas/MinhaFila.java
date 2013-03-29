package br.com.senacrs.alp.aulas;


public class MinhaFila<T> implements Fila<T> {

	private Lista<T> lista = ListaFactory.getInstancia().criarLista();

	@Override
	public void insercao(T valor) {
		// TODO Auto-generated method stub
		lista.adicionarFinal(valor);
	}

	@Override
	public T obter() {
		// TODO Auto-generated method stub
		return lista.obterUltimo();
	}

	@Override
	public T remocao() {
		// TODO Auto-generated method stub
		lista.obterUltimo();
		lista.removerPosicao(posicao);
		if (posicao < 0) {

			throw new IllegalArgumentException();

		}
		return null;
	}

	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return lista.obterTamanho();
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub

	}

}
