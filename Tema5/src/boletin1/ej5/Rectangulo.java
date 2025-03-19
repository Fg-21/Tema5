package boletin1.ej5;

/**
 * Clase Rectagulo. Hereda de Poligono y tiene sus atributos para la medida de
 * sus lados, una forma de calcular su area y una forma de representar por
 * consola el tipo de polígono que es, junto a la medida de sus lados
 */
public class Rectangulo extends Poligono {
	/**
	 * Atributo para la medida del primer lado del poligono
	 */
	private double lado1;
	/**
	 * Atributo para la medida del segundo lado del poligono
	 */
	private double lado2;
	
	/**
	 * Constructor del rectangulo usando solo el constructor de la clase padre
	 */
	public Rectangulo() {
		super(4);
	}

	/**
	 * Constructor del rectangulo usando el constructor de la clase padre y la medida de los lados
	 * @param lado1 Medida del lado 1 del rectangulo
	 * @param lado2 Medida del lado 2 del rectangulo
	 */
	public Rectangulo(double lado1, double lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	/**
	 * Getter del primer lado del rectángulo
	 * @return Devuleve el primer lado del rectángulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Setter del primer lado del rectangulo.
	 * @param lado1 Nuevo lado del rectangulo. No puede ser negativo
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Getter del segundo lado del rectángulo
	 * @return Devuleve el segundo lado del rectángulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * 
	 * @param lado2
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	
}
