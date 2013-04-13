package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class MinhaComparatorString<T> implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2) * -1;
	
	}
}
