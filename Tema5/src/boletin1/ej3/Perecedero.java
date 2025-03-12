package boletin1.ej3;

public class Perecedero extends Productos {
	// Atributo que indica los dias que le quedan al producto antes de que caduque
	private int diasACaducar;

	/**
	 * Constructor de Perecedero usando su clase padre Producto
	 * 
	 * @param nombre       Nombre del Producto Perecedero
	 * @param precio       Precio del Producto Perecedero
	 * @param diasACaducar Dias para que caduque el Producto Perecedero. No pueden
	 *                     ser negativos
	 */
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * Getter de los dias para que caduque el producto
	 * 
	 * @return Devuelve los dias que quedan para que caduque el producto
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Setter de los dias que quedan para que caduque el producto
	 * 
	 * @param diasACaducar Nuevos dias para que caduque el producto. No puede ser
	 *                     negativo
	 */
	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * Metodo toString para los Productos perecederos usando la clase padre
	 * Productos
	 */
	@Override
	public String toString() {
		return super.toString() + " Días para que caduque: " + this.diasACaducar;
	}

	/**
	 * Metodo que hace lo mismo que su clase padre, pero que ahora dependiendo de
	 * los dias que le queden al producto para caducar, se va reduciendo su precio
	 * progresivamente
	 * 
	 * @param cantidad Cantidad de productos para calcular el precio final
	 * @return El precio final con su reduccion de precio si procede
	 */
	public double calcular(int cantidad) {
		double precioFinal = super.calcular(cantidad);

		switch (this.diasACaducar) {
		case 1 -> {
			precioFinal = precioFinal / 4;
		}
		case 2 -> {
			precioFinal = precioFinal / 3;
		}
		case 3 -> {
			precioFinal = precioFinal / 2;
		}
		}

		return precioFinal;
	}

}
