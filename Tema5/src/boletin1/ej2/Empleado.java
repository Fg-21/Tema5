package boletin1.ej2;

public class Empleado {
	/**
	 * Nombre del empleado
	 */
	private String nombre;

	/**
	 * Constructor de Empleado con su nombre
	 * 
	 * @param nombre Nombre del Empleado
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del nombre del empleado
	 * 
	 * @return Devuelve el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre del empleado
	 * 
	 * @param nombre Nombre nuevo del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {

		return "Empleado: " + this.nombre;
	}

}
