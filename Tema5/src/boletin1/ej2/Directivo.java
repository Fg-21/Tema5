package boletin1.ej2;

public class Directivo extends Empleado {
	
	/**
	 * Contructor de Directivo con su nombre usando la clase padre Empleado
	 * @param nombre Nombre del directivo
	 */
	Directivo(String nombre){
		super(nombre);
	}
	
	/**
	 * Metodo toString de Directivo usando el de la clase padre Empleado
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
}
