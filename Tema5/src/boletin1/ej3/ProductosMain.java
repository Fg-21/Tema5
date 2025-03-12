package boletin1.ej3;

public class ProductosMain {
public static void main(String[] args) {
	Productos p1 = new Productos("Papas", 6);
	Perecedero p2 = new Perecedero("Papas", 6, 1);
	NoPerecederos p3 = new NoPerecederos("Miel", 6, "Liquido");
	
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	
	
	
	System.out.println(p1.calcular(2));
	System.out.println(p2.calcular(2));
	System.out.println(p3.calcular(2));
}
}
