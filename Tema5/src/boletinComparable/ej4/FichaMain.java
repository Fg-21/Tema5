package boletinComparable.ej4;

import java.util.Arrays;

public class FichaMain {
	public static void main(String[] args) {
		Ficha lista[] = new Ficha [3];
		
		Ficha f1 = new Ficha(24, "Znaya");
		Ficha f2 = new Ficha(1, "Clat");
		Ficha f3 = new Ficha(10, "Bombo");
		
		lista[0] = f1;
		lista[1] = f2;
		lista[2] = f3;
		
		System.out.println(Arrays.toString(lista));
		
		Arrays.sort(lista);
		
		System.out.println(Arrays.toString(lista));
		
		Arrays.sort(lista, (Ficha a, Ficha b) ->{return a.getTitulo().compareTo(b.getTitulo());});
		
		System.out.println(Arrays.toString(lista));
	}
}
