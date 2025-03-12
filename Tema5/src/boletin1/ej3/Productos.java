package boletin1.ej3;

public class Productos {
	private String nombre;
	private double precio;

	/**
	 * Constructor del producto con todos sus atributos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto, no puede ser negativo
	 */
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	/**
	 * Getter del nombre del producto
	 * 
	 * @return Devuelve el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre del producto
	 * 
	 * @param nombre Nombre nuevo del producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del precio del producto
	 * 
	 * @return Devuelve el precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter del precio del producto. No puede ser negativo
	 * 
	 * @param precio Precio nuevo del producto
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * ToString que devulve la informacion del producto
	 */
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + "  Precio: " + this.precio;
	}

	/**
	 * Metodo para calcular el precio total de un numero de productos iguales
	 * 
	 * @param cantidad Cantidad de productos para calcular el precio final
	 * @return El precio final resultado de multiplicar el precio de ese producto
	 *         por la cantidad de los mismos
	 */
	public double calcular(int cantidad) {
		double precioTotal = this.precio * cantidad;

		return precioTotal;
	}

}
