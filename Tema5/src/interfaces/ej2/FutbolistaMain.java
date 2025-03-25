package interfaces.ej2;

import java.util.Arrays;

public class FutbolistaMain {
public static void main(String[] args) {
	//Lista donde guardar los futbolistas
	Futbolista lista[] = new Futbolista[5];
	
	//Futbolistas
	Futbolista f1 = new Futbolista(7, "Cristiano", 40, 937);
	Futbolista f2 = new Futbolista(10, "Messi", 37, 835);
	Futbolista f3 = new Futbolista(10, "Neymar", 33, 485);
	Futbolista f4 = new Futbolista(20, "Dani Olmo", 25, 56);
	Futbolista f5 = new Futbolista(8, "Pedri", 22, 47);
	
	//Añadimos a la lista
	lista[0] = f1; 
	lista[1] = f2; 
	lista[2] = f3; 
	lista[3] = f4; 
	lista[4] = f5;
	
	//Ordenamos
	Arrays.sort(lista);
	
	//Mostramos por pantalla
	for (Futbolista f : lista) {
		System.out.println(f);
	}
}
}
