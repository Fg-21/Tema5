package interfaces.ej1;

public class Socio implements Comparable<Socio> {

	/**
	 * Atributo para el id del socio
	 */
	private int id;
	
	/**
	 * Atributo para el nombre del socio
	 */
	private String nombre;
	
	/**
	 * Atributo de la edad del socio
	 */
	private int edad;

	
	/**
	 * Constructor de la clase Socio con todos sus atributos
	 * @param id Id del socio
	 * @param nombre Nombre del socio
	 * @param edad Edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * Metodo toString para representar todos los atributos de la clase socio
	 */
	@Override
	public String toString() {
		return "ID: " + this.id + " Nombre: " + this.nombre + " Edad: " + this.edad;
	}

	
	/**
	 * Metodo para la interfaz comparable basandose en el id de los socios invocante y parámetro
	 */
	@Override
	public int compareTo(Socio o) {		
		return this.id - o.id;
	}
	
	
	
	
}
