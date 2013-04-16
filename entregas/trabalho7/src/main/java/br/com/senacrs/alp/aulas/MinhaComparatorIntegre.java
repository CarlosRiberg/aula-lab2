package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class MinhaComparatorIntegre<T> implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1 % 2 == 0) { // Se par
			if (o2 % 2 == 0) { // Se par
				if (o1 < o2) // lógica ordem crescente
					return -1;
				else
					return 1;
			}
			// diz que saber compare diferente para impar
			else { // Se impar
				return -1;
			}
		} else {
			if (o2 % 2 != 0) { // Se impar
				if (o1 < o2) // lógica ordem crescente
					return 1;
				else
					return -1;
			}
			// diz que saber compare diferente para par
			else {
				return 1;
			}
		}
	}
}
