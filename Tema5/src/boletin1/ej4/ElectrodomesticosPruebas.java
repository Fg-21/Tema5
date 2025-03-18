package boletin1.ej4;

import java.util.HashSet;

public class ElectrodomesticosPruebas {
	//Creo una lista de electrodomésticos
	static HashSet<Electrodomestico> listaElectrodomesticos = new HashSet<Electrodomestico>();

	public static void main(String[] args) {
	//Objetos electrodomésticos e hijos
	Electrodomestico e1 = new Electrodomestico("BLANCO", "B", 100, 15);
	Lavadora e2 = new Lavadora("GRIS", "C", 400, 50, 8);
	Television e3 = new Television("NEGRO", "C",300, 6, 1080, true);
	
	//Variables para el precio de los electrodomésticos, las lavadoras y las teles
	double precioElectros = 0;
	
	double precioLava = 0;
	
	double precioTV = 0;
	
	//Añado los electrodomésticos a la lista
	listaElectrodomesticos.add(e1);
	listaElectrodomesticos.add(e2);
	listaElectrodomesticos.add(e3);
	
	
	//Recorro la lista y calculo los precios finales dependiendo de las condiciones de cada clase
	for (Electrodomestico electro : listaElectrodomesticos) {
		if (electro instanceof Electrodomestico) {
			electro.precioFinal();
			precioElectros += electro.precioBase; 
		}
		if (electro instanceof Lavadora) {
			electro.precioFinal();
			precioLava += electro.precioBase; 
		}
		
		if (electro instanceof Television) {
			electro.precioFinal();
			precioTV += electro.precioBase; 
		}
	}
	
	//Imprimo los precios finales de todos los electrodomésticos
	System.out.println(precioElectros + "  " + precioLava + "  " + precioTV);
}

}
