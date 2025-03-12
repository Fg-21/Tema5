package boletin1.ej3;

public class NoPerecederos extends Productos {
	/**
	 * Atributo tipo que indica el tipo de producto no perecedero
	 */
	private String tipo;

	/**
	 * Constructor de NoPerecederos con todos sus atributos mas los de la clase
	 * padre
	 * 
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	public NoPerecederos(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 * Getter del tipo de Producto no perecedero
	 * 
	 * @return Devuelve el tipo de Producto no perecedero
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Setter del tipo de Producto no perecedero
	 * 
	 * @param tipo Tipo de Producto no perecedero
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * ToString de NoPerecederos que añade el tipo de Producto no perecedero
	 */
	@Override
	public String toString() {
		return super.toString() + " Tipo: " + this.tipo;
	}
	
	/**
	 * Metodo para calcular el precio total de un numero de productos iguales
	 * 
	 * @param cantidad Cantidad de productos para calcular el precio final
	 * @return El precio final resultado de multiplicar el precio de ese producto
	 *         por la cantidad de los mismos
	 */
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

}
