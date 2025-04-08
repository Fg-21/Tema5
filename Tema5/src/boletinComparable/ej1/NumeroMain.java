package boletinComparable.ej1;

import java.util.Arrays;
import java.util.Comparator;

public class NumeroMain {
	public static void main(String[] args) {
		Integer lista[] = new Integer[3];

		Comparator<Integer> ascendente = (Integer a, Integer b) ->{return a-b;};
		
		
		lista[0] = 1;
		lista[1] = 6;
		lista[2] = 3;
		
		Arrays.sort(lista, (a, b) -> {return b-a;});
		
		System.out.println(Arrays.toString(lista));
		
		Arrays.sort(lista, ascendente);
		
		System.out.println(Arrays.toString(lista));
	}
}
