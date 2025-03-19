package boletin1.ej5;

/**
 * Clase Poligono que posee un numero de lados con toString heredado de Object y
 * con el metodo Area que es abstracto porque no se sabe que poligono es
 */
public abstract class Poligono {
	/**
	 * Atributo del numero de lados del poligono
	 */
	private int numeroLados;

	/**
	 * Constructor de Poligono con el numero de lados
	 * 
	 * @param numeroLados Numero de lados del poligono
	 */
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	
	/**
	 * Getter del numero de lados del poligono
	 * @return Devuelve el numero de lados del poligono
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Metodo toString para representar el numero de lados
	 */
	@Override
	public String toString() {
		return "Número de lados:" + this.numeroLados;
	}

	/**
	 * Metodo para calcular el area, es abstracto pues no sabemos que poligono es y
	 * las fórmulas varían
	 * 
	 * @return Devuelve el area del polígono
	 */
	public abstract double area();

}
