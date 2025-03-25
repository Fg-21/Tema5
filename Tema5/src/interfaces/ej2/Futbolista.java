package interfaces.ej2;

public class Futbolista implements Comparable<Futbolista> {
	/**
	 * Numero de la camiseta
	 */
	private int nCami;
	
	/**
	 * Nombre del futbolista
	 */
	private String nombre;
	
	/**
	 * Edad del futbolista
	 */
	private int edad;
	
	/**
	 * Numero de goles del futbolista
	 */
	private int nGoles;

	/**
	 * Constructor de futbolista con todos sus atributos
	 * @param nCami Numero de camiseta
	 * @param nombre Nombre del futbolista
	 * @param edad Edad del futbolista
	 * @param nGoles Numero de goles del Futbolista
	 */
	public Futbolista(int nCami, String nombre, int edad, int nGoles) {
		this.nCami = nCami;
		this.nombre = nombre;
		this.edad = edad;
		this.nGoles = nGoles;
	}
	
	
	
	/**
	 * Metodo que representa en consola los atributos del futbolista
	 */
	@Override
	public String toString() {
		return "Nº de Camiseta: " + this.nCami + "\nNombre: " + this.nombre + "\nEdad: " + this.edad + "\nNº de Goles: " + this.nGoles + "\n\n";	
	}
	
	
	/**
	 * Metodo equals para comparar dos futbolistas, son iguales cuando tienen el mismo nombre y numero de camiseta
	 */
	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		
		Futbolista f = (Futbolista) obj;
		
		if (this.nCami == f.nCami && this.nombre.equals(f.nombre)) {
			equal = true;
		}
		return equal;
	}


	/**
	 * Metodo compareto para ordenar los futbolistas primero por numero de camiseta y luego por nombre
	 * @param o Objeto futbolista a comparar
	 * @return Devuelve 0 si son iguales, positivo si el invocante es mayor que el argumento y negativo en caso contrario
	 * @Override
	 */
	public int compareTo(Futbolista o) {
		int res = 0;
		if(this.nCami - o.nCami != 0) {
			res = this.nCami - o.nCami;
		}else {
			res = o.nombre.compareTo(this.nombre);
		}
		return res;
	}
	
}
