package boletin1.ej2;

public class Operario extends Empleado {
	
	/**
	 * Contructor de Operario con su nombre usando la clase padre Empleado
	 * @param nombre Nombre del operario
	 */
	Operario(String nombre) {
		super(nombre);
	}
	
	/**
	 * Metodo toString de Operario usando el de la clase padre Empleado
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Operario";
	}
}
