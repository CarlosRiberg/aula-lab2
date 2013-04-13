package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class MinhaComparatorIntegre<T> implements Comparator<Integer> {

	@Override
	public int compare(Integer arg1, Integer arg2) {

		if (arg1 < arg2) {
			return 1;
		} else {
			return -1;
		}
	}
}
