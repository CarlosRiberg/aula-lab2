package mapa;

public interface Mapa<C,V> {
	
	V put (C Chane, V valor);
	
	V get(C Chave);
	
	V del (C Chave);

}
