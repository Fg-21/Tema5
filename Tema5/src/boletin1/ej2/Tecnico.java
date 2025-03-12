package boletin1.ej2;

public class Tecnico extends Operario{
	/**
	 * Contructor de Directivo con su nombre usando la clase padre Oficial
	 * @param nombre Nombre del Tecnico
	 */
	Tecnico(String nombre){
		super(nombre);
	}
	
	/**
	 * Metodo toString de Tecnico usando el de la clase padre Oficial
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}
