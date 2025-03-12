package boletin1.ej2;

public class Oficial extends Operario {
	/**
	 * Contructor de Directivo con su nombre usando la clase padre Oficial
	 * @param nombre Nombre del oficial
	 */
	Oficial(String nombre){
		super(nombre);
	}
	
	/**
	 * Metodo toString de Oficial usando el de la clase padre Oficial
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
